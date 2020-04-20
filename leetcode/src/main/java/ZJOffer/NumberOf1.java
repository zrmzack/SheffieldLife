package ZJOffer;

/**
 * @author zack
 * @create 2020-01-26-20:11
 */
public class NumberOf1 {
    public static void main(String[] args) {
        NumberOf1 numberOf1 = new NumberOf1();
        numberOf1.Number1(-2147483648);
        numberOf1.num2(-4);
    }

    public int Number1(int n) {
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
        if (n < 0) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < 32; i++) {
                int t = (n & 0x80000000 >>> i) >>> (31 - i);
                buffer.append(t);
            }
            int k = 0;
            for (int i = 0; i < buffer.length(); i++) {
                if (buffer.charAt(i) == '1') {
                    k++;
                }
            }
            return k;

        }
        String x = "";
        x = Long.toBinaryString(n);
        int count = 0;
        for (int num = 0; num < x.length(); num++) {
            if ('1' == x.charAt(num)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public int num2(int x) {
        System.out.println(~x);
        return 0;
    }
}
