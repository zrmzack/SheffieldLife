package Stack;

/**
 * @author zack
 * @create 2020-01-19-15:17
 */
public class ArrayStackTest {
    public static void main(String[] args) {

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
        stack[top]=value;
    }

}
