import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of heights: "); 
       int n = scan.nextInt();
       System.out.println("Enter the heights: ");
       int[] height = new int[n];
       for(int i=0;i<n;i++)
       {
            height[i] = scan.nextInt();
       }
       int res = ContainerWithMostWater.maxWater(height);
       System.out.println("Max Area: " + res);
      

    }

    public static int maxWater(int[] height)
    {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right)
        {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
