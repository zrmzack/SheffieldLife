package leetcode.leetcode155;

import java.util.Stack;

/**
 * @author zack
 * @create 2020-01-25-23:51
 */
public class leetcode155 {

}

class MinStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        s1.push(x);
        if (s2.empty() || s2.peek() >= x) {
            s2.push(x);
        }
    }

    public void pop() {
        if (s1.peek().equals(s2.peek())) {
            s2.pop();
        }
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
