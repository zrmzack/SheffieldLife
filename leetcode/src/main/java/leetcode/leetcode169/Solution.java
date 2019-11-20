package leetcode.leetcode169;

/**
 * @author zack
 * @create 2019-11-21-0:39
 */
public class Solution {
    public static int majorityElement(int[] nums) {
        int size = nums.length / 2;
        int temp = 0;
        int times = 0;
        for (int x = 0; x < nums.length; x++) {
            temp = nums[x];
            times = 0;
            for (int y = 0; y < nums.length; y++) {
                if (temp == nums[y]) {
                    times++;
                }

            }
        }
        if (times > size) {
            return temp;
        }

        return 0;
    }

    public static void main(String[] args) {
        int array[] = {8, 8, 7, 7, 7};
        System.out.println(Solution.majorityElement(array));
    }
}