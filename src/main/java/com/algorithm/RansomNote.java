package com.algorithm;
/**
 * 383. Ransom Note
 * Q:https://leetcode.com/problems/ransom-note/
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines, 
 * write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  
 * otherwise,  it  will  return  false.   
	Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
	Note:
	You may assume that both strings contain only lowercase letters.
		canConstruct("a", "b") -> false
		canConstruct("aa", "ab") -> false
		canConstruct("aa", "aab") -> true
 * @author Zhanghj
 *
 */
public class RansomNote {

	/**
	 * 解法一：O(n2)
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
	public boolean canConstruct(String ransomNote, String magazine) {
		boolean ret = true;
        byte[] bytes = new byte[magazine.length()];
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            boolean found = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (bytes[j] == 0 && magazine.charAt(j) == c) {
                    bytes[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                ret = false;
                break;
            }
        }

        return ret;
    }
	
	/**
	 * 字母表
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
	public boolean canConstructByAlphabetical(String ransomNote, String magazine) {
		int[] alphabetical = new int[26];
		for(int i = 0;i < magazine.length(); i++){
			alphabetical[magazine.charAt(i)-'a']++;
		}
		for(int j = 0;j < ransomNote.length(); j++){
			if(--alphabetical[ransomNote.charAt(j)-'a'] < 0 ){
				return false;
			}
		}
		return true;
	}
}
