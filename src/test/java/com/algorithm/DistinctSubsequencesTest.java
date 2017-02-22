package com.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class DistinctSubsequencesTest {

	@Test
	public void numDistinct() {
		DistinctSubsequences distinctSubsequences = new DistinctSubsequences();
		String s = "rabbbit";
		String t = "rabbit";
		
		int result = distinctSubsequences.numDistinct(s, t);
		Assert.assertEquals(3, result);
	}
}
