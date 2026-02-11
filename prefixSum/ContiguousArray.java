import java.util.*;

public class ContiguousArray {

    // Method to find maximum length of subarray with equal 0s and 1s
    public static int findMaxLength(int[] nums) {

        // Convert 0 to -1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Important initialization

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (only 0 and 1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxLength(nums);

        System.out.println("Maximum length of subarray with equal 0s and 1s: " + result);

        sc.close();
    }
}
