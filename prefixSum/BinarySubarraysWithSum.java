import java.util.*;

public class BinarySubarraysWithSum  {

    // Method to count subarrays with sum <= goal
    public static int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // number of valid subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }

    // Method to count subarrays with exact sum = goal
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input elements (0 or 1)
        System.out.println("Enter binary array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input goal
        System.out.print("Enter goal sum: ");
        int goal = sc.nextInt();

        // Call method
        int result = numSubarraysWithSum(nums, goal);

        // Output
        System.out.println("Number of subarrays = " + result);

        sc.close();
    }
}
