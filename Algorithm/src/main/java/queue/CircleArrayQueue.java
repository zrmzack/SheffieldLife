package queue;

import java.util.Scanner;

/**
 * @author zack
 * @create 2020-01-09-1:04
 */
public class CircleArrayQueue {
    public static void main(String[] args) {
        CircleArrayQue que = new CircleArrayQue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据");
            System.out.println("g(get):取出数据");
            System.out.println("h(heat):查看队列头");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    que.showQueue();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    que.addQueue(value);
                    break;
                case 'g':
                    int res0 = que.getQueue();
                    System.out.println(res0);
                    break;
                case 'h':
                    int res = que.headQue();
                    System.out.println(res);
                    break;
                default:
                    break;
            }
        }
    }

    /*
     * 环形数组思路
     * front：队列的第一个元素，初始值0
     * rear:队列得最后一个元素得后一个位置，初始值0
     *当队列满时，（rear+1）%maxsize=front
     * 队列空：rear==front
     * 有效数据个数（rear+maxsize-front）%maxsize
     *
     * */
}
    class CircleArrayQue {
        private int maxSize;//最大容量
        private int front;//头
        private int rear;//尾得后一个
        private int[] arr;//存放数据

        public CircleArrayQue(int arraymaxSize) {
            rear = 0;
            front = 0;
            maxSize = arraymaxSize;
            arr = new int[maxSize];
        }

        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }

        public boolean isEmpty() {
            return rear == front;
        }

        public void addQueue(int n) {
            if (isFull()) {
                System.out.println("队列满了");
                return;
            }

            arr[rear] = n;
            rear = (rear + 1) % maxSize;
        }

        public int getQueue() {
            if (isEmpty()) {
                System.out.println("队列是空的");
                throw new RuntimeException("队列是空的");
            }

            int value = arr[front];
            front = (front + 1) % maxSize;
            return value;
        }

        public void showQueue() {
            if (isEmpty()) {
                System.out.println("数组是空的");
                return;
            }
            for (int i = front; i < front + size(); i++) {
                System.out.print("number i%maxsize is:" + arr[i % maxSize] + " ");
            }
        }

        public int size() {
            return (rear + maxSize - front) % maxSize;
        }

        public int headQue() {
            if (isEmpty()) {
                System.out.println("队列是空的");
                throw new RuntimeException("队列是空的");
            }
            return arr[front];
        }


    }

