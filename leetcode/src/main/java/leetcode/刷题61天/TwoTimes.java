package leetcode.刷题61天;

import java.util.Arrays;

/**
 * @author zack
 * @create 2020-03-15-19:57
 */
public class TwoTimes {
    class Solution {
        public int dominantIndex(int[] nums) {
            int max = 0;
            int tempi = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                    tempi = i;
                }
            }
            for (int i = 0; i < tempi; i++) {
                if (nums[i]==0){
                    continue;
                }
                if (max / nums[i] < 2) {
                    return -1;
                }
            }
            for (int i = tempi; i < nums.length; i++) {
                if (nums[i]==0){
                    continue;
                }
                if (max / nums[i] < 2) {
                    return -1;
                }
            }
            return tempi;
        }
    }
}
