import java.util.Scanner;
public class RotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int res = search(nums, target);
        System.out.println("The index of the traget value is: " + res);
    }


    public static int search(int[] nums, int target)
    {
        int low = 0, high = nums.length-1, mid = 0;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(target == nums[mid]) return mid;


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
        return -1;
    }
}
