package ByteDance;

/**
 * @author zack
 * @create 2020-04-21-5:00
 */
public class maxProfit2 {
    public int maxProfit(int[] prices) {
        int cur = 0;
        int pre = Integer.MIN_VALUE;
        for (int i : prices) {
            int temp = cur;
            cur = Math.max(cur, pre + i);
            pre = Math.max(pre, temp - i);
        }
        return cur;
    }
}
