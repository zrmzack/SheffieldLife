package leetcode.刷题61天;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author zack
 * @create 2020-03-14-2:45
 */
public class MaxLengRise {
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> lengthList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] >= temp) {
                        arrayList.add(nums[j]);
                        temp = nums[j];
                        continue;
                    } else {
                        lengthList.add(arrayList.size());
                        arrayList.clear();
                        break;
                    }
                }
            }
            Collections.sort(lengthList);
            return lengthList.get(lengthList.size()-1)+1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int array[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution.lengthOfLIS(array));
    }
}
