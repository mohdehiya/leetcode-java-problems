package leetcode;

import java.util.Arrays;

public class reverse {
    
	public static void main(String[] args) {
		 
		int a = -123;
		int res = reverse(a);
	    System.out.println(res);
	}
	public static int reverse(int x) {
		
	  String str = Integer.toString(x);
	  //System.out.println(str);
	  String a = "";
	  for (int i = 0; i < str.length(); i++) {
		 if(!(str.charAt(i)-'0' >=0 && str.charAt(i)- '0' <=9)) {
			 a = a + str.charAt(i);
		 }
			 
	}
	  for (int i = str.length() - 1; i >=0; i--) {	  
		  if(str.charAt(i)-'0' >=1 && str.charAt(i)- '0' <=9) {
			  a = a + str.charAt(i); 
		  }
	}
	  //System.out.println(a);
	  int b = Integer.parseInt(a);
	  
	  return b;
  }
}
