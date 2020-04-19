package ByteDance;

/**
 * @author zack
 * @create 2020-04-19-22:01
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int tempmax = nums[0];
        int max = nums[0];
        for (int i = 1; i < length; i++) {
            tempmax = Math.max(tempmax + nums[i], nums[i]);
            max = Math.max(max, tempmax);
        }
        return max;
    }
}
