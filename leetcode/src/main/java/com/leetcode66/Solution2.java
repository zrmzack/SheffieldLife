package com.leetcode66;

/**
 * @author zack
 * @create 2019-11-01-22:33
 */
public class Solution2 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int nums[] = new int[digits.length + 1];
        nums[0] = 1;

        return nums;
    }
}
