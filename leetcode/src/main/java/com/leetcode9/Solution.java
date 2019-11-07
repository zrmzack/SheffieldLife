package com.leetcode9;

import javax.jws.soap.SOAPBinding;

/**
 * @author zack
 * @create 2019-10-30-2:47
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        int temp = 0;
        int y=x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                temp = x % 10 + temp*10;
                x /= 10;
            }
            if (temp == y) {
                return true;
            } else return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }

}
