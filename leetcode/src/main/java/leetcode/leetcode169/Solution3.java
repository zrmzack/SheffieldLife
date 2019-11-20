package leetcode.leetcode169;

import java.util.Arrays;

/**
 * @author zack
 * @create 2019-11-21-2:47
 */
public class Solution3 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int temp = 0;
        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            count += (num == temp) ? 1 : -1;
        }

        return temp;
    }

    public static void main(String[] args) {
        int a[] = {3, 2, 3};
        System.out.println(Solution3.majorityElement(a));
    }
}
