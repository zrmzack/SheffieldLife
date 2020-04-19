package ByteDance;

import java.util.Stack;

/**
 * @author zack
 * @create 2020-04-19-22:39
 */
public class StacktoQueue {
    private Stack<Integer> numStack;
    private Stack<Integer> helpStack;

    public StacktoQueue() {
        numStack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void push(int x) {
        numStack.push(x);
    }

    public int pop() {
        peek();
        return helpStack.pop();
    }

    public int peek() {
        if (helpStack.isEmpty()) {
            while (!numStack.isEmpty()) {
                helpStack.push(numStack.pop());
            }
        }

        return helpStack.peek();
    }

    public boolean empty() {
        return helpStack.isEmpty() && numStack.isEmpty();
    }

}
