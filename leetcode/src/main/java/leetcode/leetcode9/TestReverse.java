package leetcode.leetcode9;

/**
 * @author zack
 * @create 2020-01-25-23:09
 */
public class TestReverse {
    public static void main(String[] args) {
        System.out.println(Solution1.isPalindrome(121));
    }
}

class Solution1 {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int temp2 = 0;
        while (x!=0) {
            temp2 = temp2*10 + x%10;
            x /= 10;
        }
        if (temp2 > Integer.MAX_VALUE || temp2 < Integer.MIN_VALUE) {
            return false;
        }else {
            return temp==temp2;
        }

    }
}