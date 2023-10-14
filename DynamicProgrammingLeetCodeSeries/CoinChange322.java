package DynamicProgrammingLeetCodeSeries;

public class CoinChange322 {
    public static void main(String[] args) {
        int[] coins = new int[3];
        coins[0]=1;
        coins[1] = 2;
        coins[2] = 5;
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i=1; i < dp.length; i++) {
            dp[i] = dp.length;
            for (int j=0; j < coins.length; j++) {
                if (i >= coins[j]) dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
            }
        }
        return dp[amount] == dp.length ? -1 : dp[amount];

    }
}
