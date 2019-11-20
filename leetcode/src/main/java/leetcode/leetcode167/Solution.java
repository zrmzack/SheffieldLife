package leetcode.leetcode167;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zack
 * @create 2019-11-19-19:12
 */
class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
        Map<Integer, Integer> temp = new HashMap<>();

        if (numbers.length == 0) {
            return a;
        }
        for (int x = 0; x < numbers.length; x++) {
            if (temp.containsKey(target - numbers[x])) {
                a[1] = x + 1;
                a[0] = temp.get(target - numbers[x]) + 1;
                return a;
            } else {
                temp.put(numbers[x], x);
            }
        }
        return a;
    }

    public static void main(String[] args) {
//[2,7,11,15]
//9
        int a[] = {2, 7, 11, 15};
        Solution.twoSum(a, 9);
        for (int x = 0; x < Solution.twoSum(a, 9).length; x++) {
            System.out.println(Solution.twoSum(a, 9)[x]);
        }

    }
}