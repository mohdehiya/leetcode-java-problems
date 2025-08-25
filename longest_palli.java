package leetcode;

public class longest_palli {
      public static void main(String[] args) {
		 
    	  String s = "bb";
    	  String res = longestPalindrome(s);
    	  System.out.println(res);
	}
      public static String longestPalindrome(String s) {
    	  
    	  char[] a = s.toCharArray();
    	  int l = 0;
    	  int h = s.length()-1;
    	  boolean flag = true;
    	  String b = "";
    	  
    	  if(s.length() <=2 ) {
    		  b = b + a[l];
    	  }
    	  if(s.length() <= 1) {
    		  return s;
    	  }
    	 
    	  
    	  while (l <= h) {
    		  if(a[l] != a[h]) {
    			  flag = false;
    			  a[l] ='z';
    			  a[h]= 'z';  
    			  l++;
    			  h--;
    		  }
    		  else {
    			  l++;
    			  h--;
    		  }
    	  }
    	 for (int i = 0; i < a.length; i++) {
			if(a[i] != 'z') {
				b = b + a[i];
			}
		}
		
    	  return b;
      }
}
