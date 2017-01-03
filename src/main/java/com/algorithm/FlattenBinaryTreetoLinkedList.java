package com.algorithm;

/**
 * 114. Flatten Binary Tree to Linked List
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * @author Zhanghj @ 2017年1月3日
 *
 */
public class FlattenBinaryTreetoLinkedList {
	/*private TreeNode pre;
    public void flatten(TreeNode root) {
        if (root == null) return;
        
        flatten(root.right);
        flatten(root.left);
        
        root.right = pre;
        root.left = null;
        
        pre = root;
        
    }*/
	
	public void flatten(TreeNode root) {
		if (root == null) return;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		root.left = null;
		
		flatten(left);
		flatten(right);
		
		root.right = left;
		
		TreeNode cur = root;
		while (cur.right != null) cur = cur.right;
		cur.right = right;
	}
}
