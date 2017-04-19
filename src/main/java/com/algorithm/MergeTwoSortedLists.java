package com.algorithm;

/**
 * 21.Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author Zhanghj @ 2016年10月19日
 *
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l2 == null)
			return l1;
		if (l1 == null)
			return l2;
		ListNode result;
		if (l1.val < l2.val) {
			result = l1;
			result.next = mergeTwoLists(l1.next, l2);
		} else {
			result = l2;
			result.next = mergeTwoLists(l1, l2.next);
		}
		return result;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@SuppressWarnings("unused")
	@Override
	public String toString() {
		if(this == null) return null;
		StringBuilder sb = new StringBuilder();
		ListNode temp = this;
		while(temp != null){
			sb.append(temp.val).append("-->");
			temp = temp.next; 
		}
		sb.delete(sb.length()-3, sb.length());
		return sb.toString();
	}

}