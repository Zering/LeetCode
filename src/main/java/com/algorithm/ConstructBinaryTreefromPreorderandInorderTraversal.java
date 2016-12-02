package com.algorithm;

/**
 * 105.Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder
 * -traversal/
 * 
 * @author Zhanghj @ 2016年12月2日
 *
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return builder(0, 0, inorder.length - 1, preorder, inorder);
	}

	public TreeNode builder(int preStart, int inStrat, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length - 1 || inStrat > inEnd) {
			return null;
		}
		//前序的第一个节点为根节点
		TreeNode root = new TreeNode(preorder[preStart]);
		// 当前节点在中序遍历中的位置
		int currentInInoreder = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == root.val) {
				currentInInoreder = i;
				break;
			}
		}
		//在中序遍历中，根节点左边的元素为左子树元素，根节点右边的元素为右子树元素
		root.left = builder(preStart + 1, inStrat, currentInInoreder - 1, preorder, inorder);
		root.right = builder(preStart + (currentInInoreder - inStrat) + 1, currentInInoreder + 1, inEnd, preorder,
				inorder);

		return root;
	}
}
