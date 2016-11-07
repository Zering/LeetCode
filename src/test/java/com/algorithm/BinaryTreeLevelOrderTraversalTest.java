package com.algorithm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {

	@Test
	public void levelOrdelTraversal() {
		/**
				3
			    / \
			   9  20
			     /  \
			    15   7 
		 */
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> list = new LinkedList<>();
		BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
		list = binaryTreeLevelOrderTraversal.levelOrder(root);
		int i = 1;
		for (List<Integer> list2 : list) {
			for(Integer integer : list2){
				System.out.println("level"+ i +": "+ integer);
			}
			i++;
		}
	}
}
