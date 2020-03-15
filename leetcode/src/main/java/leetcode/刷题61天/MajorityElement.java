package leetcode.刷题61天;

import java.util.Arrays;

/**
 * @author zack
 * @create 2020-03-13-23:47
 */
public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int length=nums.length;
            return nums[length/2];
        }
    }
}
