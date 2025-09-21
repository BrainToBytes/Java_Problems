import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] nums = new int[k];
        for(int i=0;i<k;i++)
        {
            nums[i] = scan.nextInt();
        }
        int res = removeDuplicates(nums);
        System.out.println("Array After removing duplicates: ");
        for(int i=0;i<res;i++)
        {
            System.out.print(nums[i] + " ");
        }
        scan.close();
    }

    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 0) return 0;
        int i=1;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j] != nums[i-1])
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
