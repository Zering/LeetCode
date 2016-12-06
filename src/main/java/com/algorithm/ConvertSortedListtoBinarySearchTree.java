package com.algorithm;
/**
 * 109. Convert Sorted List to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * @author Zhanghj @ 2016年12月5日
 *
 */
public class ConvertSortedListtoBinarySearchTree {

	public TreeNode sortedListToBST(ListNode head) {
        return toBST(head, null);
    }
	
	private TreeNode toBST(ListNode head,ListNode tail){
		if (head == tail) {
			return null;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		//通过快慢指针的方式获取到中间节点
		while(fast != tail && fast.next != tail){
			fast = fast.next.next;
			slow = slow.next;
		}
		//当快指针走完链表时，满指针处于中间位置
		TreeNode thead = new TreeNode(slow.val);
		thead.left = toBST(head, slow);
		thead.right = toBST(slow.next, tail);
		return thead;
	}
}
