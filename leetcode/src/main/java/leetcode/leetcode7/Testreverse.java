package leetcode.leetcode7;

/**
 * @author zack
 * @create 2020-01-25-22:44
 */
public class Testreverse {
    public static void main(String[] args) {

    }

}

class Solution1 {
    public int reverse(int x) {
        int temp = 0;
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            throw new RuntimeException("run time out");
        } else {
            while (x != 0) {
                temp = temp * 10 + x % 10;
                x /= 10;

            }

            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                return 0;
            }
            return temp;
        }
    }
}
