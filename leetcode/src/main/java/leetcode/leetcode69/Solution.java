package leetcode.leetcode69;

/**
 * @author zack
 * @create 2019-11-01-22:52
 */
public class Solution {
    public static int mySqrt(int x) {
        return (int)Math.floor(Math.sqrt(x));
    }

    public static void main(String[] args) {
        System.out.println(Solution.mySqrt(8));
    }
}
