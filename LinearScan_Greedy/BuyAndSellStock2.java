import java.util.Scanner;

public class BuyAndSellStock2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++)
        {
            prices[i] = sc.nextInt();
        }
        System.out.println(buyAndSellStock2(prices));
        sc.close();
    }

    public static int buyAndSellStock2(int[] prices)
    {
        int profit = 0;
        for(int i=0; i<prices.length-1; i++)
        {
            if(prices[i] < prices[i+1])
            {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}
