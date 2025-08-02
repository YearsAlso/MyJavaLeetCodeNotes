package com.yearsalso;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Solution.maxProfit method.
 * 测试类：Solution 的 maxProfit 方法
 */
public class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * TC01: 正常波动序列，多次交易
     * Input: [7,1,5,3,6,4]
     * Expected: 7
     */
    @Test
    public void testMaxProfit_NormalCase() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, solution.maxProfit(prices));
    }

    /**
     * TC02: 单调递增序列
     * Input: [1,2,3,4,5]
     * Expected: 4
     */
    @Test
    public void testMaxProfit_Increasing() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, solution.maxProfit(prices));
    }

    /**
     * TC03: 单调递减序列
     * Input: [7,6,4,3,1]
     * Expected: 0
     */
    @Test
    public void testMaxProfit_Decreasing() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    /**
     * TC04: 最小输入（两个元素）
     * Input: [1,2]
     * Expected: 1
     */
    @Test
    public void testMaxProfit_TwoElementsProfitable() {
        int[] prices = {1, 2};
        assertEquals(1, solution.maxProfit(prices));
    }

    /**
     * TC05: 两个元素但无利润
     * Input: [2,1]
     * Expected: 0
     */
    @Test
    public void testMaxProfit_TwoElementsNoProfit() {
        int[] prices = {2, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    /**
     * TC06: 空数组
     * Input: []
     * Expected: 0
     */
    @Test
    public void testMaxProfit_EmptyArray() {
        int[] prices = {};
        assertEquals(0, solution.maxProfit(prices));
    }

    /**
     * TC07: 单元素数组
     * Input: [5]
     * Expected: 0
     */
    @Test
    public void testMaxProfit_SingleElement() {
        int[] prices = {5};
        assertEquals(0, solution.maxProfit(prices));
    }

    /**
     * TC08: 波动序列，多次交易
     * Input: [1,2,1,3,2,4]
     * Expected: 4
     */
    @Test
    public void testMaxProfit_MultipleTrades() {
        int[] prices = {1, 2, 1, 3, 2, 4};
        assertEquals(5, solution.maxProfit(prices));
    }
}
