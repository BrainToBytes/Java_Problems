import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of String: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the string one by one: ");
        String[] strs = new String[n];
        for(int i=0; i<n; i++)
        {
            strs[i] =sc.nextLine();
        }

        String res = longestPrefix(strs);
        System.out.println("Longest common prefix is: " + res);
        sc.close();

    }

    public static String longestPrefix(String [] strs)
    {
        if(strs == null || strs.length == 0) return "";

        // Take the first prefix(base)
        String prefix = strs[0];
        int prefixLength = prefix.length();

        // Compare the base with next other words

        for(int i=1; i<strs.length; i++)
        {
            String current = strs[i];
            int j = 0;

            // compare char by char
            while(j < prefixLength && j < current.length() && prefix.charAt(j) == current.charAt(j))
            {
                // count prefix
                j++;
            }

            // char don't match shrink the word
            prefixLength = j;

            // if no prefix found return empty
            if(prefixLength == 0) return "";
        }
        // build final array
        String res = "";
        for(int i=0; i<prefixLength; i++)
        {
            res += prefix.charAt(i);
        }
        return res;
    }
}
