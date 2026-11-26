class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l = 0, r = 1;
        while( r < prices.length) {
            if(prices[r] < prices[l]) {
                l = r;
                System.out.println("Profit " + profit);
            }
            profit = Math.max(profit, prices[r] - prices[l]);
            System.out.println("Profit - out " + profit);
            r++;
        }
        return profit;
    }
}
