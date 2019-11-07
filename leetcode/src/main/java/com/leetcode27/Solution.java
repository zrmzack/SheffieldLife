package com.leetcode27;

/**
 * @author zack
 * @create 2019-10-31-19:17
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] !=val) {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {11, 22, 33, 44, 44, 55};
        System.out.println(solution.removeElement(nums, 55));
    }
}