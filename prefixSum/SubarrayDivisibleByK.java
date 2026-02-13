import java.util.*;

public class SubarrayDivisibleByK {

    // Method using Striver's approach
    public static int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case: remainder 0 seen once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            int mod = prefixSum % k;

            // Handle negative remainder
            if (mod < 0) {
                mod += k;
            }

            // If remainder seen before, add its frequency
            if (map.containsKey(mod)) {
                count += map.get(mod);
            }

            // Update frequency of remainder
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = subarraysDivByK(arr, k);

        System.out.println("Number of subarrays divisible by " + k + " is: " + result);

        sc.close();
    }
}
