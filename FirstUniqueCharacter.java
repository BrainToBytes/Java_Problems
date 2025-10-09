import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = scan.nextLine();
        int res = firstUniqChar(s);
        System.out.println("The first character uniq index is: " + res);
        scan.close();
    }

    public static int firstUniqChar(String s)
    {
        if(s == null) return -1;

        HashMap<Character, Integer> map  = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
