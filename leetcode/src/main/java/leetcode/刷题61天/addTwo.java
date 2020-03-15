package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-16-0:21
 */
public class addTwo {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int left = 0;
            int[] res = new int[2];
            int right = nums.length-1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res[0] = nums[left];
                    res[1] = nums[right];
                    return res;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            return res;
        }
    }
}
