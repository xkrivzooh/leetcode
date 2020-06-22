package xyz.xkrivzooh.leetcode.solutions;

/**
 * 实现 strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 */
public class Solution28 {

	public int strStr(String haystack, String needle) {
		//此处返回0是为了和java中的indexOf的返回值一样
		if (haystack == null) return 0;
		if (needle == null) return 0;
		int haystackLength = haystack.length();
		int needleLength = needle.length();

		if (needleLength > haystackLength) {
			return -1;
		}

		//此处for 循环需要注意截止条件是(haystack.length() - needleLength + 1)
		for (int i = 0; i < (haystack.length() - needleLength + 1); i++) {
			int j = 0;
			while (j < needleLength) {
				if (haystack.charAt(i + j) == needle.charAt(j)) {
					j++;
				}
				else {
					//此处如果不加这个break，程序会多跑一会，导致超时
					break;
				}
			}
			if (j == needleLength) {
				return i;
			}
		}
		return -1;
	}
}
