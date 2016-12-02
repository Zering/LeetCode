package com.algorithm;
/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 108. Convert Sorted Array to Binary Search Tree
 * @author Zhanghj @ 2016年12月2日
 *
 */
public class ConvertSortedArraytoBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
			return null;
		}
        
        return builder(0, nums.length-1, nums);
    }
	
	private TreeNode builder(int low,int high,int[] nums){
		if (low > high) {
			return null;
		}
		int mid = low + (high - low)/2;
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = builder(low, mid-1, nums);
		root.right = builder(mid+1, high, nums);
		
		return root;
	}
}
