package com.yearsalso;

/**
 * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
 * <p>
 * 每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
 * <p>
 * 0 <= j <= nums[i]
 * i + j < n
 * 返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 示例 2:
 * <p>
 * 输入: nums = [2,3,0,1,4]
 * 输出: 2
 */
public class Solution {

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }

        int maxReach = nums[0]; // 记录当前能到达的最远位置

        int minSteps = 0; // 记录当前跳跃次数

        if (maxReach >= nums.length - 1) {
            return 1; // 如果初始位置就能到达或超过最后一个位置，直接返回1
        }

        for (int i = 1; i < nums.length; i++) {
            // 更新能到达的最远位置
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach == i + nums[i]) {
                // 如果当前位置的最大跳跃长度等于当前下标，说明需要跳跃
                minSteps++;
            }

            // 如果已经能到达或超过最后一个下标，直接返回true
            if (maxReach >= nums.length - 1) {
                minSteps++; // 最后一次跳跃
                break;
            }
        }


        return minSteps;
    }
}
