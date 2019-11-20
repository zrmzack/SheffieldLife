package leetcode.leetcode169;

import java.util.Arrays;

/**
 * @author zack
 * @create 2019-11-21-2:43
 */
public class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2 + 1];
    }

    public static void main(String[] args) {

    }
}
