package leetcode;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class twonumbers {
 public static void main(String[] args) {
	
	// l1 = [2,4,3], l2 = [5,6,4]
			// Output: [7,0,8]
	 
	    int[] l1 = {2,4,3};
	    int[] l2 = {5,6,4};
	    int[] res = addTwoNumbers(l1,l2);
	    System.out.println(Arrays.toString(res));
   }
    public static int[] addTwoNumbers(int[] l1 , int[] l2) {
    	
    	int frst = 0;
    	int secnd = 0;
    	for (int i = 0; i < l1.length; i++) {
			frst = frst*10 + l1[i];
		}
    	for (int i = 0; i < l2.length; i++) {
			secnd = secnd*10 + l2[i];
		}
    	int last = frst + secnd;
        String str = Integer.toString(last);
        int [] c = new int[str.length()];
        for (int i = 0; i < c.length; i++) {
			c[i] = str.charAt(i) - '0';
		}
        int[] d = new int[c.length];
        int m= c.length -1;
        for (int i = 0; i < d.length; i++) {
			d[i] = c[m];
			m--;
		}
    	
    	return d;
    	
    }
}
