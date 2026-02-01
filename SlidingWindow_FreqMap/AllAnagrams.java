import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        List<Integer> result = findAllAnagarams(s, p);
        System.out.println(result);
        sc.close();
    }

    public static List<Integer> findAllAnagarams(String s, String p)
    {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        for(char ch : p.toCharArray())
        {
            freqP[ch - 'a']++;
        }

        int windowSize = p.length();
        for(int i=0; i<windowSize; i++)
        {
            freqS[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freqP, freqS))
        {
            ans.add(0);
        }
        for(int i=windowSize; i<s.length(); i++)
        {
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i -windowSize)- 'a']--;
            if(Arrays.equals(freqP, freqS))
            {
                ans.add(i -  windowSize + 1);
            }
        }
        return ans;
    }
}
