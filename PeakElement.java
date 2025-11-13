import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] nums = new int[n];
        for(int i=0;i <n; i++)
        {
            nums[i] = scan.nextInt();
        }
        int res = findPeakElement(nums);
        System.out.println("The Peak Element index: " + res);
        System.out.println("The Peak Element value: " + nums[res]);
    }

    public static int findPeakElement(int[] nums)
    {
        int low = 0, high = nums.length - 1;

        while(low < high)
        {
            int mid = (low + high) / 2;
            if(nums[mid] > nums[mid+1]) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
