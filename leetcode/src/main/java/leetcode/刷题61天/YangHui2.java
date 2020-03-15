package leetcode.刷题61天;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2020-03-15-9:51
 */
public class YangHui2 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> temp1 = new ArrayList<>();
            List<Integer> temparr = new ArrayList<>();
            for (int i = 0; i < rowIndex; i++) {
                temparr = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        temparr.add(1);
                    } else {
                        temparr.add(temp1.get(j - 1) + temp1.get(j - 1));
                    }

                }
                temp1=temparr;
            }
            return temparr;
        }
    }
}
