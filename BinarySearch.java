import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n = scan.nextInt();
        System.out.println("Enter the sorted array Elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the target Element: ");
        int target = scan.nextInt();

        int res = binarySearch(nums, target);
        System.out.println("Target found at index: " + res);
    }


    public static int binarySearch(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;

        while (low <= high) 
        {
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;    
        }
        return -1;
    }
}
