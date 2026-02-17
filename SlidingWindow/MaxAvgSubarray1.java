import java.util.Scanner;

public class MaxAvgSubarray1 {

    // method for sliding window logic
    public static double maxAverage(int[] nums, int k) {

        int sum = 0;

        // first window
        for (int i = 0; i < k; i++)
            sum += nums[i];

        int maxSum = sum;

        // slide window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            if (sum > maxSum)
                maxSum = sum;
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // ✅ reading array INSIDE main()
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int k = sc.nextInt();

        // call method
        double result = maxAverage(nums, k);

        System.out.println(result);

        sc.close();
    }
}
