package com.algorithm;

import java.util.LinkedList;

/**
 * Q:https://leetcode.com/problems/sliding-window-maximum/
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. 
 * Each time the sliding window moves right by one position.
 * For example,
 * Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.
	Window position                Max
	---------------               -----
	[1  3  -1] -3  5  3  6  7       3
	 1 [3  -1  -3] 5  3  6  7       3
	 1  3 [-1  -3  5] 3  6  7       5
	 1  3  -1 [-3  5  3] 6  7       5
	 1  3  -1  -3 [5  3  6] 7       6
	 1  3  -1  -3  5 [3  6  7]      7
 * Therefore, return the max sliding window as [3,3,5,5,6,7].
 * @author Zhanghj
 *
 */
public class SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0 || k > nums.length)
        	return new int[0];
        int[] result = new int[nums.length-k+1];
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0;i < nums.length;i++){
        	while(!list.isEmpty() && nums[i] >= nums[list.getLast()]){
        		list.removeLast();
        	}
        	list.addLast(i);
        	if(i+1-k > list.getFirst()){
        		list.removeFirst();
        	}
        	if(i+1 >= k)
        		result[i+1-k] = nums[list.getFirst()];
        }
        return result;
    }
}
