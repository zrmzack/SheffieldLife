package leetcode.刷题61天;

import java.util.LinkedList;

/**
 * @author zack
 * @create 2020-03-10-18:45
 */
public class InsertArray {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < target) {
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int tem[] = {1, 3, 5, 7};
        int temp = 4;
        System.out.println(searchInsert(tem,temp));
    }
}
