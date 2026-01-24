import java.util.Scanner;

public class BuyandSellStock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] prices = new int[n];

        for(int i=0;i<n;i++)
        {
            prices[i] = scan.nextInt();
        }
         
        int res = maxProfit(prices);
        System.out.println("Maximum profit is " + res);
        scan.close();
    }

    public static int maxProfit(int[] prices)
    {
        if(prices == null || prices.length == 0)
        {
            return 0;
        }
        int buy = prices[0];
        int profit = 0;
        
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else if(prices[i] - buy > profit)
            {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
