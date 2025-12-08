import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
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

        System.out.println("\nAll subsets: ");
        for(List<Integer> subset: result)
        {
            System.out.println(subset);
        }
        sc.close();
    }

    public static List<List<Integer>> subsets(int [] nums)
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findSubsets(0, nums, temp, ans);
        return ans;
    }

    public static void findSubsets(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(temp));

        for(int i=index; i<nums.length; i++)
        {
            temp.add(nums[i]);
            findSubsets(i+1, nums, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }

}
