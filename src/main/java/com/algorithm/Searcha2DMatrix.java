package com.algorithm;
/**
 * 74. Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 * 
 * 240. Search a 2D Matrix II
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 * 解法相同
 * @author Zhanghj @ 2016年11月22日
 *
 */
public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0) return false;
        boolean found = false;
        int columns = matrix.length;
        int rows = matrix[0].length;
        int row = 0;
        int col = columns-1;
        while (row < rows && col >= 0) {
			if (matrix[col][row] == target) {
				found = true;
				break;
			} else if (matrix[col][row] > target) {
				-- col;
			} else {
				++ row;
			}
		}
        return found;
    }
}
