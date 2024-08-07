class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n];
        
        //base cases
        arr[0] = cost[0];
        arr[1] = cost[1];
        
        //start at index 2 since base cases account for index 0 and 1
        for(int i = 2; i < n; i++) {
            //adds min of prev 2 steps to current step
            //finds min at EVERY step
            arr[i] = Math.min(arr[i-1], arr[i-2]) + cost[i];
        }

        //rets min of last 2 steps
        return Math.min(arr[n-1], arr[n-2]);
    }
}