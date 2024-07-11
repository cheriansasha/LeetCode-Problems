class Solution {

    //helper method
    public int getLength(int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                counter++;
            }
        }
        return counter;
    }

    public int lastStoneWeight(int[] stones) {
        
        //understand
        //if null, then what?
        //does it matter where the new stone value is inputted in arr?

        //match: array manipulation

        //plan
        //make y equal to the max and x equal to second max
        //write logic when crushing x and y accordingly
        //make sure process keeps going until arr len = 1

        //implement
        if(stones.length == 0) {
            return 0;
        }
    
        while(getLength(stones) > 1){
            //find y
            int y = 0;
            int yIndex = 0;
            for(int i = 0; i < stones.length; i++) {
                if(stones[i] > y) {
                    y = stones[i];
                    yIndex = i;
                }
            }

            //destroying y
            stones[yIndex] = 0;

            //find x
            int x = stones[0];
            int xIndex = 0;
            for(int j = 0; j < stones.length; j++) {
                if(stones[j] > x) {
                    x = stones[j];
                    xIndex = j;
                }
            }

            //destroying x
            stones[xIndex] = 0;

            if(x != y) {
                stones[yIndex] = y - x;
            }
        }

        //returning last stone standing
        for(int i = 0; i < stones.length; i++) {
            if(stones[i] != 0) {
                return stones[i];
            }
        }
        return 0;
    }
}