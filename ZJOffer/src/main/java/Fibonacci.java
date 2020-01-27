/**
 * @author zack
 * @create 2020-01-26-19:33
 */
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.Fibonacci(5));
    }

    public int Fibonacci(int n) {
        if (n > 39) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
