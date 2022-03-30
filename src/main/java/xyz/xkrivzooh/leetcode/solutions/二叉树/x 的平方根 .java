class Solution {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        mySqrt(8);
        for (int i = 0; i < 16; i++) {
            System.out.println("" + i + " -> " + mySqrt(i));
        }
    }
}