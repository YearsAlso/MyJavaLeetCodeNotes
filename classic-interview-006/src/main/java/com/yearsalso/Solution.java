package com.yearsalso;

/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int n = k % length;
        if (n == 0) {
            return;
        }

        int[] temp = new int[length];

        int destPos = length - n - 1;
        System.arraycopy(nums, length - n, temp, 0, n);
        System.arraycopy(nums, 0, temp, n, length - n);

        System.arraycopy(temp, 0, nums, 0, length);
    }
}
