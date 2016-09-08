package com.algorithm;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class SlideingWindowMaximumTest {

	private final static int[] TESTNUMS= new int[]{1,3,-1,-3,5,3,6,7};
	private final static int K = 3;
	
	private SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
	
	@Test
	public void maxSlidingWindow() {
		int[] result = new int[TESTNUMS.length+1-K];
		result =slidingWindowMaximum.maxSlidingWindow(TESTNUMS, K);
		System.out.println(JSON.toJSONString(result));
	}
}
