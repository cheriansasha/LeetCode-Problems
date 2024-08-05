class Solution {
    public int findJudge(int n, int[][] trust) {
        //base case: if only 1 person in town and no trust circle
        if(n == 1 && trust.length == 0) {
            return 1;
        }

        //create count array keeping track of every person's aura points
        int[] count = new int[n + 1];

        //adding and subtracting people's aura points based on whether their 
        //truster or trustee
        for(int i = 0; i < trust.length; i++) {
            count[trust[i][0]] -= 1;
            count[trust[i][1]] += 1;
        }

        //find who in town is trusted by everyone (except themselves)
        for(int i = 0; i < count.length; i++) {
            if(count[i] == n - 1) {
                return i;
            }
        }

        //didn't find judge (no one had enough aura points)
        return -1;
    }
}