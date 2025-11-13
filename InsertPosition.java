import java.util.Scanner;

public class InsertPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        System.out.println("Enter the sorted Array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = scan.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = scan.nextInt();
        int res = serachInsertposition(nums, target);
        System.out.println("target is: " + res);
    }


    public static int serachInsertposition(int[] nums, int target)
    {
        int low = 0, high = nums.length-1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
