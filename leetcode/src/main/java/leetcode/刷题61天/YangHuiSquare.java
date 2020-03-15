package leetcode.刷题61天;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2020-03-15-9:38
 */
public class YangHuiSquare {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> results = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    int tempnum = 0;
                    if (j == 0 || j == i) {
                        temp.add(1);
                    } else {
                        temp.add(results.get(i - 1).get(j - 1) + results.get(i - 1).get(j));
                    }
                }
                results.add(temp);
            }
            return results;
        }
    }
}
