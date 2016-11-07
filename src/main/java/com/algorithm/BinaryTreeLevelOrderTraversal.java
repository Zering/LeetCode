package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * @author Zhanghj @ 2016年11月7日
 *
 */
public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return list;
		}
		queue.offer(root);
		while (!queue.isEmpty()) {
			int level = queue.size();
			List<Integer> subList = new LinkedList<>();
			for (int i = 0; i < level; i++) {
				if (queue.peek().left != null) 
					queue.offer(queue.peek().left);
				if (queue.peek().right != null) 
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			list.add(subList);
		}
		return list;
	}
}
