import java.util.Scanner;

public class TripletSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(tripletSubsequence(nums));
        sc.close();
    }

    public static boolean tripletSubsequence(int[] nums)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums)
        {
            if(num <= first) first = num;
            else if(num <= second) second = num;
            else return true;       
        }
        return false;
    }
}
