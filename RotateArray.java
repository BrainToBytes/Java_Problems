import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] nums  = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter k(number of rotations): ");
        int k = scan.nextInt();
        rotatedArray(nums, k);
        System.out.println("After rotated array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotatedArray(int[] nums, int k)
    {
        int n = nums.length;
        k = k % n;
        int [] rotated = new int[n];

        for(int i=0;i<n;i++)
        {
            rotated[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = rotated[i];
        }
    }
}
