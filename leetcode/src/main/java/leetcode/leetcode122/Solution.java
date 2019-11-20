package leetcode.leetcode122;

/**
 * @author zack
 * @create 2019-11-19-17:08
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int make = 0;
        if (prices.length == 0) {
            return 0;
        }
        for (int x = 0; x < prices.length-1; x++) {
            make += prices[x + 1] > prices[x] ? prices[x + 1] - prices[x] : 0;
        }

        return make;
    }

    public static void main(String[] args) {
        int x[] = {7, 1, 5, 3, 6, 4};
        System.out.println(Solution.maxProfit(x));
    }
}
