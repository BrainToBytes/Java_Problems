import java.util.Scanner;

public class SortColors {
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

        ducthFlag(nums);

        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }

    public static void ducthFlag(int[] nums)
    {
        int start = 0, mid = 0, end = nums.length - 1;

        while(mid <= end)
        {
            switch(nums[mid])
            {
                case 0 :
                swap(nums, start, mid);
                start ++; mid ++;
                break;

                case 1 :
                mid++;
                break;

                case 2 :
                swap(nums, mid, end);
                end--;
                break;
            }
        }
    }
    public static void swap(int[] nums, int left, int right)
    {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
