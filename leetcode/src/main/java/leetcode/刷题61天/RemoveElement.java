package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-21-7:16
 */
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    }
}
