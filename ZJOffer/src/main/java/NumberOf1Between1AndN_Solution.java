/**
 * @author zack
 * @create 2020-02-01-18:58
 */
public class NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int tempTimes = 0;
        for (int i = 1; i <= n; i++) {

        }
    }

    public int helpCountOne(int n) {
        int temp = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                temp++;
            }
            n /= 10;
        }
        return temp;

    }
}
