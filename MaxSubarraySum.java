import java.util.Scanner;

class MaxSubarraySum 
{

    public static int InnerMaxSubarraySum(int[] nums)
    {
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        sum += nums[i];
        maxSum = Math.max(maxSum, sum);
        if(sum < 0)
        {
            sum = 0;
        }
    }
    return maxSum;    
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
        {
            nums[i] = scan.nextInt();
        }
        int res = InnerMaxSubarraySum(nums);
        System.out.println("The maxsum subarray sum is: "+ res);
    }   
}
