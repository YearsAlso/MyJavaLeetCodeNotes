package com.yearsalso;

/**
 * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1,0,4]
 * 输出：false
 * 解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
 */
public class Solution {

    /**
     * 贪心算法
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums 输入的数组
     * @return 是否可以到达最后一个下标
     */
    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        /*
         * 递归转迭代的关键思路:
         * maxReach 既是当前能到达的最远位置，
         * 也是当前范围内最合理的跳转位置，
         * 这样只要在获取maxReach 之后继续获取maxReach，
         * 就可以判断是否可以到达最后一个下标
         */
         int maxReach = 0; // 记录当前能到达的最远位置


        /*
         * 递归转迭代的常见方法:
         * 1. 使用栈模拟递归调用栈
         * 创建一个显式的栈数据结构
         * 将递归中需要保存的变量和状态压入栈中
         * 用循环替代递归调用
         * 2. 尾递归优化
         * 如果是尾递归，可以直接用循环替代
         * 更新参数值，重新执行循环体
         * 3. 动态规划方式
         * 自底向上计算，避免重复计算
         * 用数组或变量保存中间结果
         */
        for (int i = 0; i < nums.length; i++) {
            // 如果当前位置超过了能到达的最远位置，说明无法到达当前位置
            if (i > maxReach) {
                return false;
            }
            
            // 更新能到达的最远位置
            maxReach = Math.max(maxReach, i + nums[i]);
            
            // 如果已经能到达或超过最后一个下标，直接返回true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return false;
    }
}
