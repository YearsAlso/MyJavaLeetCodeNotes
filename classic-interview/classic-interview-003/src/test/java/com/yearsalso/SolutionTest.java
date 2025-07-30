package com.yearsalso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

/**
 * Solution类removeDuplicates方法的单元测试
 * Unit tests for removeDuplicates method in Solution class
 */
public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * 测试用例TC001: 空数组
     * Test case TC001: Empty array
     */
    @Test
    @DisplayName("测试空数组 - 应返回0")
    public void testEmptyArray() {
        int[] nums = new int[]{};
        int expectedLength = 0;
        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "空数组应该返回长度0");
        // 空数组无需验证元素内容
    }

    /**
     * 测试用例TC002: 单元素数组
     * Test case TC002: Single element array
     */
    @Test
    @DisplayName("测试单元素数组 - 应返回1")
    public void testSingleElementArray() {
        int[] nums = new int[]{1};
        int expectedLength = 1;
        int[] expectedElements = new int[]{1};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "单元素数组应该返回长度1");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前1个元素应该是[1]");
    }

    /**
     * 测试用例TC003: 全部重复元素
     * Test case TC003: All duplicate elements
     */
    @Test
    @DisplayName("测试全部重复元素 - 应返回1")
    public void testAllDuplicates() {
        int[] nums = new int[]{1, 1, 1, 1};
        int expectedLength = 1;
        int[] expectedElements = new int[]{1};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "全部重复元素应该返回长度1");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前1个元素应该是[1]");
    }

    /**
     * 测试用例TC004: 无重复元素
     * Test case TC004: No duplicate elements
     */
    @Test
    @DisplayName("测试无重复元素 - 应返回数组长度")
    public void testNoDuplicates() {
        int[] nums = new int[]{1, 2, 3, 4};
        int expectedLength = 4;
        int[] expectedElements = new int[]{1, 2, 3, 4};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "无重复元素应该返回原数组长度");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前4个元素应该是[1,2,3,4]");
    }

    /**
     * 测试用例TC005: 一般重复情况
     * Test case TC005: General duplicate case
     */
    @Test
    @DisplayName("测试一般重复情况 - 应正确去重")
    public void testGeneralDuplicates() {
        int[] nums = new int[]{1, 1, 2, 2, 3, 3};
        int expectedLength = 3;
        int[] expectedElements = new int[]{1, 2, 3};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "一般重复情况应该返回去重后长度3");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前3个元素应该是[1,2,3]");
    }

    /**
     * 测试用例TC006: 包含负数和零
     * Test case TC006: Contains negative numbers and zero
     */
    @Test
    @DisplayName("测试包含负数和零 - 应正确处理")
    public void testNegativeNumbersAndZero() {
        int[] nums = new int[]{-1, 0, 1, 1, 2};
        int expectedLength = 4;
        int[] expectedElements = new int[]{-1, 0, 1, 2};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "包含负数和零应该返回去重后长度4");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前4个元素应该是[-1,0,1,2]");
    }

    /**
     * 测试用例TC007: 复杂重复模式
     * Test case TC007: Complex duplicate pattern
     */
    @Test
    @DisplayName("测试复杂重复模式 - 应正确去重")
    public void testComplexPattern() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 4, 4, 5};
        int expectedLength = 5;
        int[] expectedElements = new int[]{1, 2, 3, 4, 5};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "复杂重复模式应该返回去重后长度5");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前5个元素应该是[1,2,3,4,5]");
    }

    /**
     * 边界值测试: 最小值处理
     * Boundary test: Minimum value handling
     */
    @Test
    @DisplayName("测试包含Integer.MIN_VALUE - 应正确处理")
    public void testWithIntegerMinValue() {
        int[] nums = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, -1, 0, 0, 1};
        int expectedLength = 4;
        int[] expectedElements = new int[]{Integer.MIN_VALUE, -1, 0, 1};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength, "包含Integer.MIN_VALUE应该正确处理");
        assertArrayEquals(expectedElements, java.util.Arrays.copyOf(nums, actualLength),
                         "数组前4个元素应该是[Integer.MIN_VALUE,-1,0,1]");
    }
}
