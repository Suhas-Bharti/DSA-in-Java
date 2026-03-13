/*
Problem: Best Time to Buy and Sell Stock

Description:
You are given an array where the ith element represents the price of a stock on day i.

You are allowed to buy the stock only once and sell it once in the future.
Find the maximum profit you can achieve from this transaction.

If no profit is possible, return 0.

Example:

Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

Explanation:
Buy on day 2 at price = 1
Sell on day 5 at price = 6

Profit = 6 - 1 = 5

Approach:
1. Track the minimum buying price seen so far.
2. For each day, calculate the possible profit if sold on that day.
3. Update the maximum profit whenever a higher profit is found.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Suhas Bharti
*/

import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int profit = buyAndSellStock(prices);
        System.out.println("Maximum Profit = " + profit);

    }

    // Method to find the maximum profit BuyAndSellStock
    public static int buyAndSellStock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    } 
}