package xyz.xkrivzooh.leetcode.solutions;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 如果 tmp > 0，则说明 tmp 对结果有增益效果，则 tmp 保留并加上当前遍历数字
 * 如果 tmp <= 0，则说明 tmp 对结果无增益效果，需要舍弃，则 tmp 直接更新为当前遍历数字
 * 每次比较 tmp 和 result的大小，将最大值置为result，遍历结束返回结果
 * 时间复杂度：O(n)
 */
public class Solution53 {
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
