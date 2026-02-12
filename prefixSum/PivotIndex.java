import java.util.*;

public class PivotIndex {

    // Method to find pivot index
    public static int pivotIndex(int[] nums) {
        int rightMost = 0;

        // Step 1: Find total sum
        for (int num : nums) {
            rightMost += num;
        }

        int leftMost = 0;

        // Step 2: Traverse array
        for (int i = 0; i < nums.length; i++) {
            rightMost -= nums[i];   // Remove current from right

            if (leftMost == rightMost) {
                return i;
            }

            leftMost += nums[i];    // Add to left
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = pivotIndex(arr);

        if (result == -1)
            System.out.println("No Pivot Index found");
        else
            System.out.println("Pivot Index is: " + result);

        sc.close();
    }
}