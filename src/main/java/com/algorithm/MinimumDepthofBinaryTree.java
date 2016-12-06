package com.algorithm;
/**
 * 111. Minimum Depth of Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * @author Zhanghj @ 2016年12月5日
 *
 */
public class MinimumDepthofBinaryTree {

	public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
	
}
