package com.algorithm;

/**
 * https://leetcode.com/problems/path-sum/ 
 * 112. Path Sum
 * @author Zhanghj @ 2016年12月21日
 *
 */
public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		if(root.left == null && root.right == null && sum - root.val == 0) return true;
		return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
	}
}
