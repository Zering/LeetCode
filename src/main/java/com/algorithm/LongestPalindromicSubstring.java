package com.algorithm;
/**
 * 
 * Q:https://leetcode.com/problems/longest-palindromic-substring/
 * 5. Longest Palindromic Substring
 * Given a string S, find the longest palindromic substring in S.
 *  You may assume that the maximum length of S is 1000,
 *  and there exists one unique longest palindromic substring.
 * @author Zhanghj
 *
 */
public class LongestPalindromicSubstring {
	
	
	/**
	 * 暴力检索，O(n3),不被ac
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		if(s.isEmpty()||s == null)
			return null;
		int beginIndex = 0,endIndex = 0,longestLength = 0;
		String subString;
		for(int i=0;i<s.length();i++){
			for(int j = i + 1;j < s.length();j++){
				subString = s.substring(i,j);
				if(isPalindrome(subString) && subString.length() > longestLength){
					longestLength = subString.length();
					beginIndex = i;
					endIndex = j;
				}
			}
		}
		return s.substring(beginIndex, endIndex);
	}
	
	private boolean isPalindrome(String string) {
		if (string == null || string.isEmpty()) {
			return false;
		}
		for(int i=0;i < string.length()/2; i++){
			if(string.charAt(i) != string.charAt(string.length()-i-1))
				return false;
		}
		return true;
	}
	
	
	/**
	 * 以i为中心扩展检索回文，O(n2)，ac
	 */
	public String longestPalindromeExpandAroundCenter(String s) {
		if(s == null || s.isEmpty())
			return null;
		int beginIndex=0;
		int endIndex=0;
		for(int i = 0;i < s.length();i++){
			int len1 = expandAroundCenter(s, i, i); 
			int len2 = expandAroundCenter(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > endIndex-beginIndex){
				beginIndex = i - (len-1)/2;
				endIndex = i + len/2;
			}
		}
		return s.substring(beginIndex,endIndex+1);
	}
	
	private int expandAroundCenter(String s,int left,int right){
		int L = left;
		int R = right;
		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
			L--;
			R++;
		}
		return R-L-1;
	}
	
	/**
	 * Manacher's algorithm O(n)
	 * 参考地址：http://articles.leetcode.com/longest-palindromic-substring-part-ii
	 */
	
}
