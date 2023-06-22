class Solution {
    public int maxProfit(int[] prices, int fee) {
        int l =prices.length;
        int maxProfit=0;
        int buy=Integer.MIN_VALUE,sell=0;
        for(int i=0;i<l;i++)
        {
            buy=Math.max(buy,sell-prices[i]);
            sell=Math.max(sell,buy+prices[i]-fee);
        }
        return sell;
    }
}