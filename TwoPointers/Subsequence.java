import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean result = isSubsequence(s, t);
        System.out.println(result);
        sc.close();
    }

    public static boolean isSubsequence(String s, String t)
    {
        int i =0, j = 0;
        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++; j++;
            }
            else
            {
                j++;
            }
        }
        return i == s.length();
    }
}
