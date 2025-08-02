package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution类的单元测试
 *
 * @author TestEngineer
 * @version 1.0
 */
public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * Test Case 001: 基本功能测试 - 示例1
     * 输入: [7,1,5,3,6,4]
     * 期望输出: 5
     * 测试目的: 验证基本的利润计算功能
     */
    @Test
    @DisplayName("TC001: 基本功能测试 - 示例1")
    public void testMaxProfitExample1() {
        // Given
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "在第2天买入(价格1)，第5天卖出(价格6)，应获得利润5");
    }

    /**
     * Test Case 002: 递减数组测试 - 示例2
     * 输入: [7,6,4,3,1]
     * 期望输出: 0
     * 测试目的: 验证无法获利时返回0
     */
    @Test
    @DisplayName("TC002: 递减数组测试 - 示例2")
    public void testMaxProfitExample2() {
        // Given
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "股票价格持续下跌，无法获利，应返回0");
    }

    /**
     * Test Case 003: 空数组边界测试
     * 输入: []
     * 期望输出: 0
     * 测试目的: 验证空数组的边界处理
     */
    @Test
    @DisplayName("TC003: 空数组边界测试")
    public void testMaxProfitEmptyArray() {
        // Given
        int[] prices = {};
        int expected = 0;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "空数组无法进行交易，应返回0");
    }

    /**
     * Test Case 004: 单元素数组测试
     * 输入: [1]
     * 期望输出: 0
     * 测试目的: 验证单元素数组的边界处理
     */
    @Test
    @DisplayName("TC004: 单元素数组测试")
    public void testMaxProfitSingleElement() {
        // Given
        int[] prices = {1};
        int expected = 0;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "只有一个价格点，无法进行买卖交易，应返回0");
    }

    /**
     * Test Case 005: 两元素递增数组测试
     * 输入: [1,2]
     * 期望输出: 1
     * 测试目的: 验证最小有效交易数组
     */
    @Test
    @DisplayName("TC005: 两元素递增数组测试")
    public void testMaxProfitTwoElementsIncreasing() {
        // Given
        int[] prices = {1, 2};
        int expected = 1;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第一天买入(价格1)，第二天卖出(价格2)，应获得利润1");
    }

    /**
     * Test Case 006: 两元素递减数组测试
     * 输入: [2,1]
     * 期望输出: 0
     * 测试目的: 验证两元素递减情况
     */
    @Test
    @DisplayName("TC006: 两元素递减数组测试")
    public void testMaxProfitTwoElementsDecreasing() {
        // Given
        int[] prices = {2, 1};
        int expected = 0;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第一天价格高第二天价格低，无法获利，应返回0");
    }

    /**
     * Test Case 007: 完全递增数组测试
     * 输入: [1,2,3,4,5]
     * 期望输出: 4
     * 测试目的: 验证完全递增序列的最大利润
     */
    @Test
    @DisplayName("TC007: 完全递增数组测试")
    public void testMaxProfitCompletelyIncreasing() {
        // Given
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第一天买入(价格1)，最后一天卖出(价格5)，应获得利润4");
    }

    /**
     * Test Case 008: 完全递减数组测试
     * 输入: [5,4,3,2,1]
     * 期望输出: 0
     * 测试目的: 验证完全递减序列无法获利
     */
    @Test
    @DisplayName("TC008: 完全递减数组测试")
    public void testMaxProfitCompletelyDecreasing() {
        // Given
        int[] prices = {5, 4, 3, 2, 1};
        int expected = 0;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "股票价格持续下跌，无法获利，应返回0");
    }

    /**
     * Test Case 009: 复杂波动数组测试
     * 输入: [2,4,1,7,3]
     * 期望输出: 6
     * 测试目的: 验证复杂价格波动情况下的最优交易
     */
    @Test
    @DisplayName("TC009: 复杂波动数组测试")
    public void testMaxProfitComplexFluctuation() {
        // Given
        int[] prices = {2, 4, 1, 7, 3};
        int expected = 6;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第3天买入(价格1)，第4天卖出(价格7)，应获得利润6");
    }

    /**
     * Test Case 010: 边界值测试 - 示例1
     * 输入: [7,1,5,3,6,4]
     * 期望输出: 5
     * 测试目的: 验证边界值测试
     */
    @Test
    @DisplayName("TC010: 边界值测试 - 示例1")
    public void testMaxProfitBoundaryValueExample1() {
        // Given
        int[] prices = {2,1,2,1,0,1,2};
        int expected = 2;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第5天买入(价格0)，第7天卖出(价格2)，应获得利润2");
    }

    @Test
    @DisplayName("TC011: 边界值测试 - 示例2")
    public void testMaxProfitBoundaryValueExample2() {
        // Given
        int[] prices = {3,3,5,0,0,3,1,4};
        int expected = 4;

        // When
        int actual = solution.maxProfit(prices);

        // Then
        assertEquals(expected, actual, "第4天买入(价格0)，第8天卖出(价格4)，应获得利润4");
    }

}
