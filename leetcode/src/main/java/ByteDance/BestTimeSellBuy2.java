package ByteDance;

/**
 * @author zack
 * @create 2020-04-19-21:56
 */
public class BestTimeSellBuy2 {
    int maxProfit_k_inf(int[] prices) {
        int buyed_0 = 0;
        int sold_1 = Integer.MIN_VALUE;
        int pre = 0;
        for (int i : prices) {
            int temp = buyed_0;
            buyed_0 = Math.max(buyed_0, sold_1 + i);
            sold_1 = Math.max(sold_1, pre - i);
            pre = temp;
        }
        return buyed_0;
    }
}
