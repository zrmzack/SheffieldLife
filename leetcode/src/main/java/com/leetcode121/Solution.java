package com.leetcode121;

/**
 * @author zack
 * @create 2019-11-17-0:21
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int make = 0;
        int temp = 0;
        int inv = 0;
        temp = prices[0];
        for (int i = 1; i < prices.length; i++) {
            inv = prices[i];
            if (temp > inv) {
                temp = inv;
            } else {
                inv = inv - temp;
                if (make - inv > 0) {
                    make = make;
                } else {
                    make = inv;
                }
            }
        }
        return make;
    }

    public static void main(String[] args) {

    }
}