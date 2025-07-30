package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * TC01: 示例1
     * 输入: [1,1,1,2,2,3]
     * 预期输出长度: 5
     * 预期数组前缀: [1,1,2,2,3]
     */
    @Test
    public void testExample1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int expectedLength = 5;
        int[] expectedPrefix = {1, 1, 2, 2, 3};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC02: 示例2
     * 输入: [0,0,1,1,1,1,2,3,3]
     * 预期输出长度: 7
     * 预期数组前缀: [0,0,1,1,2,3,3]
     */
    @Test
    public void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expectedLength = 7;
        int[] expectedPrefix = {0, 0, 1, 1, 2, 3, 3};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC03: 单个元素
     * 输入: [1]
     * 预期输出长度: 1
     * 预期数组前缀: [1]
     */
    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int expectedLength = 1;
        int[] expectedPrefix = {1};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC04: 两个相同元素
     * 输入: [1,1]
     * 预期输出长度: 2
     * 预期数组前缀: [1,1]
     */
    @Test
    public void testTwoSameElements() {
        int[] nums = {1, 1};
        int expectedLength = 2;
        int[] expectedPrefix = {1, 1};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC05: 无重复元素
     * 输入: [1,2,3]
     * 预期输出长度: 3
     * 预期数组前缀: [1,2,3]
     */
    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3};
        int expectedLength = 3;
        int[] expectedPrefix = {1, 2, 3};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC06: 全部相同元素
     * 输入: [1,1,1,1,1]
     * 预期输出长度: 2
     * 预期数组前缀: [1,1]
     */
    @Test
    public void testAllSame() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedLength = 2;
        int[] expectedPrefix = {1, 1};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }

    /**
     * TC07: 空数组
     * 输入: []
     * 预期输出长度: 0
     */
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int expectedLength = 0;

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
    }

    @Test
    public void testArray() {
        int[] nums = {0,0,1,1,1,1,2,2,2,4};
        int expectedLength = 7;
        int[] expectedPrefix = {0,0,1,1,2,2,4};

        int resultLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        for (int i = 0; i < expectedLength; i++) {
            assertEquals(expectedPrefix[i], nums[i]);
        }
    }
}
