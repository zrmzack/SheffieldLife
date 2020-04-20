package ZJOffer;

/**
 * @author zack
 * @create 2020-04-21-4:09
 */
public class lastRemaining {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <=n; i++) {
            ans = (m + ans) % i;
        }
        return ans;
    }
}
