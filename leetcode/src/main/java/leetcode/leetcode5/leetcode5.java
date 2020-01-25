package leetcode.leetcode5;

/**
 * @author zack
 * @create 2020-01-24-12:21
 */
public class leetcode5 {

}

class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="abac";
        solution.judge(s);
    }

    public void judge(String s) {
        int x = 0;
        int y = s.length() - 1;
        while (x < y) {
            if (s.charAt(x) != s.charAt(y)) {
                System.out.println("错的");
                return;
            }
            else {
                x++;
                y--;
            }
            System.out.println("对的");
        }

    }
}

