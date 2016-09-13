package com.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class RansomNoteTest {

	private RansomNote ransomNote = new RansomNote();
	private final static String RANSOMNOTE = "aa";
	private final static String MAGEZINE = "aab";
	
	@Test
	public void canConstruct() {
		boolean result = ransomNote.canConstruct(RANSOMNOTE, MAGEZINE);
		Assert.assertTrue(result);
	}
	
	@Test
	public void canConstructByAlphabetical() {
		boolean result = ransomNote.canConstructByAlphabetical(RANSOMNOTE, MAGEZINE);
		Assert.assertTrue(result);
	}
}
