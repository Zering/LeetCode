package com.algorithm;
/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * 106.Construct Binary Tree from Inorder and Postorder Traversal
 * @author Zhanghj @ 2016年12月2日
 *
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builder(0, inorder.length-1, postorder.length-1, inorder, postorder);
    }
    
    private TreeNode builder(int inStart,int inEnd,int postEnd,int[] inorder,int[] postorder){
    	if (inStart > inEnd || postEnd < 0) {
			return null;
		}
    	TreeNode root = new TreeNode(postorder[postEnd]);
    	int currentInInorder = 0;
    	for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == root.val) {
				currentInInorder = i;
				break;
			}
		}
    	
    	root.left = builder(inStart, currentInInorder-1, postEnd - (inEnd-currentInInorder) -1, inorder, postorder);
    	root.right = builder(currentInInorder+1, inEnd, postEnd-1, inorder, postorder);
    	
    	return root;
    	
    }
	
}
