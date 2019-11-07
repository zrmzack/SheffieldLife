package com.leetcode14;

/**
 * @author zack
 * @create 2019-11-07-3:06
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = 0;//判断索引
        for (int i = 0; i < strs[0].length(); i++) {
            //拿current 来存储当前第一个值得陆陆续续索引
            char current = strs[0].charAt(i);
            for (String str : strs) {
                //当前的索引值 到达了剩余str的索引值，直接返回
                if (str.length() == i || current != str.charAt(i)) {
                    return str.substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }
}
