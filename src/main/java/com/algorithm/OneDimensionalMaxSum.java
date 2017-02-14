package com.algorithm;

/**
 * 问题的输入时具有n个浮点数的向量x，输出是输入向量的任意连续子向量中的最大和。例如输入向量包含以下10个元素

	31 -41 59 26 -53 58 97 -93 -23 84
		   ↑            ↑
		   2            6

	那么该程序输出为x[2..6]的和，即187.
	
	问题解析：http://zering.me/2017/02/14/One-Dimensional-Max-Sum/
 * @author Zhanghj @ 2017年2月14日
 *
 */
public class OneDimensionalMaxSum {

	public static void main(String[] args) {
		int[] x = new int[]{31,-41,59,26,-53,58,97,-93,-23,84};
		
		int method1Result = method1(x);
		int method2Result = method2(x);
		int method2bResult = method2b(x);
//		int method3Result = method3(x, 0, x.length-1);
		int method4Result = method4(x);
		
		System.out.println("浅显算法结果：" + method1Result);
		System.out.println("第一个平方算法结果：" + method2Result);
		System.out.println("第二个平方算法结果：" + method2bResult);
//		System.out.println("分治算法结果：" + method3Result);
		System.out.println("扫描(线性)算法结果：" + method4Result);
		
	}
	
	
	/**
	 * 浅显程序，复杂度O(n3)
	 * @param x
	 * @return
	 */
	public static int method1(int[] x){
		int maxsofar = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += x[k];
				}
				maxsofar = Math.max(maxsofar, sum);
			}
		}
		
		return maxsofar;
	}
	
	public static int method2(int[] x) {
		int maxsofar = 0;
		for (int i = 0; i < x.length; i++) {
			int sum = 0;
			for (int j = i; j < x.length; j++) {
				sum += x[j];
				maxsofar = Math.max(maxsofar, sum);
			}
		}
		return maxsofar;
	}
	
	
	public static int method2b(int[] x) {
		int cumarr[] = new int[x.length]; //记录前i的和
		cumarr[0] = x[0];
		for (int i = 1; i < x.length; i++) {
			cumarr[i] = cumarr[i-1] + x[i];
		}
		int maxsofar = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i; j < x.length; j++) {
				if (i == 0) {
					int sum = cumarr[j];
					maxsofar = Math.max(maxsofar, sum);
				} else {
					int sum = cumarr[j] - cumarr[i - 1];
					maxsofar = Math.max(maxsofar, sum);
				}
			}
		}
		return maxsofar;
	}
	
	//测试时爆栈了，暂时排除该方法
//	public static int method3(int[] x,int low,int high) {
//		if (1 > high) {
//			return 0;
//		}
//		if (1 == high) {
//			return Math.max(0, x[low]);
//		}
//		int m = (low + high)/2;
//
//		int lmax = 0,lsum = 0;
//		for (int i = m; i >= 1; i--) {
//			lsum += x[i];
//			lmax = Math.max(lmax, lsum);
//		}
//		
//		int rmax = 0,rsum = 0;
//		for (int i = m + 1; i <= high; i++) {
//			rsum += x[i];
//			rmax = Math.max(rmax, rsum);
//		}
//		
//		int ma = method3(x, low, m);
//		int mb = method3(x,m+1,high);
//		int mc = lmax + rmax;
//		
//		
//		return mc >= ma ? mc : ma >= mb ? ma : mb;
//	}
	
	public static int method4(int[] x) {
		int maxsofar = 0;
		int maxendinghere = 0;
		for(int i = 0; i < x.length; i++){
			maxendinghere = Math.max(maxendinghere + x[i], 0);
			maxsofar = Math.max(maxsofar, maxendinghere);
		}
		return maxsofar;
	}
}
