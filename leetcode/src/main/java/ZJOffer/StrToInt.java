package ZJOffer;

/**
 * @author zack
 * @create 2020-04-21-1:04
 */
public class StrToInt {
    public static void main(String[] args) {
        //System.out.println(StrToInt.strToInt("   -42"));
        char a = 'a';
        char c = '0';
        System.out.println(a-c);
    }

    public static int strToInt(String str) {
        char[] c = str.trim().toCharArray();
        if (c.length == 0) {
            return 0;
        }
        long res = 0;
        int i = 1, sign = 1;
        if (c[0] == '-') {
            sign = -1;
        } else if (c[0] != '+') {
            i = 0;
        }
        for (int j = 1; j < c.length; j++) {
            if (c[j] < '0' || c[j] > '9') {
                break;
            }
            res = res * 10 + (c[j] - '0');
            if (res > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return sign * (int) res;
    }
}
