package leetcode;

import java.util.Arrays;

public class Median_of_Two_array {

	
	public static void main(String[] args) {
		  
		int[] a = {1,2};
		int[] b = {3};
		
		double res = findMedianSortedArrays(a,b);
		System.out.println(res);
	}
	public static double findMedianSortedArrays(int[] num1, int[] num2) {
		
		  int[] s =new int[num1.length + num2.length];
		  int m = 0,n = 0;
		  
		  for (int i = 0; i < s.length; i++) {
			if(m < num1.length) {
				s[i] = num1[m];
				m++;
			}
			else {
				s[i] = num2[n];
				n++;
			}
		}
		  
		  Arrays.sort(s);
		  //System.out.println(Arrays.toString(s));
		  if(s.length %2 == 0) {
			  double  mid = (s[s.length/2 - 1] + s[s.length/2])/2.0;
			  return mid;
		  }
		  else {
			  int mid = s[s.length/2];
			  return mid;
		  }
	}
}
