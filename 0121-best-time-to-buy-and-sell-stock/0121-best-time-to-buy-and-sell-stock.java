class Solution {
    public int maxProfit(int[] prices) {
        //main idea: to check for min costs while also look for 
        //max profit at every day

        //base case
        if(prices.length == 1) {
            return 0;
        }

        int minCost[] = new int[prices.length + 1];
        int maxProfit = 0;

        minCost[0] = prices[0];
        minCost[1] = prices[1];

        for(int i = 0; i < minCost.length - 1; i++) {
            minCost[i + 1] = Math.min(minCost[i], prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minCost[i]);
        }

        return maxProfit;
    }
}