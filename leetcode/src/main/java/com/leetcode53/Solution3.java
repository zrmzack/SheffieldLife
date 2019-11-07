package com.leetcode53;

/**
 * @author zack
 * @create 2019-11-01-21:24
 */
public class Solution3 {
    public static int maxSubArray(int[] nums) {
        int maxSizeArray[] = new int[nums.length];
        int temp = nums[0];
        maxSizeArray[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSizeArray[i] = Math.max(nums[i], maxSizeArray[i - 1] + nums[i]);
            temp = Math.max(Math.max(nums[i], maxSizeArray[i - 1] + nums[i]), temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -4, 5};
        System.out.println(Solution3.maxSubArray(nums));
    }
}
