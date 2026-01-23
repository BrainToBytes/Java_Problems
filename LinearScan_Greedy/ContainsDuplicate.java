package LinearScan_Greedy;
import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;   // duplicate found
            }
            set.add(nums[i]);
        }

        return false; // all elements are unique
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
       System.out.println(containsDuplicate(nums));
        sc.close();
    }

}

