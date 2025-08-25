package leetcode;

import java.util.HashSet;
import java.util.Set;

public class substring {
   public static void main(String[] args) {
       
	   //Input: s = "pwwkew"
			   //Output: 4
	   String s = "pwwkew";
	   int res = lengthOfLongestSubstring(s);     // without repetation
	   System.out.println(res);
  }
   public static int lengthOfLongestSubstring(String s) {
	   char[] a = s.toCharArray();
	   int max = 0;
	   for (int i = 0; i < a.length; i++) {
		for (int j = i; j < a.length; j++) {
			Set<Character> c = new HashSet<>();
			for (int k = i; k <= j; k++) {
				if(!(c.contains(a[k]))) {
					c.add(a[k]);
				   System.out.print(c);
				}
				System.out.print(" ");
			}
			System.out.println();
			for (Character num : c) {
				max = Math.max(max, c.size());
			}
			
		}
	}
	   return max;
   }
}
