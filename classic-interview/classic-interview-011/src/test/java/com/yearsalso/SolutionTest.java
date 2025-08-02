package com.yearsalso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Solution类的单元测试
 * 测试hIndex方法的各种场景
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    @DisplayName("测试示例1: [3,0,6,1,5] 应返回 3")
    public void testExample1() {
        // Given: 给定的示例输入
        int[] citations = {3, 0, 6, 1, 5};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为3
        assertEquals(3, result, "示例1应该返回h指数3");
    }

    @Test
    @DisplayName("测试示例2: [1,3,1] 应返回 1")
    public void testExample2() {
        // Given: 给定的示例输入
        int[] citations = {1, 3, 1};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为1
        assertEquals(1, result, "示例2应该返回h指数1");
    }

    @Test
    @DisplayName("测试空数组: [] 应返回 0")
    public void testEmptyArray() {
        // Given: 空数组
        int[] citations = {};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为0
        assertEquals(0, result, "空数组应该返回h指数0");
    }

    @Test
    @DisplayName("测试单元素数组为0: [0] 应返回 0")
    public void testSingleZeroElement() {
        // Given: 单个元素为0的数组
        int[] citations = {0};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为0
        assertEquals(0, result, "单个0元素应该返回h指数0");
    }

    @Test
    @DisplayName("测试单元素数组为1: [1] 应返回 1")
    public void testSingleOneElement() {
        // Given: 单个元素为1的数组
        int[] citations = {1};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为1
        assertEquals(1, result, "单个1元素应该返回h指数1");
    }

    @Test
    @DisplayName("测试所有元素为0: [0,0,0] 应返回 0")
    public void testAllZeroElements() {
        // Given: 所有元素都为0的数组
        int[] citations = {0, 0, 0};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为0
        assertEquals(0, result, "所有元素为0应该返回h指数0");
    }

    @Test
    @DisplayName("测试所有元素相同且大于0: [3,3,3,3] 应返回 3")
    public void testAllSameElements() {
        // Given: 所有元素都为3的数组
        int[] citations = {3, 3, 3, 3};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为3
        assertEquals(3, result, "4个3应该返回h指数3");
    }

    @Test
    @DisplayName("测试完美匹配情况: [4,4,4,4] 应返回 4")
    public void testPerfectMatch() {
        // Given: 完美匹配h指数的数组
        int[] citations = {4, 4, 4, 4};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为4
        assertEquals(4, result, "4篇论文都被引用4次应该返回h指数4");
    }

    @Test
    @DisplayName("测试递增序列: [1,2,3,4,5] 应返回 3")
    public void testAscendingOrder() {
        // Given: 递增序列
        int[] citations = {1, 2, 3, 4, 5};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为3
        assertEquals(3, result, "递增序列应该返回h指数3");
    }

    @Test
    @DisplayName("测试递减序列: [5,4,3,2,1] 应返回 3")
    public void testDescendingOrder() {
        // Given: 递减序列
        int[] citations = {5, 4, 3, 2, 1};

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为3
        assertEquals(3, result, "递减序列应该返回h指数3");
    }

    @Test
    @DisplayName("测试大数组: 100个1 应返回 1")
    public void testLargeArray() {
        // Given: 包含100个1的大数组
        int[] citations = new int[100];
        for (int i = 0; i < citations.length; i++) {
            citations[i] = 1;
        }

        // When: 调用hIndex方法
        int result = solution.hIndex(citations);

        // Then: 验证结果为1
        assertEquals(1, result, "100个1应该返回h指数1");
    }
}
