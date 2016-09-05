package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description �����ַ�� https://leetcode.com/problems/longest-increasing-subsequence/
 * ��һ��������������飬���ҳ���������������еĳ���
 * ������http://zering.me/2016/09/02/Longest-Increasing-Subsequence/
 * @author Zhanghj
 *
 */
public class LongestIncreasingSubsequence {
	
	/**
	 * @Description �ⷨһ��˫��forѭ��-O(n2)
	 * @param nums����������
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
	 * @Description �ⷨ�������ַ�-O(n log n)
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
