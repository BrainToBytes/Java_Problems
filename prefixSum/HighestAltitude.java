import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        System.out.println(largestAltitude(gain));
        sc.close();
    }

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0, maxAltitude = 0;
        
        for(int i=0; i<gain.length; i++)
        {
            currentAltitude += gain[i];
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}
