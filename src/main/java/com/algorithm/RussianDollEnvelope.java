package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Qestion:https://leetcode.com/problems/russian-doll-envelopes/
 * You have a number of envelopes with widths and heights given as a pair of integers (w, h).
 * One envelope can fit into another if 
 * and only if both the width and height of one envelope is greater than the width and height of
 * the other envelope.
 * 
 * What is the maximum number of envelopes can you Russian doll? (put one inside other)
 * 
 * @author Zhanghj
 *
 */
public class RussianDollEnvelope {
	
	/**
	 * �ⷨһ��˫��forѭ�������Ӷ�O(n2)
	 * @param envelopes
	 * @return
	 */
	public int maxEnvelopes(int[][] envelopes) {
		if(envelopes==null||envelopes.length==0)
	        return 0;
		Arrays.sort(envelopes,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] != o2[0]){
					return o1[0] - o2[0]; 
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		int max=1;
		int[] result = new int[envelopes.length];
		Arrays.fill(result, 1);
		for(int i = 0; i < envelopes.length; i++){
			for(int j = 0; j < i; j++){
				if((envelopes[i][0] > envelopes[j][0]) && (envelopes[i][1] > envelopes[j][1]))
					result[i] = Math.max(result[i], result[j]+1);
			}
			max = Math.max(result[i], max);
		}
		return max;
	}
	
	/**
	 * �ⷨ�������ö��ֲ���-O(n log n)
	 * @param envelopes
	 * @return
	 */
	public int maxEnvelopesByBinarySearch(int [][] envelopes) {
		if (envelopes == null || envelopes.length == 0) {
			return 0;
		}
		Arrays.sort(envelopes,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] != o2[0]){
					return o1[0] - o2[0]; 
				} else {
					return o2[1] - o1[1];//����-- width��ͬ�Ĳ���Ƕ��
				}
			}
		});
		List<Integer> resultList = new ArrayList<Integer>();
		int lo,hi,mid;
		for(int i = 0; i < envelopes.length; i++){
			if ((resultList.size() == 0) || (resultList.get(resultList.size()-1) < envelopes[i][1])) {
				resultList.add(envelopes[i][1]);
			}
			lo = 0;
			hi = resultList.size()-1;
			while(lo < hi){
				mid = (lo + hi)/2;
				if(resultList.get(mid) < envelopes[i][1]){
					lo = mid + 1;
				} else {
					hi = mid;
				}
			}
			resultList.set(hi, envelopes[i][1]);
		}
		return resultList.size();
	}
}
