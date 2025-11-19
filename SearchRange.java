import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the target Element: ");
        int target = scan.nextInt();

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        System.out.println("[" + first + ", " + last + "]");
    }


    public static int findFirst(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;
        int first = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target) 
            {
                first = mid; high = mid - 1;
            }
            else if(nums[mid] < target) 
            {
                 low = mid + 1;
            }  
            else 
            {
                 high = mid - 1;
            } 
        }
        return first;
    }

    public static int findLast(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;
        int last = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target) 
            {
                last = mid; low = mid + 1;
            }
            else if(nums[mid] < target) 
            {
                 low = mid + 1;
            }  
            else 
            {
                 high = mid - 1;
            } 
        }
        return last;
    }
}
