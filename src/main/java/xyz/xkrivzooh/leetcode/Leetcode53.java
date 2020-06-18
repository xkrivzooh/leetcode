package xyz.xkrivzooh.leetcode;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Leetcode53 {
	public int maxSubArray(int[] nums) {
		int result = nums[0];
		int tmp = 0;
		for (int n : nums) {
			if (tmp > 0) {
				tmp = tmp + n;
			}
			else {
				tmp = n;
			}
			result = Math.max(result, tmp);
		}
		return result;
	}

}
