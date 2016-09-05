package com.algorithm;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LongestIncreasingSubsequenceTest {
	
	private final static int[] TESTSEQUENCE =  new int[]{10, 9, 2, 5, 3, 7, 101, 18}; 
	private LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
	
	@Test
	public void maxSequence(){
		int result = lis.maxSequence(TESTSEQUENCE);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void maxLIS() {
		int result = lis.maxLIS(TESTSEQUENCE);
		Assert.assertEquals(4, result);
	}

}
