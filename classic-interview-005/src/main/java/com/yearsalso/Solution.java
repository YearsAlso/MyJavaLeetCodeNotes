package com.yearsalso;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [3,2,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 */
public class Solution {
    public int majorityElement(int[] nums) {
       int maxCount = 0;
       int result = 0;
       Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            var count = map.get(value);
            if (count == null) {
                count = 0;
            }

            count++;
            map.put(value, count);
            if (count > maxCount) {
                maxCount = count;
                result = value;
            }
        }

        return result;
    }
}