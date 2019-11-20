package leetcode.leetcode53;

/**
 * @author zack
 * @create 2019-10-31-22:20
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            temp = Math.max(Math.max(dp[i - 1] + nums[i], nums[i]), temp);
        }
        return temp;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1, 2, 3, -3, 4};
        System.out.println(solution.maxSubArray(nums));
    }
}
