package com.leetcode119;


import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2019-11-16-23:58
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list0.add(list1);
        if (rowIndex == 0) return list0.get(0);
        for (int x = 0; x < rowIndex; x++) {
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            for (int i = 1; i <= x; i++) {
                list2.add(list1.get(i - 1) + list1.get(i));
            }
            list2.add(1);
            list0.add(list2);
            list1 = list2;
        }
        return list0.get(rowIndex);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(0));
    }
}
