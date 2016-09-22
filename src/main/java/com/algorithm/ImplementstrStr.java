package com.algorithm;

public class ImplementstrStr {
	
 	public int strStr(String haystack, String needle) {
        if(needle == null)
        	return 0;
        if(haystack == null)
        	return -1;
        for(int i = 0;i < haystack.length()-needle.length()+1;i++){
        	int j = 0;
        	for(;j < needle.length();j++){
        		if(haystack.charAt(i+j) != needle.charAt(j))
        			return -1;
        	}
        	if(j == needle.length())
        		return i;
        }
        return -1;
    }
}
