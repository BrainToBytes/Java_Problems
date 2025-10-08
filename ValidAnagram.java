import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1 = scan.nextLine();
        System.out.println("Enter the second String: ");
        String s2 = scan.nextLine();
        boolean res = isAnagram(s1, s2);
        if(res)
        {
            System.out.println("Strings Are Anagrams..");
        }
        else
        {
            System.out.println("Strings are not Anangrams...");
        }
    }

    public static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0)
            {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
