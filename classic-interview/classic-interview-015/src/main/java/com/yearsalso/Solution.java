package com.yearsalso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 分发糖果
 * <p>
 * 题目描述：
 * 在一个小镇上，有 n 名孩子站成一排。给你一个整数数组 ratings ，其中 ratings[i] 表示第 i 个孩子的评分。
 * 你需要按照以下要求，给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻两个孩子评分更高的孩子必须获得更多的糖果。
 * 请你给每个孩子分发糖果，返回需要准备的 最少 糖果数。
 * <p>
 * 示例 1：
 * 输入：ratings = [1,0,2]
 * 输出：5
 * 解释：你可以分别给这三个孩子分发 2、1、2 个糖果。
 * <p>
 * 示例 2：
 * 输入：ratings = [1,2,2]
 * 输出：4
 * 解释：你可以分别给这三个孩子分发 1、2、1 个糖果。
 */
public class Solution {
    public int candy(int[] ratings) {
        if (ratings.length <= 0) {
            return 0;
        }

        int candyNum = 0;
        int[] candies = new int[ratings.length];
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] < ratings[i - 1]) {
                if (candies[i - 1] < 1) {
                    candies[i - 1] += 1;
                }
            }
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = 0; i < candies.length - 1; i++) {
            if (candies[i] == candies[i + 1]) {
                if (ratings[i] > ratings[i + 1]) {
                    candies[i] += 1;
                }
                if (ratings[i] < ratings[i + 1]) {
                    candies[i + 1] += 1;
                }
            }
        }

        System.out.println(Arrays.toString(candies));

        for (int candy : candies) {
            candyNum += candy;
        }

        return candyNum + ratings.length;
    }
}
