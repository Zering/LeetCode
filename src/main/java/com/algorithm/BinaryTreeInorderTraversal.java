package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * @author Zhanghj @ 2016年11月7日
 *
 */
public class BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
			return list;
		}
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !nodes.empty()) {
			while (cur != null) {
				nodes.push(cur);
				cur = cur.left;
			}
			cur = nodes.pop();
			list.add(cur.val);
			cur = cur.right;
		}
        return list;
    }
}
