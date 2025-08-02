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
        int n = nums.length;
        if (n <= 1) return 0;

        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == end) {
                jumps++;
                end = farthest;
                if (end >= n - 1) break;
            }
        }
        return jumps;
    }

    public int jumpOld(int[] nums) {
        if(nums[0] == 0) {
            return 0; // 如果第一个元素为0且数组长度大于1，无法到达最后一个位置
        }

        if (nums.length <= 1) {
            return 0;
        }

        int maxReach = nums[0]; // 记录当前能到达的最远位置

        int minSteps = 0; // 记录当前跳跃次数

        if (maxReach >= nums.length - 1) {
            return 1; // 如果初始位置就能到达或超过最后一个位置，直接返回1
        }

        /**
         * 贪心策略实现有误：你在内层循环中用 maxJump = maxJump + nums[j]，这会导致 maxJump 叠加多次，实际上应该是 maxJump = Math.max(maxJump, j + nums[j])，表示在当前步能到达的最远位置。
         * 步数统计不准确：minSteps 的递增和返回时机不对，导致步数可能多加或少加。
         * 循环推进方式有误：i += maxIndex - i 这样推进下标不对，应该是每次遍历当前能到达的区间，更新最远能到达的位置
         *
         */
        for (int i = 1; i < nums.length;) {
            // 更新能到达的最远位置
            int maxJump = maxReach;
            int maxIndex = i;
            for(int j = i + nums[i]; j > i; j--) {
                if (j >= nums.length) {
                    // 跳到当前位置，再跳到最后一个位置，所以这里需要跳两次
                    minSteps+=2;
                    return minSteps; // 如果超过数组长度，直接返回当前跳跃次数
                }
                if(maxJump < maxJump + nums[j]) {
                    maxJump = maxJump + nums[j];
                    maxIndex = j;
                }
            }

            i += maxIndex - i; // 跳到能到达的最远位置
            minSteps++;
            maxReach = maxJump;

            // 如果已经能到达或超过最后一个下标，直接返回true
            if (maxReach >= nums.length - 1) {
                minSteps++; // 最后一次跳跃
                break;
            }
        }


        return minSteps;
    }
}
