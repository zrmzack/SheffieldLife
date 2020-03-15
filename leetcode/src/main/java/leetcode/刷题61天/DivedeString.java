package leetcode.刷题61天;

import java.util.Stack;

/**
 * @author zack
 * @create 2020-03-12-9:23
 */
public class DivedeString {
    public static void main(String[] args) {
        String x = "ABABAB";
        String y = "ABAB";
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings(x,y));
    }

    static class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (str1.length() == 0 || str2.length() == 0) {
                return "";
            }
            Stack<String> stack = new Stack<>();
            int str2Length = str2.length();
            if (str1.length() % str2.length() != 0) {
                return "";
            }
            for (int i = 0; i < str1.length(); i+=str2Length-1) {
                stack.push(str1.substring(0, str2Length));
                str1 = str1.substring(str2Length);
            }
            String temp = stack.peek();
            while (!stack.isEmpty()) {
                String temp1 = stack.pop();
                if (temp.equals(temp1)) {
                    continue;
                } else if (temp != temp1) {
                    return "";
                }
            }
            return temp;
        }
    }
}
