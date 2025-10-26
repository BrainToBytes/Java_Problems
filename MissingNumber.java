import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }

        int res = missingNumber(nums);
        System.out.println("Missing number is: "+ res);
    }

    public static int missingNumber(int[] nums)
    {
        int xor = 0;
        int n = nums.length;

        for(int i=0; i<n; i++)
        {
            xor ^= i ^ nums[i];
        }
        xor ^= n;
        return xor;
    }
}
