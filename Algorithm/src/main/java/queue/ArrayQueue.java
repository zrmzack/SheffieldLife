package queue;

/**
 * @author zack
 * @create 2020-01-08-16:16
 */
public class ArrayQueue {
}

class ArrayQue {
    private int maxSize;//最大容量
    private int front;//头
    private int rear;//尾
    private int[] arr;//存放数据

    public ArrayQue(int arraymaxSize) {
        rear = -1;
        front = -1;
        maxSize = arraymaxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满了");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            System.out.println("队列是空的");
            throw new RuntimeException("队列是空的");
        }

        front++;
        return arr[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("数组是空的");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            //循环打印出来
            System.out.print("number i is:" + arr[i] + " ");
        }
    }


    public int headQue() {
        if (isEmpty()) {
            System.out.println("队列是空的");
            throw new RuntimeException("队列是空的");
        }
        //加个1
        return front + 1;
    }
}
