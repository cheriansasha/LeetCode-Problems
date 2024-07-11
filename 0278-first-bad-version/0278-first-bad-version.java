/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1;
        int right = n;
        int mid;

        while(left <= right) {
            mid = left + (right - left) / 2;

            //if current version is good
            if(isBadVersion(mid) == false) {
                left = mid + 1;
            }
            //if current version - 1 is good
            else if (isBadVersion(mid - 1) == false) {
                return mid;
            }
            //if current version is bad
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}