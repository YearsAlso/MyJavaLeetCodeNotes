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

    public boolean canJumpCore(int[] nums, int index) {
        // index 应该是比长度小1
        if (index >= nums.length - 1) {
            return true;
        }

        int stepMaxNum = nums[index];
        if (stepMaxNum > nums.length) {
            return true;
        }
        boolean success = false;
        for (int i = stepMaxNum; i >= 1; i--) {
            success |= canJumpCore(nums, index + i);
            if (success) {
                return true;
            }
        }

        return success;
    }

    public boolean canJump(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        return canJumpCore(nums, 0);
    }
}
