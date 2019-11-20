package leetcode.leetcode35;

/**
 * @author zack
 * @create 2019-10-31-21:39
 */
class Solution {
    public int searchInsert(int[] nums, int target) {


        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (target < nums[i]) {
                return i;
            }
            if (target > nums[nums.length-1]) {
                return nums.length;
            } else if (target > nums[i] && target < nums[i]) {
                return i + 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 2));
    }
}