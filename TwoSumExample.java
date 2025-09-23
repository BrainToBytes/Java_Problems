import java.util.*;

public class TwoSumExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the size of the array: ");
        int n = scan.nextInt();
        System.out.println("Enter the array Elemnts: ");
        int[] numbers = new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i] = scan.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = scan.nextInt();
        int[] result = twoSum(numbers, target);
        if(result[0] == -1)
        {
            System.out.println("No two numbers add upto the target");
        }
        else
        {
            System.out.println("Indices(1) based: " + Arrays.toString(result));
        }

    }


    public static int[] twoSum(int[] numbers, int target)
    {
        int left = 0; int right = numbers.length-1;
        while(left < right)
        {
            int total = numbers[left] + numbers[right];
            if(total == target) return new int[] {left+1, right+1};
            else if(total > target) right--;
            else left++;
        }
        return new int[] {-1, -1};
    }
}
