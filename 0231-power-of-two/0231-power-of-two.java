class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0) {
            return false;
        }
        else if(n == 1) {
            return true;
        }
    
        int start = 1;
        int mid;
        int end = n;

        while(start <= end) {
            mid = start + ((end - start) / 2);

            if(Math.pow(2, mid) > n) {
                end = mid - 1;
            }
            else if(Math.pow(2, mid) == n) {
                return true;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}