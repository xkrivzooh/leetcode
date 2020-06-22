package xyz.xkrivzooh.leetcode.solutions;

/**
 *   [206] 反转链表
 *   https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 */


public class Solution206 {
	public static class ListNode {
		int val;

		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
}
