package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 * Majority Element Solution Test Class
 * 多数元素解决方案测试类
 */
public class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * Test Case 1: Basic odd length array
     * 测试用例1：基本奇数长度数组
     * Input: [3,2,3]
     * Expected: 3
     */
    @Test
    @DisplayName("测试奇数长度数组 - [3,2,3]")
    public void testOddLengthArray() {
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        assertEquals(3, result, "多数元素应该是3");
    }

    /**
     * Test Case 2: Even length array with distributed majority element
     * 测试用例2：偶数长度数组，多数元素分散
     * Input: [2,2,1,1,1,2,2]
     * Expected: 2
     */
    @Test
    @DisplayName("测试偶数长度数组 - [2,2,1,1,1,2,2]")
    public void testEvenLengthArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        assertEquals(2, result, "多数元素应该是2");
    }

    /**
     * Test Case 3: Single element array
     * 测试用例3：单个元素数组
     * Input: [1]
     * Expected: 1
     */
    @Test
    @DisplayName("测试单个元素数组 - [1]")
    public void testSingleElementArray() {
        int[] nums = {1};
        int result = solution.majorityElement(nums);
        assertEquals(1, result, "多数元素应该是1");
    }

    /**
     * Test Case 4: All elements are the same
     * 测试用例4：所有元素相同
     * Input: [5,5,5,5]
     * Expected: 5
     */
    @Test
    @DisplayName("测试所有元素相同 - [5,5,5,5]")
    public void testAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        int result = solution.majorityElement(nums);
        assertEquals(5, result, "多数元素应该是5");
    }

    /**
     * Test Case 5: Minimum array length (2 elements)
     * 测试用例5：最小数组长度（2个元素）
     * Input: [1,1]
     * Expected: 1
     */
    @Test
    @DisplayName("测试最小数组长度 - [1,1]")
    public void testMinimumLengthArray() {
        int[] nums = {1, 1};
        int result = solution.majorityElement(nums);
        assertEquals(1, result, "多数元素应该是1");
    }

    /**
     * Test Case 6: Majority element appears just over half
     * 测试用例6：多数元素出现次数刚好超过一半
     * Input: [1,2,1,1,3,1,1] (length=7, majority count=5)
     * Expected: 1
     */
    @Test
    @DisplayName("测试多数元素刚好超过一半 - [1,2,1,1,3,1,1]")
    public void testMajorityJustOverHalf() {
        int[] nums = {1, 2, 1, 1, 3, 1, 1};
        int result = solution.majorityElement(nums);
        assertEquals(1, result, "多数元素应该是1");
    }

    /**
     * Test Case 7: Array with negative numbers
     * 测试用例7：包含负数的数组
     * Input: [2,-1,2,-1,2]
     * Expected: 2
     */
    @Test
    @DisplayName("测试包含负数的数组 - [2,-1,2,-1,2]")
    public void testArrayWithNegativeNumbers() {
        int[] nums = {2, -1, 2, -1, 2};
        int result = solution.majorityElement(nums);
        assertEquals(2, result, "多数元素应该是2");
    }

    /**
     * Test Case 8: Array containing zero
     * 测试用例8：包含0的数组
     * Input: [0,1,0,0,2,0,0]
     * Expected: 0
     */
    @Test
    @DisplayName("测试包含0的数组 - [0,1,0,0,2,0,0]")
    public void testArrayWithZero() {
        int[] nums = {0, 1, 0, 0, 2, 0, 0};
        int result = solution.majorityElement(nums);
        assertEquals(0, result, "多数元素应该是0");
    }
}
