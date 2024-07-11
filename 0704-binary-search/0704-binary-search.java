class Solution {
    public int search(int[] nums, int target) {

        // //previous soln- O(n), not O(logn) = need new soln
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;


        //match: arrays, for loop, index manipulation

        //plan:
        //if no elems, ret -1 

        //implement:
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while(left <= right) {
            mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}