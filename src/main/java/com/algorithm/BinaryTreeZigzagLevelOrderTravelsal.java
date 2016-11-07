package com.algorithm;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 103. Binary Tree Zigzag Level Order Traversal
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * @author Zhanghj @ 2016年11月7日
 *
 */
public class BinaryTreeZigzagLevelOrderTravelsal {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				if (list.size() % 2 == 0) {
					subList.add(queue.poll().val);
				} else {
					subList.add(0,queue.poll().val);
				}
			}
			list.add(subList);
		}
		return list;
    }
}
