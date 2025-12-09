import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubsetsWithDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = subsets(nums);

        System.out.println("\nAll subsets without include duplicates: ");
        for(List<Integer> subset: result)
        {
            System.out.println(subset);
        }
        sc.close();
    }

    public static List<List<Integer>> subsets(int [] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));

        for(int i=index; i<nums.length; i++)
        {
            if(i != index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }

}
