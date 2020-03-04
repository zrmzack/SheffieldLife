package leetcode.刷题61天;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue;

    // 根据官方推荐，使用ArrayDeque作为队列
    public MyStack() {
        queue = new ArrayDeque<Integer>();
    }

    // 入栈时，将新元素x进入队列后，将新元素x之前的所有元素重新入队，此时元素x处于队头
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    // 出栈pop操作和检查栈顶元素的top操作在调用队列相应方法前，需要检查队列是否为空，
    // 否则可能产生空指针异常
    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("EMPTY STACK");
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("EMPTY STACK");
        }
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }

}

