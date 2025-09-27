import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = scan.nextInt();
        System.out.println("ENter the array ELments: ");
        int[] height  = new int[n];
        for(int i=0;i<n;i++)
        {
            height[i] = scan.nextInt();
        }
        
        int res = trap(height);
        System.out.println("Enter the maxTrappedwater: " + res);

    }


    public static int trap(int[] height)
    {
        int left = 0, right = height.length-1;
        int leftMax = 0, rightMax = 0, waterTrapped = 0;

        while(left <= right)
        {
            if(height[left] <= height[right])
            {
                if(height[left] >= leftMax)
                {
                    leftMax  = height[left];
                }
                else
                {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            }
            else
            {
                if(height[right] >= rightMax)
                {
                    rightMax = height[right];
                }
                else
                {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
