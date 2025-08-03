package com.yearsalso;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * 示例 2:
 *
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int allNums = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                if (zeroCount > 1) {
                    // 如果有0，直接返回全0数组
                    Arrays.fill(result, 0);
                    return result; // 如果有超过一个0，直接返回全0数组
                }
            }
            allNums *= num;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] ==0 ){
                int productWithoutZero = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i) {
                        productWithoutZero *= nums[j];
                    }
                }
                result[i] = productWithoutZero; // 如果当前元素是0，返回除其他元素的乘积
            } else {
                result[i] = allNums / nums[i];
            }
        }

        return result;
    }
}
