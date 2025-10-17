import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");;
        int n = sc.nextInt();
        System.out.println("Enter the array Elments: ");
        int[] nums = new int[n];
        for(int i=0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        nextPerm(nums);
        System.out.print("The next permutation is: ");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }

    public static void nextPerm(int[] nums)
    {
        int n = nums.length;
        int index = -1;

        for(int i = n-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            reverse(nums, 0, n-1 );
            return;
        }

        for(int i= n-1; i > index; i--)
        {
            if(nums[i] > nums[index])
            {
                swap(nums, i , index);
                break;
            }
        }
        reverse(nums, index + 1, n - 1);
    }

    public static void swap(int[] nums, int i,int  j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int left, int right)
    {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}