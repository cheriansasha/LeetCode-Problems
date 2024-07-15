class Solution {
    public int mySqrt(int x) {
        //match
        //binary search

        //plan
        //initalize base case, start, middle, and end ints
        //find number based on binary search

        //implement
        if(x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int mid = -1;
        int end = x;

        //keep going until cant keep looking on left or right side of range
        while(start <= end) {
            mid = start + ((end - start) / 2);
            //we need to search for smaller numbers
            //gotta keep long to keep real value in place
            if((long) mid * (long) mid > x) {
                end = mid - 1;
            }
            else if(mid * mid == x) {
                return mid;
            }
            else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}