import java.util.*;

public class RangeSumQuery {

    // Instance variable to store prefix sums
    int[] prefix;

    // Constructor to build prefix sum array
    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefix = new int[n];

        if (n > 0) {
            prefix[0] = nums[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }
    }

    // Method to return range sum
    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

    // Main method (user input)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object (constructor builds prefix sum)
        RangeSumQuery obj = new RangeSumQuery(nums);

        // Number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter queries (left right):");
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            int ans = obj.sumRange(left, right);
            System.out.println("Sum from " + left + " to " + right + " = " + ans);
        }

        sc.close();
    }
}
