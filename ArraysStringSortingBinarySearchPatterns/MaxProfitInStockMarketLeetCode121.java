package ArraysStringSortingBinarySearchPatterns;

public class MaxProfitInStockMarketLeetCode121 {
    public static void main(String[] args) {
        int[] prices= {1,2,4,2,5,7,2,4,9,0,9};
        int max = findMaxProfit(prices);
        System.out.println(max);
    }

    private static int findMaxProfit(int[] prices) {
        int minValue = prices[0];
        int profit = 0;
        int finalValue = 0;
        for(int i = 0; i < prices.length; i++){
            if(minValue>prices[i]){
                minValue = prices[i];
            }
            profit = prices[i] - minValue;
            if(finalValue<profit){
                finalValue= profit;
            }
        }
        return finalValue;
    }

}
