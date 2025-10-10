import java.util.Scanner;

public class StringCharacterReplacement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the main String: ");
        String s = scan.nextLine();
        System.out.println("Enter the window size: ");
        int k = scan.nextInt();
        int res = charReplacement(s, k);
        System.out.println("The maximum length of the string is: " + res);
        scan.close();
    }

    public static int charReplacement(String s, int k)
    {
        int[] count = new int[26];
        int left = 0, right = 0;
        int maxFreq = 0, maxLen = 0;

        while(right < s.length())
        {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            while ((right -  left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
