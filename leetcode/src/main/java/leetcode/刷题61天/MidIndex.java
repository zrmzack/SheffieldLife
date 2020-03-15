package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-15-10:17
 */
public class MidIndex {
    class Solution {
        public int pivotIndex(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                int leftresult = 0;
                int rightresult = 0;
                for (int x = 0; x < i; x++) {
                    leftresult += nums[x];
                }
                for (int x = i + 1; x < nums.length; x++) {
                    rightresult+=nums[x];
                }
                if (leftresult==rightresult){
                    return i;
                }
            }
            return -1;
        }
    }
}
