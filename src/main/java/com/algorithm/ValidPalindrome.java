package com.algorithm;
/**
 * 
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

	For example,
	"A man, a plan, a canal: Panama" is a palindrome.
	"race a car" is not a palindrome.
	
	Note:
	Have you consider that the string might be empty? This is a good question to ask during an interview.
	
	For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * @author Zhanghj @ 2016年10月19日
 *
 */
public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0,j = cs.length-1; i < j;) {
			if (!Character.isLetterOrDigit(cs[i])) i++;
			else if (!Character.isLetterOrDigit(cs[j])) j--;
			else if (Character.toLowerCase(cs[i++]) != Character.toLowerCase(cs[j--])) {
				return false;
			}
		}
        return true;
    }
}
