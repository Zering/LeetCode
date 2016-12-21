package com.algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 * 113. Path Sum II
 * @author Zhanghj @ 2016年12月21日
 *
 */
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		List<Integer> currentList = new LinkedList<>();
		pathSum(root, sum, currentList, result);
		return result;
	}
	private void pathSum(TreeNode root,int sum,List<Integer> currentList,List<List<Integer>> result){
		if(root == null) return;
		currentList.add(root.val);
		if (root.left == null && root.right == null && sum == root.val) {
			result.add(new LinkedList<>(currentList));
			currentList.remove(currentList.size()-1);
			return;
		} else {
			pathSum(root.left, sum-root.val, currentList, result);
			pathSum(root.right, sum-root.val, currentList, result);
		}
		currentList.remove(currentList.size() - 1);
	}
}
