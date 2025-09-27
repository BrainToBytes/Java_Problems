import java.util.Scanner;

public class MedianOfTwoSortedArrays
 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1 = scan.nextInt();
        System.out.println("Enter the array1 elelments: ");
        int[] nums1 = new int[n1];
        for(int i=0;i<n1;i++)
        {
            nums1[i] = scan.nextInt();
        }
        System.out.println("Enter the size os array2: ");
        int n2 = scan.nextInt();
        System.out.println("Enter the array2 elements: ");
        int[] nums2 = new int[n2];
        for(int i=0;i<n2;i++)
        {
            nums2[i] = scan.nextInt();
        }
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median of two sorted array is: " + median );
    }
    

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        if(nums1.length > nums2.length)
        {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length, n2 = nums2.length;
        int low = 0, high = n1;

        while (low <= high)
        {
            int mid1 = (low + high) / 2;
            int mid2 = (n1 + n2 + 1) /2 - mid1;
            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int right1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
            int right2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

            if(left1 <= right2 && left2 <= right1)
            {
                if((n1 + n2) % 2 == 0)
                {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                }
                else
                {
                    return Math.max(left1, left2);
                }
            }
            else if(left1 > right2)
            {
                high = mid1 - 1;
            }
            else
            {
                low = mid1 + 1;
            }
        }
        return 0.0;
    }
}


    



