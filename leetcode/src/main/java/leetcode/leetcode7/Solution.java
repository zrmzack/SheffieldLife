package leetcode.leetcode7;

/**
 * @author zack
 * @create 2019-10-28-10:02
 */
public class Solution {
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if (temp > Integer.MAX_VALUE||temp<Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-123));
//System.out.println(Integer.MAX_VALUE);

    }
}
