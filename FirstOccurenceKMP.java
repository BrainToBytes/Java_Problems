import java.util.*;
public class FirstOccurenceKMP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the main String: ");
    String haystack = scan.nextLine();
    System.out.println("Enter the sub String: ");
    String needle = scan.nextLine();
    int index = strStrKMP(haystack, needle);
    System.out.println("The first occurnce string is: " + index);
  }


  public static int strStrKMP(String haystack, String needle)
  {
    int[] lps = computeLPS(needle);
    int i=0, j=0;
    int m = haystack.length();
    int n = needle.length();
    while(i<m)
    {
        if(haystack.charAt(i) == needle.charAt(j))
        {
            i++; j++;
            if(needle.length() == j) return i-j;
        }
        else if(j != 0)
        {
            j = lps[j-1];
        }
        else
        {
            i++;
        }
    }
    return -1;
  }


  public static int[] computeLPS(String pattern)
  {
    int m = pattern.length();
    int[] lps = new int[m];
    int len = 0;
    for(int i=1;i<m;)
    {
        if(pattern.charAt(i) == pattern.charAt(len))
        {
            lps[i++]=++len;
        }
        else if(len != 0)
        {
            len = lps[len-1];
        }
        else
        {
            lps[i++] = 0;
        }
    }
    return lps;
  }
    
}
