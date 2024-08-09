class Solution {
    //brute force solution, works but very slow
    // public static int maxProfit(int[] prices) {
    //     int profit = 0;
    //     for (int i = 0; i < prices.length; i++) {
    //         for (int j = i; j < prices.length; j++) {
    //             if ((prices[j] - prices[i]) > profit) {
    //                 profit = prices[j] - prices[i];
    //             }
    //         }
    //     }
    //     if (profit <= 0) {
    //         return 0;
    //     }
    //     return profit;
    // }

    //two pointer solution, much faster
    //mark lowest buy price
    //then see what sell price gives the most profit, which is what we keep
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if ( (prices[i] > buy) && ((prices[i] - buy) > profit) ) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    
    public static void main(String[] args) {
        int[] stock1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(stock1));
    }
}