package leetcode.leetcode121;

class Solution2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int make = 0;
        int buy = 0;
        int sell = 0;
        buy = prices[0];
        for (int x = 1; x <= prices.length; x++) {
            sell = prices[x];
            if (buy > sell) {
                buy = sell;
            } else {
                sell = sell - buy;
                if (make - sell > 0) {
                    make = make;
                } else {
                    make = sell;
                }
            }

        }
        return make;
    }

    public static void main(String[] args) {

    }
}