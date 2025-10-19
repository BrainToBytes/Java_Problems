import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the kth sum: ");
        int k = sc.nextInt();

        int res = subArraySum(nums, k, n);
        System.out.println("The subarray count equals to sum is: " + res);
    }

    public static int subArraySum(int[] nums, int k, int n)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int prefixSum = 0, count = 0;

        for(int x : nums)
        {
            prefixSum += x;
            if(freq.containsKey(prefixSum - k))
            {
                count += freq.get(prefixSum - k);
            }
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
