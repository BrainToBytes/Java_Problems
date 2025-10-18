import java.util.Scanner;

public class RotatedSortedArrayMin {
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
        int res = minimumRotatedSortedArray(nums);
        System.out.println("The min index in rotated sorted array is: " + res);
    }

    public static int minimumRotatedSortedArray(int[] nums)
    {
        int low = 0, high = nums.length - 1, ans = Integer.MAX_VALUE;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[low] <= nums[mid])
            {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
            else
            {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}
