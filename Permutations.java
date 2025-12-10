import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
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

        List<List<Integer>> result = permute(nums);

        System.out.println("\nAll Permutations: ");
        for(List<Integer> list: result)
        {
            System.out.println(list);
        }
        sc.close();
    }

    public static List<List<Integer>> permute(int [] nums)
    {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans);
        return ans;
    }

    public static void backtrack(int index, int[] nums, List<List<Integer>> ans)
    {
        // base case
        if(index == nums.length)
        {
            List<Integer> temp = new ArrayList<>();
            for(int num : nums)
            {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        
        for(int i=index; i<nums.length; i++)
        {
            swap(nums, i, index); 
            backtrack( index + 1, nums, ans);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
