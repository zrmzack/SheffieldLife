package ZJOffer;

/**
 * @author zack
 * @create 2020-02-01-18:58
 */
public class NumberOf1Between1AndN_Solution {
        public int NumberOf1Between1AndN_Solution(int n) {
        int tempTimes = 0;
        for (int i = 1; i <= n; i++) {
            tempTimes+=  helpCountOne(i);
        }
        return tempTimes;
    }
//    public static void main(String[] args) {
//        System.out.println(helpCountOne(131));
//    }

    public static int helpCountOne(int n) {
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
