package com.algorithm;

/**
 * 342. Power of Four
 * q:https://leetcode.com/problems/power-of-four/
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

	Example:
	Given num = 16, return true. Given num = 5, return false.
	
	Follow up: Could you solve it without loops/recursion?
 * 
 * @author Zhanghj @ 2016年10月19日
 *
 */
public class PowerOfFour {
	
    public boolean isPowerOfFour(int num) {
        if(num == 1)
        	return true;
        while (num % 4 == 0 && num != 0) {
			num = num/4;
			if (num == 1) {
				return true;
			}
		}
        
        return false;
     }
    
    public boolean isPowerOfFourInALine(int num) {
		return Integer.toString(num, 4).matches("10*");
	}
}
