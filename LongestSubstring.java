import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.nextLine();
        int res = lengthOfLongestSubstring(s);
        System.out.println("The length of longest substring is: " + res);
        scan.close();

    }

    public static int lengthOfLongestSubstring(String s)
    {
        int left = 0, maxLen = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0; right<n; right++)
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch))
            {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
