package com.algorithm;

/**
 * 
 * Q:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * @author Zhanghj
 *
 */
public class TwoSumSortedArray {
	
	/**
	 * 复杂度O(n2)
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++)
        	for(int j = i + 1; j < numbers.length; j++){
        		if(numbers[i] + numbers[j] == target){
        			return new int[]{i+1,j+1};
        		}
        	}
        return null;
    }
	
	/**
	 * 复杂度O(nlogn)
	 * @return
	 */
	public int[] twoSumBetter(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		int sum;
		while(i < j){
			sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
				continue;
			} 
			if (sum > target) {
				j--;
				continue;
			}
			if (sum == target) {
				return new int[]{i+1,j+1};
			}
		}
		return null;
	}
	
}
