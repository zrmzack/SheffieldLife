package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-21-5:44
 */
public class WaterProblem {
    class Solution {
        public boolean canMeasureWater(int x, int y, int z) {
            //如果x 和y加起来都比Z小 就没用了
            if (x + y < z) {
                return false;
            }
            if ((x == 0) || (y == 0)) {
                return (z == 0 || x + y == z);
            }
            return z % GCD(x, y) == 0;
        }

        public int GCD(int a, int b) {
            if (b == 0)
                return a;
            else
                return GCD(b, a % b);
        }
    }
}
