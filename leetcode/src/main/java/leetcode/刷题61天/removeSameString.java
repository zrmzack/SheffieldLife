package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-22-5:43
 */
public class removeSameString {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }
}