import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        int res = atoi(s);
        System.out.println("Converted integer: "+ res);
    }

    public static int atoi(String s)
    {
        int i = 0, n = s.length();
        int sign = 1;
        long num = 0;

        // skip leading or trailing spaces

        while(i < n && s.charAt(i) == ' ') i++;

        // check sign

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-'))
        {
            if(s.charAt(i) == '-') sign = -1;
            i++;
        }

        // covert to inetger or Itereate over integers

        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9')
        {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // check overflow and underflow before adding to the result

            if(sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        // return the result

        return (int) (num * sign);
    }
}
