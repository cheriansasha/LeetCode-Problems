class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int middle = 0;
        int right  = nums.length - 1;
        int temp;

        while(middle <= right) {
            if(nums[middle] == 0) {
                //swap left and middle
                temp = nums[middle];
                nums[middle] = nums[left];
                nums[left] = temp;
                //update left & middle
                left++;
                middle++;
            }
            else if(nums[middle] == 2) {
                //swap right and middle
                temp = nums[middle];
                nums[middle] = nums[right];
                nums[right] = temp;
                //update right
                right--;
            }
            else {
                middle++;
            }
        }
        
    }
}