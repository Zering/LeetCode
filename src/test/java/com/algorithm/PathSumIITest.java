package com.algorithm;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class PathSumIITest {
	
	@Test
	public void pathSum() {
       /*测试树
	              5
	             / \
	            4   8
	           /   / \
	          11  13  4
	         /  \    / \
	        7    2  5   1
        */
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		PathSumII pathSumII = new PathSumII();
		List<List<Integer>> result = pathSumII.pathSum(root, 22);
		
		System.out.println(JSON.toJSONString(result));
	}
	
}
