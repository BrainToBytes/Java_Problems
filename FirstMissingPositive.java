import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }

        int res = findMissingPositive(nums);
        System.out.println("Missing first positive number is:  " + res);
        sc.close();
    }

    public static int findMissingPositive(int[] nums)
    {
        int n = nums.length;
        int i = 0;

        while (i < n) 
        {
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex])
            {
                swap(nums, i, correctIndex);
            }
            else
            {
                i++;
            }
        }

        for(i=0; i<n; i++)
        {
            if(nums[i] != i + 1)
            {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void swap(int[] nums, int index1, int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
