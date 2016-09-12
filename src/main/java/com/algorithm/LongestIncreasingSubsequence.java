package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q:https://leetcode.com/problems/longest-increasing-subsequence/
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
 * For example,
	Given [10, 9, 2, 5, 3, 7, 101, 18],
	The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
	
	Your algorithm should run in O(n2) complexity.
	
	Follow up: Could you improve it to O(n log n) time complexity?
 * 分析：http://zering.me/2016/09/02/Longest-Increasing-Subsequence/
 * @author Zhanghj
 *
 */
public class LongestIncreasingSubsequence {
	
	/**
	 * 复杂度O(n2)
	 * @param nums
	 * @return
	 */
	public int maxSequence(int[] nums){
		if(nums==null || nums.length==0)
	    	return 0;
		int[] max = new int[nums.length];
		Arrays.fill(max, 1);
		int result = 1;
	    for(int i=0; i<nums.length; i++){
	        for(int j=0; j<i; j++){
	            if(nums[i]>nums[j]){
	                max[i]= Math.max(max[i], max[j]+1);
	            }
	        }
	        result = Math.max(max[i], result);
	    }	 
	   return result;
	}
	
	/**
	 * 复杂度O(n log n)
	 * @param nums
	 * @return
	 */
	public int maxLIS(int[] nums) {
		if(nums==null || nums.length==0)
	        return 0;
		List<Integer> list = new ArrayList<Integer>();
		int i,j,mid;
		for(Integer num:nums){
			if(list.size() == 0 || num > list.get(list.size()-1))
				list.add(num);
			else {
				i = 0;
				j = list.size()-1;
				while(i < j){
					mid = (i+j)/2;
					if(list.get(mid) < num){
						i = mid+1;
					} else {
						j = mid;
					}
				}
				list.set(j, num);
			}
		}
		return list.size();
	}
}
