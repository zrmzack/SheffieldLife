package leetcode.刷题61天;

/**
 * @author zack
 * @create 2020-03-08-3:27
 */
public class changeMoney {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount==0) return 0;
            int[] dp =new int[amount+1];  //dp[i]表示达到i用的最少硬币数  默认=初始化全为0
            for (int i = 1; i <= amount; i++) {  //目标为0 的不用计算
                dp[i]=999999;   //此处不能用int的最大值，最大值+1 会溢出变为最小值
                for (int coin :coins) {
                    if (i-coin>=0) dp[i] =Math.min(dp[i-coin]+1,dp[i]);
                }
            }
            return dp[amount]==999999?-1:dp[amount];
        }
    }
}
