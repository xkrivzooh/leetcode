package xyz.xkrivzooh.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode78 https://leetcode-cn.com/problems/subsets/
 * 解法思路，逐个枚举，空集的幂集只有空集，每增加一个元素，让之前幂集中的每个集合，追加这个元素，就是新增的子集。
 */
public class Solution78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		//添加空集合
		result.add(new ArrayList<>());
		for (int element : nums) {
			//此处需要注意for循环中动态add元素
			int resultSize = result.size();
			for (int i = 0; i < resultSize; i++) {
				List<Integer> newItem = new ArrayList<>(result.get(i));
				newItem.add(element);
				result.add(newItem);
			}
		}
		return result;
	}
}


//////////////////
//使用回溯思想
//class Solution {
//	private List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
//
//	public List<List<Integer>> subsets(int[] nums) {
//		if (nums == null || nums.length == 0) {
//			return result;
//		}
//		process(nums, new ArrayList<>(), 0);
//		return result;
//	}
//
//	private void process(int[] nums, List<Integer> resultElement, int start) {
//		result.add(new ArrayList<>(resultElement));
//		for (int i = start; i < nums.length; i++) {
//			resultElement.add(nums[i]);
//			process(nums, resultElement, i + 1);
//			resultElement.remove(resultElement.size() -1);
//		}
//	}
//}
