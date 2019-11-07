package com.leetcode53;

/**
 * @author zack
 * @create 2019-10-31-23:35
 */
public class Solution2 {
    public int maxSubArray(int[] nums) {
        int temp =  nums[0];
        int array2[] = new int[nums.length];
        array2[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            array2[i] = Math.max( array2[i-1] + nums[i],nums[i]);
            temp = Math.max(Math.max(array2[i - 1] + nums[i], nums[i]), temp);
        }
        return temp;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int nums[] = {1, 2, 3, -3, 4};
        System.out.println(solution.maxSubArray(nums));
    }
}
