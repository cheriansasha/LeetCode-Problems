class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }

        // int maxProfit = 0;
        // int tempCost = 0;

        // for(int i = 0; i < prices.length; i++) {
        //     for(int j = i + 1; j < prices.length; j++) {
        //         tempCost = prices[j] - prices[i];
        //         if(tempCost > maxProfit) {
        //             maxProfit = tempCost;
        //         }
        //     }
        // }

        // return maxProfit;
        

        //more time efficient solution
        //check minCost while also checking for maxProfit
        int minCostArr[] = new int[prices.length + 1];
        int maxProfit = 0;
        minCostArr[0] = prices[0];

        for(int i = 0; i < prices.length; i++) {
            minCostArr[i + 1] = Math.min(minCostArr[i], prices[i]);
            maxProfit = Math.max(maxProfit, (prices[i] - minCostArr[i]));
        }
        
        return maxProfit;
    }
}