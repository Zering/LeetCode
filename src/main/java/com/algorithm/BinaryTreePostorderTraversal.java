package com.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * 145. Binary Tree Postorder Traversal
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * @author Zhanghj @ 2016年11月7日
 *
 */
public class BinaryTreePostorderTraversal {
	
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> list = new LinkedList<>();
    	Stack<TreeNode> nodes = new Stack<>();
    	Map<TreeNode, Boolean> map = new HashMap<>();
    	nodes.push(root);
    	while (!nodes.isEmpty()) {
			TreeNode cur = nodes.peek();
			if (cur.left != null && !map.containsKey(cur.left)) {
				cur = cur.left;
				while (cur != null) {
					if (map.containsKey(cur)) 
						break;
					else 
						nodes.push(cur);
					cur = cur.left;
				}
				continue;
			}
			if (cur.right != null && !map.containsKey(cur.right)) {
				nodes.push(cur.right);
				continue;
			}
			
			TreeNode t = nodes.pop();
			map.put(t, true);
			list.add(t.val);
		}
    	return list;
    }
    
    /**
     * 只保存左子树的方法
     */
    public List<Integer> postorderTraversalBetter(TreeNode root) {
		LinkedList<Integer> list = new LinkedList<>();
		Stack<TreeNode> leftChildren = new Stack<>();
		TreeNode cur = root;
		while (cur != null) {
			list.addFirst(cur.val);
			if (cur.left != null) {
				leftChildren.push(cur.left);
			}
			cur = cur.right;
			if (cur == null && !leftChildren.isEmpty()) {
				cur = leftChildren.pop();
			}
		}
		
		return list;
	}
}
