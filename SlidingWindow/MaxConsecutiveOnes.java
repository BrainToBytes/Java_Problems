import java.util.Scanner;

public class MaxConsecutiveOnes {

    // 🔹 Method for sliding window logic
    public static int longestOnes(int[] nums, int k) {

        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0)
                zeroCount++;

            // shrink window if zeros exceed k
            while (zeroCount > k) {
                if (nums[left] == 0)
                    zeroCount--;
                left++;
            }

            // update maximum valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input array size
        int n = sc.nextInt();

        // read array
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        // input k
        int k = sc.nextInt();

        // call method
        int result = longestOnes(nums, k);

        // output
        System.out.println(result);

        sc.close();
    }
}
