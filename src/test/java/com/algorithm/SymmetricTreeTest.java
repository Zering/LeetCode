package com.algorithm;

import org.junit.Test;

public class SymmetricTreeTest {
	
	@Test
	public void SymmetricTree() {
		SymmetricTree symmetricTree = new SymmetricTree();
		/*[1,2,2,3,4,4,3]
			    1
			   / \
			  2   2
			 / \ / \
			3  4 4  3
			创建一个测试树*/
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		boolean result = symmetricTree.isSymmetric(root);
		System.out.println(result);
	}
}
