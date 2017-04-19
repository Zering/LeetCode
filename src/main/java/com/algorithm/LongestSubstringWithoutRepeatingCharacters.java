package com.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * #/description
 * 
 * Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author zhanghaojie
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * O(n2)
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		for (int cycle = 0; cycle < s.length(); cycle++) {
			Set<Character> set = new HashSet<>();
			for (int j = cycle; j < s.length(); j++) {
				if (!set.add(s.charAt(j))) {
					break;
				}
				maxLength = Math.max(set.size(), maxLength);
			}
		}
		return maxLength;
	}

	/**
	 * O(n)
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstringBetter(String s) {
		if (s.length() == 0)
			return 0;
		Map<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				// j记录重复字符的起点-->即 该字符上一次出现的位置的下一个下标点
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			maxLength = Math.max(maxLength, i - j + 1);
		}
		return maxLength;
	}
}
