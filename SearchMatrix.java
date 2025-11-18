import java.util.Scanner;

public class SearchMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = scan.nextInt();
        System.out.println("Enter the number of cols: ");
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix Elements: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the target: ");
        int target = scan.nextInt();

        boolean result = searchMatrix(matrix, target);
        System.out.println("Output: " + result);
    }


    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
    }
}