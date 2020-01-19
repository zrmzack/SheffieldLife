package Stack;

/**
 * @author zack
 * @create 2020-01-19-23:02
 */
public class Calculator {
    public static void main(String[] args) {
        String ex = "3+2*6-2";
        ArrayStack2 num = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        while (true) {
            ch = ex.substring(index, index + 1).charAt(0);
            if (operStack.isOper(ch)) {
                if (!operStack.isEmpty()) {
//如果符号栈里面的东西不为空，开始判断比较级
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = num.pop();
                        num2 = num.pop();
                        oper = operStack.pop();
                        res = num.cal(num1, num2, oper);
                        num.push(res);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }
                } else {
                    //如果是空
                    operStack.push(ch);
                }
            } else {
                System.out.println((ch-48));
                num.push(ch-48);
            }
            index++;
            if (index >= ex.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = num.pop();
            num2 = num.pop();
            oper = operStack.pop();
            res = num.cal(num1, num2, oper);
            num.push(res);
        }
        System.out.println("result"+num.pop());
    }
}

class ArrayStack2 {
    private int maxsize;
    private int[] stack;
    private int top = -1;

    public ArrayStack2(int maxsize) {
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

    public int peek() {
        return stack[top];
    }

    public void showStack() {
        if (isEmpty()) {
            System.out.println("栈是空的");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    public int cal(int num1, int num2, int oper) {
        if (oper == '*') {
            return num1 * num2;
        } else if (oper == '+') {
            return num1 + num2;
        } else if (oper == '-') {
            return num2 - num1;
        } else {
            return num2 / num1;
        }
    }

}