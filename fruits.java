package leetcode;

public class fruits {
 public static void main(String[] args) {
	
	// Input: basket1 = [4,2,2,2], basket2 = [1,4,1,2]
		//	 Output: 1
	 
	 int[] basket1 = {4,2,2,2};
	 int[] basket2 = {1,4,1,2};
	 long res = minCost(basket1,basket2);
	 System.out.println(res);
  }
  public static long minCost(int[] basket1 , int[] basket2) {
	  int count = 0;
	  for (int i = 0; i < basket1.length; i++) {
		  
		for (int j = 0; j < basket2.length; j++) {
			if(basket1[i] == basket2[j] ) {
				basket2[j]=Integer.MIN_VALUE;
				count++;
			}
		}
	}
	  if(count >= 3)
		    return -1; 
	  
	  return 1;
  }
}
