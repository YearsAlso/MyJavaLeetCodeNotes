package com.yearsalso;

/**
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2：
 *
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class Solution {
    public int maxProfitOldError(int[] prices) {
        int result = 0;

        if (prices.length <= 1) {
            return result;
        }

        // 向一个值之后找到最大值，作为卖出时间
        int maxVal = prices[1];
        int maxIndex = 1;
        for (int j = 1; j < prices.length; j++) {
            // 这里的等于很关键，可以扩大搜索范围，再更大的范围中获取最小的值
            if (maxVal <= prices[j]) {
                maxVal = prices[j];
                maxIndex = j;
            }
        }

        // 在卖出时间之前找到买入时间
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < maxIndex; i++) {
            if (minVal > prices[i]) {
                minVal = prices[i];
            }
        }

        if (maxVal < minVal) {
            return 0;
        }
        result = maxVal - minVal;

        return result;
    }

    public int maxProfit(int[] prices) {
        // 判空处理
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];       // 记录到目前为止的最低价格
        int maxProfit = 0;              // 记录到目前为止的最大利润

        for (int i = 1; i < prices.length; i++) {
            // 如果当前价格更低，则更新最低价格
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // 否则计算当前卖出的利润，并更新最大利润
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
