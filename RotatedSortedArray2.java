import java.util.Scanner;

public class RotatedSortedArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = scan.nextInt();
        System.out.println("Enter the Arry Elements(With Duplicates allowed): ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = scan.nextInt();

        // boolean found = search(nums, target);
        // if(found)
        // {
        //     System.out.println("Target found in array: ");
        // }
        // else
        // {
        //     System.out.println("Target not found in array: ");
        // }

        System.out.println(search(nums, target));
        scan.close();
    }

    public static boolean search(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return true;

            if(nums[low] == nums[mid]  && nums[mid] == nums[low])
            {
                low++; high --; continue;
            }
            else if(nums[low] <= nums[mid])
            {
                if(target >= nums[low] && target < nums[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(target > nums[mid] && target <= nums[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
