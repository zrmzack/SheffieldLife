package leetcode.leetcode171;

/**
 * @author zack
 * @create 2020-01-26-1:01
 */
public class leetcode171 {
    public  int titleToNumber(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;
    }
}
