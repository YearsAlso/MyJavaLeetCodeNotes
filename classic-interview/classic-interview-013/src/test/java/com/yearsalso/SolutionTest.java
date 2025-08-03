package com.yearsalso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution类的单元测试
 * Unit tests for Solution class
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    @DisplayName("测试基本功能 - 正数数组")
    /**
     * Test basic functionality - positive number array
     * 输入: [1,2,3,4]
     * 期望输出: [24,12,8,6]
     */
    public void testBasicPositiveNumbers() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "基本正数数组测试失败");
    }

    @Test
    @DisplayName("测试包含负数和零的数组")
    /**
     * Test array containing negative numbers and zeros
     * 输入: [-1,1,0,-3,3]
     * 期望输出: [0,0,9,0,0]
     */
    public void testArrayWithNegativeAndZero() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "包含负数和零的数组测试失败");
    }

    @Test
    @DisplayName("测试单个元素数组")
    /**
     * Test single element array
     * 输入: [5]
     * 期望输出: [1]
     */
    public void testSingleElement() {
        int[] nums = {5};
        int[] expected = {1};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "单个元素数组测试失败");
    }

    @Test
    @DisplayName("测试两个元素数组")
    /**
     * Test two elements array
     * 输入: [2,3]
     * 期望输出: [3,2]
     */
    public void testTwoElements() {
        int[] nums = {2, 3};
        int[] expected = {3, 2};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "两个元素数组测试失败");
    }

    @Test
    @DisplayName("测试包含单个零的数组")
    /**
     * Test array with single zero
     * 输入: [1,0,3,4]
     * 期望输出: [0,12,0,0]
     */
    public void testSingleZero() {
        int[] nums = {1, 0, 3, 4};
        int[] expected = {0, 12, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "包含单个零的数组测试失败");
    }

    @Test
    @DisplayName("测试包含多个零的数组")
    /**
     * Test array with multiple zeros
     * 输入: [0,0,3,4]
     * 期望输出: [0,0,0,0]
     */
    public void testMultipleZeros() {
        int[] nums = {0, 0, 3, 4};
        int[] expected = {0, 0, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "包含多个零的数组测试失败");
    }

    @Test
    @DisplayName("测试全为负数的数组")
    /**
     * Test array with all negative numbers
     * 输入: [-1,-2,-3]
     * 期望输出: [6,3,2]
     */
    public void testAllNegativeNumbers() {
        int[] nums = {-1, -2, -3};
        int[] expected = {6, 3, 2};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "全为负数的数组测试失败");
    }

    @Test
    @DisplayName("测试全为1的数组")
    /**
     * Test array with all ones
     * 输入: [1,1,1,1]
     * 期望输出: [1,1,1,1]
     */
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "全为1的数组测试失败");
    }

    @Test
    @DisplayName("测试空数组")
    /**
     * Test empty array
     * 输入: []
     * 期望输出: []
     */
    public void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result, "空数组测试失败");
    }

    @Test
    @DisplayName("测试较大数组的性能")
    /**
     * Test performance with larger array
     * 输入: 长度为1000的数组
     * 验证: 不超时且结果正确
     */
    public void testLargeArrayPerformance() {
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        int[] result = solution.productExceptSelf(nums);
        assertEquals(1000, result.length, "大数组长度不正确");
        // 验证前几个元素
        for (int i = 0; i < Math.min(10, result.length); i++) {
            assertEquals(1, result[i], "大数组元素值不正确");
        }
    }
}
