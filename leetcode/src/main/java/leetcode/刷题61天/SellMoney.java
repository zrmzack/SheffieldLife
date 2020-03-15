package leetcode.刷题61天;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author zack
 * @create 2020-03-09-0:17
 */
public class SellMoney {
    class Solution {
        public int maxProfit(int[] prices) {

            if (prices.length == 0 || prices.length == 1 || prices.length > 9999) {
                return 0;
            }
            int getMoney = 0;
            HashSet<Integer> hashSet = new HashSet();
            for (int i = 0; i < prices.length; i++) {
                int buy = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    int sell = prices[j];
                    hashSet.add(sell - buy);
                }
            }

            return Collections.max(hashSet) > 0 ? Collections.max(hashSet) : 0;
        }
    }

    class Solution2 {
        public int maxProfit(int[] prices) {
            if (prices.length == 0 || prices == null) return 0;
            //利润
            int pro = 0;
            //当前股票价格
            int currPri = prices[0];
            //遍历数组
            for (int i = 1; i < prices.length; i++) {
                //如果当前股票价格比上个月的便宜，买入
                if (currPri > prices[i]) {
                    currPri = prices[i];
                } else {
                    //如果当前股票更贵，计算卖出的利润
                    int tempPro = prices[i] - currPri;
                    //如果利润大，改变pro值
                    if (tempPro > pro) {
                        pro = tempPro;
                    }
                }
            }
            return pro;

        }
    }
}
