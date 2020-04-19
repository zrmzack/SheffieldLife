package ByteDance;

/**
 * @author zack
 * @create 2020-04-19-19:36
 */
public class BestTimeSellBuy {
//    public int maxProfit(int[] prices) {
//        int temp = Integer.MAX_VALUE;
//        int result = 0;
//        for (int i : prices) {
//            if (i < temp)
//                temp = i;
//            else if (i - temp > result)
//                result = i - temp;
//        }
//        return result;
//
//    }

    public int maxProfit(int[] prices) {
        //卖
        int cur = 0;
        //买
        int pre = -1000000000;
        for (int i : prices) {
            //卖了股票
            cur = Math.max(cur, pre + i);
            //买了股票
            pre = Math.max(pre, -i);
        }
        return cur;
    }

}
