package com.yearsalso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solution类的单元测试
 * 测试跳跃游戏II问题的解决方案
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    @DisplayName("测试示例1: [2,3,1,1,4] 应该返回 2")
    public void testExample1() {
        // Given: 给定测试用例1
        int[] nums = {2, 3, 1, 1, 4};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为2
        assertEquals(2, result, "跳跃次数应该为2");
    }

    @Test
    @DisplayName("测试示例2: [2,3,0,1,4] 应该返回 2")
    public void testExample2() {
        // Given: 给定测试用例2
        int[] nums = {2, 3, 0, 1, 4};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为2
        assertEquals(2, result, "跳跃次数应该为2");
    }

    @Test
    @DisplayName("测试单元素数组: [0] 应该返回 0")
    public void testSingleElement() {
        // Given: 单元素数组
        int[] nums = {0};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为0
        assertEquals(0, result, "单元素数组跳跃次数应该为0");
    }

    @Test
    @DisplayName("测试单元素数组: [1] 应该返回 1")
    public void testSingleElement2() {
        // Given: 单元素数组
        int[] nums = {1};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为0
        assertEquals(0, result, "单元素数组跳跃次数应该为1");
    }

    @Test
    @DisplayName("测试两元素数组: [2,1] 应该返回 1")
    public void testTwoElements() {
        // Given: 两元素数组
        int[] nums = {2, 1};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为1
        assertEquals(1, result, "两元素数组跳跃次数应该为1");
    }

    @Test
    @DisplayName("测试每步只能跳一格的情况: [1,1,1,1] 应该返回 3")
    public void testStepByStep() {
        // Given: 每个位置只能跳一步的数组
        int[] nums = {1, 1, 1, 1};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为3
        assertEquals(3, result, "每步跳一格需要3次跳跃");
    }

    @Test
    @DisplayName("测试一步到位的情况: [5,1,1,1,1] 应该返回 1")
    public void testOneJump() {
        // Given: 第一步就能跳到最后的数组
        int[] nums = {5, 1, 1, 1, 1};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为1
        assertEquals(1, result, "一步就能跳到最后");
    }

    @Test
    @DisplayName("测试需要策略性跳跃的情况: [1,2,1,1,1] 应该返回 3")
    public void testStrategicJump() {
        // Given: 需要合理选择跳跃策略的数组
        int[] nums = {1, 2, 1, 1, 1};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为3
        assertEquals(3, result, "需要3次跳跃到达终点");
    }

    @Test
    @DisplayName("测试用例: [1,2,3] 应该返回 2")
    public void testCase123() {
        // Given: 给定测试用例 [1,2,3]
        int[] nums = {1, 2, 3};

        // When: 调用jump方法
        int result = solution.jump(nums);

        // Then: 验证结果为2
        assertEquals(2, result, "跳跃次数应该为2");
    }


}
