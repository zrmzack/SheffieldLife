package com.leetcode70;

/**
 * @author zack
 * @create 2019-11-04-1:44
 */
public class Solution {

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static void main(String[] args) {

    }
}
