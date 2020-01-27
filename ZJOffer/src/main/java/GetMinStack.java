import java.util.Stack;

/**
 * @author zack
 * @create 2020-01-27-19:04
 */
public class GetMinStack {
    private Stack<Integer> MinStack = new Stack<>();
    private Stack<Integer> AllStack = new Stack<>();

    public void push(int node) {
        if (MinStack.isEmpty() || node < MinStack.peek()) {
            MinStack.push(node);
        } else {
            MinStack.push(MinStack.peek());
        }
        AllStack.push(node);

    }

    public void pop() {
        if (MinStack == null || AllStack == null) {
            return;
        }
        AllStack.pop();
        MinStack.pop();
    }

    public int top() {
        if (!AllStack.isEmpty()) {
            return AllStack.peek();
        } else {
            return 0;
        }
    }

    public int min() {
        if (!MinStack.isEmpty()) {
            return MinStack.peek();
        } else {
            return 0;
        }
    }
}
