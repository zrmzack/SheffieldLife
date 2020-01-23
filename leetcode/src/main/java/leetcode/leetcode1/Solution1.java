package leetcode.leetcode1;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zack
 * @create 2020-01-22-17:29
 */

/*
*
*Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
* */
public class Solution1 {
    /*
     *This is a bruteforce
     * */
    public static void main(String[] args) {

        int array[]={2,7,11,15};
        Solutiontest solutiontest=new Solutiontest();
        solutiontest.twoSum(array,9);

    }
}

class Solutiontest {
    public int[] twoSum(int[] nums, int target) {
        int temp[] = new int[2];
        if (nums.length == 0) {
            throw new RuntimeException("no related number");
        }
        int length = nums.length;
        for (int x = 0; x <= length - 1; x++) {
            temp[0] = x;
            for (int j = x; j <= length - 1; j++) {
                if (nums[j] == (target - nums[x])) {
                    temp[1] = j;
                    return temp;
                }
            }
        }
        throw new RuntimeException("no related numbers");
    }
}