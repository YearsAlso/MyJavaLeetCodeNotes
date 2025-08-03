package com.yearsalso;

/**
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
 *
 *
 *
 * 示例 1:
 *
 * 输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
 * 输出: 3
 * 解释:
 * 从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
 * 开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油
 * 开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油
 * 开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油
 * 开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油
 * 开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。
 * 因此，3 可为起始索引。
 * 示例 2:
 *
 * 输入: gas = [2,3,4], cost = [3,4,3]
 * 输出: -1
 * 解释:
 * 你不能从 0 号或 1 号加油站出发，因为没有足够的汽油可以让你行驶到下一个加油站。
 * 我们从 2 号加油站出发，可以获得 4 升汽油。 此时油箱有 = 0 + 4 = 4 升汽油
 * 开往 0 号加油站，此时油箱有 4 - 3 + 2 = 3 升汽油
 * 开往 1 号加油站，此时油箱有 3 - 3 + 3 = 3 升汽油
 * 你无法返回 2 号加油站，因为返程需要消耗 4 升汽油，但是你的油箱只有 3 升汽油。
 * 因此，无论怎样，你都不可能绕环路行驶一周。
 */
public class Solution {
    public int canCompleteCircuitWithStart(int start, int[] subGas){
        int index = start;
        int totalGas = 0;
        while(true){
            totalGas += subGas[index];
            if(totalGas < 0){
                return -1; // 如果在某个点油量不足，返回-1
            }

            index = (index + 1) % subGas.length; // 环形移动
            if(index == start){ // 如果回到起点，说明可以完成一圈
                return start;
            }
        }
    }


    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] subGas = new int[gas.length];
        if (gas.length == 0) {
            return -1; // 如果没有加油站，返回-1
        }

        if (gas.length == 1) {
            return gas[0] >= cost[0] ? 0 : -1; // 如果只有一个加油站，判断是否可以完成一圈
        }

        for (int i = 0; i < gas.length; i++) {
            subGas[i] = gas[i] - cost[i];
        }

        for (int i = 0; i < subGas.length; i++) {
            if(subGas[i] >= 0) { // 如果当前点的油量足够
                int result = canCompleteCircuitWithStart(i, subGas);
                if(result != -1) {
                    return result; // 返回可以完成一圈的起始点
                }
            }
        }

        return -1; // 如果没有找到可以完成一圈的起始点，返回-1
    }
}
