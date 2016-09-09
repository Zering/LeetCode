package com.algorithm;
/**
 * Q:https://leetcode.com/problems/generate-parentheses/
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
 * @author zhanghj
 * 
 */
import java.util.*;

public class GeneratorParenthesis {
	
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backtrack("", res, n, n);
        return res;
    }

    public static void backtrack(String sublist, List<String> res, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(sublist);
            return;
        }
        if (left > right)
            return;
        if (left > 0)
            backtrack(sublist + "(", res, left - 1, right);
        if (right > 0)
            backtrack(sublist + ")", res, left, right - 1);
    }
    
}
