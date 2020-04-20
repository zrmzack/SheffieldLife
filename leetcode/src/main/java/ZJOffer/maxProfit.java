package ZJOffer;

/**
 * @author zack
 * @create 2020-04-21-3:59
 */
public class maxProfit {
    public int maxProfit(int[] prices) {
        int cur = 0;
        int temp = 0;
        for (int i : prices) {
            cur = Math.max(cur, temp + i);
            temp = Math.max(temp, -i);
        }
        return cur;
    }
}
