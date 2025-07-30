package com.yearsalso;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution类的单元测试
 * 测试合并两个有序数组的功能
 */
public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * 测试用例1: 正常合并两个非空数组
     * 输入: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 期望输出: [1,2,2,3,5,6]
     */
    @Test
    @DisplayName("测试正常合并两个非空数组")
    public void testNormalMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "应该正确合并两个有序数组");
    }

    /**
     * 测试用例2: nums1为空的情况 (m=0)
     * 输入: nums1 = [0], m = 0, nums2 = [1], n = 1
     * 期望输出: [1]
     */
    @Test
    @DisplayName("测试nums1为空的情况")
    public void testNums1Empty() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "当nums1为空时，应直接复制nums2");
    }

    /**
     * 测试用例3: nums2为空的情况 (n=0)
     * 输入: nums1 = [1], m = 1, nums2 = [], n = 0
     * 期望输出: [1]
     */
    @Test
    @DisplayName("测试nums2为空的情况")
    public void testNums2Empty() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "当nums2为空时，nums1应保持不变");
    }

    /**
     * 测试用例4: nums1中所有元素都小于nums2
     * 输入: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [4,5,6], n = 3
     * 期望输出: [1,2,3,4,5,6]
     */
    @Test
    @DisplayName("测试nums1所有元素都小于nums2的情况")
    public void testNums1AllSmaller() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "当nums1所有元素都小于nums2时，应正确合并");
    }

    /**
     * 测试用例5: nums1中所有元素都大于nums2
     * 输入: nums1 = [4,5,6,0,0,0], m = 3, nums2 = [1,2,3], n = 3
     * 期望输出: [1,2,3,4,5,6]
     */
    @Test
    @DisplayName("测试nums1所有元素都大于nums2的情况")
    public void testNums1AllLarger() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int[] expected = {1, 2, 3, 4, 5, 6};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "当nums1所有元素都大于nums2时，应正确合并");
    }

    /**
     * 测试用例6: 包含重复元素的情况
     * 输入: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,3,4], n = 3
     * 期望输出: [1,2,2,3,3,4]
     */
    @Test
    @DisplayName("测试包含重复元素的情况")
    public void testWithDuplicateElements() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 3, 4};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 3, 4};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "应正确处理重复元素");
    }

    /**
     * 测试用例7: 两个数组都只有一个元素
     * 输入: nums1 = [1,0], m = 1, nums2 = [2], n = 1
     * 期望输出: [1,2]
     */
    @Test
    @DisplayName("测试两个数组都只有一个元素的情况")
    public void testSingleElementArrays() {
        int[] nums1 = {1, 0};
        int m = 1;
        int[] nums2 = {2};
        int n = 1;
        int[] expected = {1, 2};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "应正确处理单元素数组");
    }

    /**
     * 测试用例8: 较大数组的合并
     * 输入: nums1 = [1,3,5,7,9,0,0,0,0,0], m = 5, nums2 = [2,4,6,8,10], n = 5
     * 期望输出: [1,2,3,4,5,6,7,8,9,10]
     */
    @Test
    @DisplayName("测试较大数组的合并")
    public void testLargeArrays() {
        int[] nums1 = {1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int m = 5;
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 5;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, nums1, "应正确处理较大数组的合并");
    }
}
