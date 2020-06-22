package xyz.xkrivzooh.leetcode.solutions;

/**
 * 724. 寻找数组的中心索引
 * https://leetcode-cn.com/problems/find-pivot-index/
 */
public class Solution724 {

    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }

        int leftSumValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSumValue == (totalSum - nums[i] - leftSumValue)) {
                return i;
            }
            leftSumValue += nums[i];
        }

        return -1;

    }
}
