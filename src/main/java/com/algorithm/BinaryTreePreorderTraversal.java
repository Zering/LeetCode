package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/**
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * @author Zhanghj @ 2016年11月7日
 *
 */
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		Stack<TreeNode> nodes = new Stack<>();
		TreeNode cur = root;
		while (cur != null || !nodes.isEmpty()) {
			while (cur != null) {
				nodes.push(cur);
				list.add(cur.val);
				cur = cur.left;
			}
			cur = nodes.pop();
			cur = cur.right;
		}
		return list;
    }
}
