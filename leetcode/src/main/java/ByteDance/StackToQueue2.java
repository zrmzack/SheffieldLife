package ByteDance;

import java.util.Stack;

/**
 * @author zack
 * @create 2020-04-19-23:02
 */
public class StackToQueue2 {
    class CQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int size;

        public CQueue() {
            stack1 = new Stack<Integer>();
            stack2 = new Stack<Integer>();
            size = 0;
        }

        public void appendTail(int value) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            size++;
        }

        public int deleteHead() {
            if (size == 0) {
                return -1;
            }
            size--;
            return stack1.pop();
        }
    }
}
