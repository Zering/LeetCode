package com.algorithm;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class TwoSumSortedArrayTest {

	private TwoSumSortedArray twoSumSortedArray = new TwoSumSortedArray(); 
	private final static int[] TESTARRAY = new int[]{1,2,3,4,5,6,7,8};
	private final static int TARGET = 9;
	
	@Test
	public void twoSum() {
		int[] result = new int[2];
		result = twoSumSortedArray.twoSum(TESTARRAY, TARGET);
		System.out.println(JSON.toJSONString(result));
	}
	
	@Test
	public void twoSumBetter() {
		int[] result = new int[2];
		result = twoSumSortedArray.twoSumBetter(TESTARRAY, TARGET);
		System.out.println(JSON.toJSONString(result));
	}
}
