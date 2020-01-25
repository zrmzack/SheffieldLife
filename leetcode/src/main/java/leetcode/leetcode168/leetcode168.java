package leetcode.leetcode168;

/**
 * @author zack
 * @create 2020-01-26-0:41
 */
public class leetcode168 {

}

class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n >= 0) {
            n--;
            char temp=(char)(n%26+'A');
            sb.append(temp);
            n/=26;
        }
        sb.reverse();
        return String.valueOf(sb);
    }
}

