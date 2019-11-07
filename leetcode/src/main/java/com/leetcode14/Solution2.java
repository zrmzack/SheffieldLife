package com.leetcode14;

/**
 * @author zack
 * @create 2019-11-08-0:21
 */
public class Solution2 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int temps = 0;
        for (int x = 0; x < strs[0].length(); x++) {
            char temp = strs[0].charAt(x);
            for (String str : strs) {
                if (str.charAt(x) != temp||str.length()==x) {
                    return strs[0].substring(0, x);
                }
            }
            temps++;
        }
        return strs[0].substring(0, temps);
    }

    public static void main(String[] args) {
        String str[]={"a","a"};
       System.out.println(Solution2.longestCommonPrefix(str));
    }
}
