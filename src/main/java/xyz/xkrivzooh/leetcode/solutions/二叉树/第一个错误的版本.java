/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) {
            if (isBadVersion(n)) {
                return n;
            }
        }

        int left = 1;
        int right = n;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean bad = isBadVersion(mid);
            if (bad) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}