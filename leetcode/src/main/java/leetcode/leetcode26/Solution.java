package leetcode.leetcode26;

/**
 * @author zack
 * @create 2019-10-31-2:39
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 33, 44, 44};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}
