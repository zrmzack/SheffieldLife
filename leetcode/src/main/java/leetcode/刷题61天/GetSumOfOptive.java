package leetcode.刷题61天;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zack
 * @create 2020-03-06-0:42
 */
public class GetSumOfOptive {
    class Solution {
        public int[][] findContinuousSequence(int target) {
            List<int[]> list = new ArrayList<>();
            int i = 1;
            while (target > 0) {
                target -= i++;
                if (target > 0 && target % i == 0) {
                    int[] arr = new int[i];
                    for (int j = target / i, k = 0; j < target / i + i; j++, k++) {
                        arr[k] = j;
                    }
                    list.add(arr);
                }
            }
            Collections.reverse(list);
            int[][] res = new int[0][];
            return list.toArray(res);
        }
    }
}
