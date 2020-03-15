package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-11-10:17
 */
public class SplitArray {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum = 0;
            for (int i : A) {
                sum += i;
            }
            if (sum % 3 != 0) {
                // 总和不是3的倍数，直接 返回false
                return false;
            }



            //核心代码

            int s = 0;
            int flag = 0;
            for (int i : A) {
                s += i;
                if (s == sum / 3) {
                    flag++;
                    s = 0;
                }
            }
            // flag不一定等于3，例如[1,-1,1,-1,1,-1,1,-1]
            if (flag >= 3) {
                return true;
            } else if (flag < 3) {
                return false;
            }

            return false;
        }
    }
}
