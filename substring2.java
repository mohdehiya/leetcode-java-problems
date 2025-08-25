package leetcode;

import java.util.HashSet;
import java.util.Set;

public class substring2 {
	public static void main(String[] args) {
	       
		   //Input: s = "pwwkew"
				   //Output: 4
		   String s = "abcabcbb";
		   int res = lengthOfLongestSubstring(s);     // without repetation
		   System.out.println(res);
	  }
	   public static int lengthOfLongestSubstring(String s) {
		   char[] a = s.toCharArray();
		   int max = 0;
		   for (int i = 0; i < a.length; i++) {
			   Set<Character> c = new HashSet<>();
			for (int j = i; j < a.length; j++) {
				if(c.contains(a[j])) {
					break;
				}
				c.add(a[j]);
				max = Math.max(max, c.size());
			}
		}
		   return max;
	   }
}
