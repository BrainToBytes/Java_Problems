import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String res = longestPalindrome(s);
        System.out.println("The length of the longest palindromic substring is: " + res);
        sc.close();

    }

    public static String longestPalindrome(String s)
    {
        int n = s.length();
        if(n == 0) return "";

        int start  = 0, maxLen = 1;

        for(int i=0; i<n; i++)
        {
            int left = i, right = i;

            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right))
            {
                int len = right - left + 1;
                if(len > maxLen)
                {
                    start = left;
                    maxLen = len;
                }
                left--; right++;
            }

            left = i; right = i + 1;

            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right))
            {
                int len = right - left + 1;
                if(len > maxLen)
                {
                    start = left;
                    maxLen = len;
                }
                left--; right++;
            }            
        }

        String ans = "";
        for(int i=start; i<start + maxLen; i++)
        {
            ans += s.charAt(i);
        }
        return ans;
    }
}
