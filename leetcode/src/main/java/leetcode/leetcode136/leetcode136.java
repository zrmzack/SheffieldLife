package leetcode.leetcode136;

/**
 * @author zack
 * @create 2020-01-28-15:26
 */
public class leetcode136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
