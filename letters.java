package leetcode;

import java.util.*;
public class letters {
	public static void main(String[] args) {
		  
		String a = "protechsoft";
		System.out.println("the ;etter is :"+(missing(a)));
		
		String b = "engineering";
		System.out.println("the letter is : "+(missing(b)));
		
	}
	public static char missing(String a) {
		
		char[] s = a.toCharArray();
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i] == s[j]) {
					return s[i];
				}
			}
		}
		return '0';
	}
}
