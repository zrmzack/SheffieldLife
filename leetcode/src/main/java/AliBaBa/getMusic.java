package AliBaBa;

import java.util.Arrays;

public class getMusic {
    public static int music(String[] s) {
        Arrays.sort(s);
        int count = s[0].length();
        int dp[] = new int[s.length];   //dp数组为包含当前字符串的最大长度
        dp[0] = s[0].length();
        for (int i = 1; i < s.length; i++) {
            int j = s[i].length();
            char x = s[i].charAt(0);
            for (int k = 0; k < i; k++) {
                char y = s[k].charAt(s[k].length() - 1);
                if (x >= y) {   //判断是否可以连接
                    j = Math.max(dp[k] + s[i].length(), j);  //寻找可以连接的最大长度
                }
            }
            dp[i] = j;
            count = Math.max(count, j);
        }
        return count;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"xxxxxxxxxxz", "zzz", "azz", "bcdz"};
        System.out.println(music(s));
    }
}