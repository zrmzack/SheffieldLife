package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-22-7:31
 */
public class ChangeArray {
    public class Solution {
        public void rotate(int[] nums, int k) {
            int tempPre = nums[0];
            for (int x = 0; x < k; x++) {
                int temp = nums[nums.length - 1];
                for (int y = 0; y < nums.length; y++) {
                    tempPre = nums[y];
                    nums[y]=temp;
                    temp=tempPre;

                }
            }
        }
    }
}
