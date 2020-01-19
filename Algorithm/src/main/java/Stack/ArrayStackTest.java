package Stack;

/**
 * @author zack
 * @create 2020-01-19-15:17
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(20);
        arrayStack.push(10);
        arrayStack.push(90);
        arrayStack.showStack();
        arrayStack.pop();
        arrayStack.showStack();

    }
}

class ArrayStack {
    private int maxsize;
    private int[] stack;
    private int top = -1;

    public ArrayStack(int maxsize) {
        this.maxsize = maxsize;
        stack = new int[maxsize];
    }

    public boolean isFull() {
        return top == maxsize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("满了");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        //判断是否空
        if (isEmpty()) {
            throw new RuntimeException("空的栈");
        }
        int tempValue = stack[top];
        top--;
        return tempValue;
    }

    public void showStack() {
        if (isEmpty()) {
            System.out.println("栈是空的");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


}
