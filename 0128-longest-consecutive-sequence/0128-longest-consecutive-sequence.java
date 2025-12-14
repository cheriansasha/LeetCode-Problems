class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        //sort array
        Arrays.sort(nums);

        //set curr streak & longest streak
        int currStreak = 1;
        int longestStreak = 1;

        //loop thru sorted arr
        for(int i = 1; i < nums.length; i++) {

            //skip first element & dupes
            if(nums[i] == nums[i-1]) {
                continue;
            }

            //calc current streak
            if(nums[i] == nums[i-1]+1) {
                currStreak += 1;
            }
            else {
                if(longestStreak < currStreak) {
                    longestStreak = currStreak;
                }
                currStreak = 1;
            }
        }

        return Math.max(longestStreak, currStreak);
    }
}