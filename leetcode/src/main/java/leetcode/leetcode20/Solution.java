package leetcode.leetcode20;

import java.util.Stack;

/**
 * @author zack
 * @create 2019-10-30-3:05
 */
public class Solution {
    public boolean isValid(String s) {
        char[] x = s.toCharArray();
        boolean flag = false;
        Stack<Character> stack = new Stack();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == '(' || x[i] == '{' || x[i] == '[') {
                stack.push(x[i]);
            } else if (x[i] == '\"') {
                stack.push(x[i]);
                if (stack.size() <= 0) {
                    return false;
                }
                char popout = stack.pop();
                if (popout == '\"' && x[i] == '\"') {
                    flag = true;
                    continue;
                }
            } else {
                if (stack.size() <= 0) {
                    return false;
                }
                char popout = stack.pop();
                if (popout == '(' && x[i] == ')') {
                    flag = true;
                    continue;
                } else if (popout == '{' && x[i] == '}') {
                    flag = true;
                    continue;
                } else if (popout == '[' && x[i] == ']') {
                    flag = true;
                    continue;
                } else if (popout == '\"' && x[i] == '\"') {
                    flag = true;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("(){}"));
    }


}
