package com.algorithm;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ThreeSumTest {

	private static final int[] nums = new int[]{-1,0,1,2,-1,-4};
	private ThreeSum threeSum = new ThreeSum(); 
	
	@Test
	public void ThreeSum() {
		List<List<Integer>> result = new LinkedList<>();
		result = threeSum.threeSum(nums);
		System.out.println(result);
	}
}
