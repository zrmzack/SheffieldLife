import java.util.Stack;

/**
 * @author zack
 * @create 2020-01-26-14:28
 */
public class TwoStacksQueue {
    public static void main(String[] args) {
        TwoStacksQueue queue = new TwoStacksQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.size() != 0) {
            return stack2.pop();
        } else {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

    }
}
