import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s)?"Yes":"No");
    }

    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase().replaceAll("[^A-za-z0-9]", "");
        int left = 0, right = s.length()-1;

        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++; right--;
        }
        return true;
    }
}
