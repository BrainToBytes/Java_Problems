import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = scan.nextInt();
        }
        moveZeros(nums);
        System.out.println("After moving all zeros to the end: ");
        printArray(nums);
        scan.close();

    }

    public static void moveZeros(int[] nums)
    {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void printArray(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
