package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 * Solution类的单元测试
 * Testing for array rotation functionality
 */
public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * 测试用例1: 基本轮转功能
     * Test case 1: Basic rotation functionality
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 预期输出: [5,6,7,1,2,3,4]
     */
    @Test
    @DisplayName("测试基本轮转功能 - Basic rotation test")
    public void testBasicRotation() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        solution.rotate(nums, 3);
        assertArrayEquals(expected, nums, "数组应该向右轮转3个位置");
    }

    /**
     * 测试用例2: k为0的情况
     * Test case 2: k = 0 case
     * 输入: nums = [1,2,3], k = 0
     * 预期输出: [1,2,3]
     */
    @Test
    @DisplayName("测试k为0时不改变数组 - Test k=0 case")
    public void testRotationWithZeroK() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3};
        solution.rotate(nums, 0);
        assertArrayEquals(expected, nums, "当k=0时数组应该保持不变");
    }

    /**
     * 测试用例3: k等于数组长度
     * Test case 3: k equals array length
     * 输入: nums = [1,2,3], k = 3
     * 预期输出: [1,2,3]
     */
    @Test
    @DisplayName("测试k等于数组长度时数组不变 - Test k=arrays length")
    public void testRotationWithKEqualsLength() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3};
        solution.rotate(nums, 3);
        assertArrayEquals(expected, nums, "当k等于数组长度时数组应该保持不变");
    }

    /**
     * 测试用例4: k大于数组长度
     * Test case 4: k greater than array length
     * 输入: nums = [1,2], k = 3
     * 预期输出: [2,1]
     */
    @Test
    @DisplayName("测试k大于数组长度时的取模运算 - Test k>length with modulo")
    public void testRotationWithKGreaterThanLength() {
        int[] nums = {1, 2};
        int[] expected = {2, 1};
        solution.rotate(nums, 3);
        assertArrayEquals(expected, nums, "当k大于数组长度时应正确进行取模运算");
    }

    /**
     * 测试用例5: 单元素数组
     * Test case 5: Single element array
     * 输入: nums = [1], k = 1
     * 预期输出: [1]
     */
    @Test
    @DisplayName("测试单元素数组 - Test single element array")
    public void testSingleElementArray() {
        int[] nums = {1};
        int[] expected = {1};
        solution.rotate(nums, 1);
        assertArrayEquals(expected, nums, "单元素数组轮转后应该保持不变");
    }

    /**
     * 测试用例6: 两元素数组轮转
     * Test case 6: Two elements array rotation
     * 输入: nums = [1,2], k = 1
     * 预期输出: [2,1]
     */
    @Test
    @DisplayName("测试两元素数组轮转 - Test two elements rotation")
    public void testTwoElementsRotation() {
        int[] nums = {1, 2};
        int[] expected = {2, 1};
        solution.rotate(nums, 1);
        assertArrayEquals(expected, nums, "两元素数组向右轮转1位应该交换位置");
    }

    /**
     * 测试用例7: 较大k值的轮转
     * Test case 7: Large k value rotation
     * 输入: nums = [1,2,3,4,5,6], k = 8
     * 预期输出: [5,6,1,2,3,4] (相当于k=2)
     */
    @Test
    @DisplayName("测试较大k值的轮转 - Test large k value rotation")
    public void testLargeKValueRotation() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] expected = {5, 6, 1, 2, 3, 4};
        solution.rotate(nums, 8); // 8 % 6 = 2
        assertArrayEquals(expected, nums, "大k值应该通过取模得到正确结果");
    }
}
