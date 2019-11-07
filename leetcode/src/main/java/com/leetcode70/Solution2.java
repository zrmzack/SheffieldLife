package com.leetcode70;

/**
 * @author zack
 * @create 2019-11-04-2:04
 */
public class Solution2 {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] maxSize = new int[n + 1];
        maxSize[0] = 1;
        maxSize[1] = 1;
        maxSize[2] = 2;
        for (int i = 3; i <=n; i++) {
            maxSize[i] = maxSize[i - 1] + maxSize[i - 2];
        }
        return maxSize[n];
    }

    public static void main(String[] args) {
System.out.println(Solution2.climbStairs(3));
    }
}
