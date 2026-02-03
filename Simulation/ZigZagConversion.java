import java.util.Scanner;

public class ZigZagConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        System.out.println(convert(s, numRows));
        sc.close();
    }

    public static String convert(String s, int numRows)
    {
        if(numRows == 1 || s.length() <= numRows)
        {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++)
        {
            rows[i] = new StringBuilder();
        }

        int currRow = 0; boolean goingDown = false;

        for(char ch : s.toCharArray())
        {
            rows[currRow].append(ch);

            if(currRow == 0 || currRow == numRows - 1)
            {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows)
        {
            result.append(row);
        }
        return result.toString();
    }
}
