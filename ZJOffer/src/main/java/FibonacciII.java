/**
 * @author zack
 * @create 2020-01-26-19:45
 */
public class FibonacciII {
    public static void main(String[] args) {

    }
    public int FibonacciII(int n) {
        if (n > 39) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        if (n == 0) {
            return 0;
        }
        return FibonacciII(n-1)*2;
    }
}
