package com.yearsalso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 实现RandomizedSet 类：
 *
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 *
 *
 *
 * 示例：
 *
 * 输入
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [[], [1], [2], [2], [], [1], [2], []]
 * 输出
 * [null, true, false, true, 2, true, false, 2]
 *
 * 解释
 * RandomizedSet randomizedSet = new RandomizedSet();
 * randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
 * randomizedSet.remove(2); // 返回 false ，表示集合中不存在 2 。
 * randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
 * randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
 * randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
 * randomizedSet.insert(2); // 2 已在集合中，所以返回 false 。
 * randomizedSet.getRandom(); // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
 */
class RandomizedSet {

    private final List<Integer> list = new ArrayList<>();
    private final Map<Integer, Boolean> map = new HashMap<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false; // 如果值已经存在，返回 false
        }
        list.add(val); // 将值添加到列表中
        map.put(val, true); // 在映射中记录该值
        return true; // 返回 true 表示插入成功
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false; // 如果值不存在，返回 false
        }
        list.remove(Integer.valueOf(val)); // 从列表中移除该值
        map.remove(val); // 从映射中移除该值
        return true; // 返回 true 表示移除成功
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * list.size()); // 生成一个随机索引
        return list.get(randomIndex); // 返回列表中对应索引的值
    }
}
