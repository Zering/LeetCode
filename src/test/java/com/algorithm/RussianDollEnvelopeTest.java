package com.algorithm;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class RussianDollEnvelopeTest {

	private final static int[][] TESTENVELOPES = new int[][]{{4,5},{4,6},{6,6},{7,8},{2,3},{1,1}};
	private RussianDollEnvelope rde = new RussianDollEnvelope();
	
	@Test
	public void maxEnvelopes() {
		int actual = rde.maxEnvelopes(TESTENVELOPES);
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void maxEnvelopesByBinarySearch() {
		int actual = rde.maxEnvelopesByBinarySearch(TESTENVELOPES);
		Assert.assertEquals(5, actual);
	}
}
