package interview150.arrayOrString;
/*
    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.

    Constraints:
    1 <= prices.length <= 3 * 10^4
    0 <= prices[i] <= 10^4

    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    GFG article: https://www.geeksforgeeks.org/stock-buy-sell/
 */
public class BestTimeToBuyAndSellStockII {

    /*
        The idea is get all the positive segments in the prices graph.
        time O(n) - where n = prices.length
        space O(1)
     */
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++) {
            if(prices[i-1]<prices[i])
                maxProfit+=prices[i]-prices[i-1];
        }

        return maxProfit;
    }

}
