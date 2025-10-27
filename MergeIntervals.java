import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of intervals: ");
        int n = sc.nextInt();

        int[][] intervals= new int[n][2];
        System.out.println("Enter intervals (start:end): ");
        for(int i=0; i<n; i++)
        {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] merged = merge(intervals);
        System.out.println("\n Merged intervals:");
        for(int[] interval : merged)
        {
            System.out.println(Arrays.toString(interval));
        }
        sc.close();
    }

    public static int[][] merge(int[][] intervals)
    {
        if(intervals.length <= 1) return intervals;

        ArrayList<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals)
        {
            if(interval[0] <= newInterval[1])
            {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else
            {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
