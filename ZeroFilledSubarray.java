import java.util.Scanner;

public class ZeroFilledSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(zeroFilledSubarray(nums));
        sc.close();
    }
    
    public static long zeroFilledSubarray(int[] nums)
    {
        int count = 0, n = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0) n++;
            else
            {
                count += (n*(n+1)/2);
                n = 0;
            }
        }
        return  count += (n*(n+1)/2);
        
    }
}