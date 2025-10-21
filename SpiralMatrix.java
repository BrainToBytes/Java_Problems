import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = takeInput();
        ArrayList<Integer> spiral = spiralOrder(matrix);
        System.out.println("Spiral Order:");
        for(int num : spiral)
        {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n-1;
        int left = 0, right = m-1;

        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom)
            {
                for(int i=right; i>=left; i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static int[][] takeInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements row by row: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}
