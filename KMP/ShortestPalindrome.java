import java.util.Scanner;

public class ShortestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(shortestPalindrome(s));
        sc.close();
    }

    public static String shortestPalindrome(String s)
    {
        if(s.length() == 0) return s;

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

        int[] lps = new int[combined.length()];
        int i = 1, len = 0;

        while(i < combined.length())
        {
            if(combined.charAt(i) == combined.charAt(len))
            {
                lps[i++] = ++len;
            }
            else
            {
                if(len != 0)
                {
                    len = lps[len - 1];
                }
                else
                {
                    lps[i++] = 0;
                }
            }
        }

        int charsToAdd = s.length() - lps[combined.length() - 1];
        return rev.substring(0, charsToAdd) + s;
    }
}
