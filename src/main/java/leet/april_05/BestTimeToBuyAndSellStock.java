package leet.april_05;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int fim = 0, lucro = 0;
        while (++fim < prices.length) {
            if (prices[fim] >= prices[fim - 1]) lucro += prices[fim] - prices[fim - 1];
        }
        return lucro;
    }
}
