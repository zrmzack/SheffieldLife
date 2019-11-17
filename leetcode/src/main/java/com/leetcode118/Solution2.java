package com.leetcode118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2019-11-16-23:32
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        List<Integer> listtemp = new ArrayList<>();
        listtemp.add(1);
        for (int x = 0; x < numRows; x++) {
            List<Integer> listcount = new ArrayList<>();
            listcount.add(1);
            for (int i = 1; i <= x; i++) {
                listcount.add(listtemp.get(i) + listtemp.get(i - 1));
            }
            listcount.add(1);
            list.add(listtemp);
            listtemp = listcount;
        }
        return list;
    }

    public static void main(String[] args) {

        Solution solution2 = new Solution();
        System.out.println(solution2.generate(3));
    }
}