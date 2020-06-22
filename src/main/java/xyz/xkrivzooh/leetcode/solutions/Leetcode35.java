package xyz.xkrivzooh.leetcode.solutions;

/**
 * 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class Leetcode35 {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (target <= nums[0]) {
            return 0;
        }

        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = nums[mid];
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //注意此处返回的是left
        return left;
    }
}
