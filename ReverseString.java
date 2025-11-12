import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        String reversedStr = reverse(input);
        System.out.println("Reversed string is: " + reversedStr);

    }

    public static String reverse(String s)
    {
       String reversed = "";
       for(int i = s.length()-1; i>=0; i--)
       {
            reversed += s.charAt(i);
       }
       return reversed;
    }
}