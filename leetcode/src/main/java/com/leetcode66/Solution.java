package com.leetcode66;

/**
 * @author zack
 * @create 2019-11-01-22:15
 */
class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits={1,2,3,9};
        System.out.println(Solution.plusOne(digits)[3]);
    }
}