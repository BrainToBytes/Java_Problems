
import java.util.Scanner;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
        {
            nums[i] = scan.nextInt();
        }
         System.out.println(maxConsecutiveOne(nums));
         scan.close();
    }

    public static int maxConsecutiveOne(int[] nums)
    {
        int count = 0, maxCount = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 1)
            {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else
            {
                count = 0;
            }
        }
        return maxCount;
    }
}
