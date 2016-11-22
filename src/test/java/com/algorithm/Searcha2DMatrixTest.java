package com.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class Searcha2DMatrixTest {

	private Searcha2DMatrix searcha2dMatrix = new Searcha2DMatrix();
	private int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
	
	@Test
	public void searcha2DMatrix() {
		boolean found = searcha2dMatrix.searchMatrix(matrix, 3);
		Assert.assertTrue(found);
		System.out.println(found);
	}
}
