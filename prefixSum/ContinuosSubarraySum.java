import java.util.*;

public class ContinuosSubarraySum {

    // Method implementing Striver's logic
    public static boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // handles subarray starting from index 0

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];
            int rem = prefixSum % k;

            // handle negative remainder safely
            if (rem < 0) rem += k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);

                // length must be >= 2
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                // store only first occurrence
                map.put(rem, i);
            }
        }

        return false;
    }

    // Main method for user input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Call method
        boolean result = checkSubarraySum(nums, k);

        // Output result
        if (result) {
            System.out.println("True (Valid subarray exists)");
        } else {
            System.out.println("False (No valid subarray)");
        }

        sc.close();
    }
}
