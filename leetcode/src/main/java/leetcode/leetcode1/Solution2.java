package leetcode.leetcode1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zack
 * @create 2020-01-22-18:03
 */
/*
 *use key value to solve
 *
 * use containkey() to get the result
 *
 *
 * */
public class Solution2 {

    public static void main(String[] args) {

    }
}

class test {
    public int[] twoSum(int[] nums, int target) {
        int temp[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(target - nums[x])) {
                temp[0] = x;
                temp[1] = map.get(target - nums[x]);
                return temp;
            } else {
                map.put(nums[x], x);
            }
        }
        throw new RuntimeException("no found");
    }
}