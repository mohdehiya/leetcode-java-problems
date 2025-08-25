package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
		  
    	int[] a = {-1,0,1,2,-1,-4};
    	
    	List<List<Integer>> res = threeSum(a);
    	System.out.println(res);
    	
	}
    public static List<List<Integer>> threeSum (int[] nums){
    	   
    	  List<List<Integer>> res = new ArrayList<>();
          Arrays.sort(nums);

          for (int i = 0; i < nums.length - 2; i++) {
             
              if (i > 0 && nums[i] == nums[i - 1]) continue;

              int left = i + 1;
              int right = nums.length - 1;

              while (left < right) {
                  int sum = nums[i] + nums[left] + nums[right];

                  if (sum == 0) {
                      res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                   
                      while (left < right && nums[left] == nums[left + 1]) left++;
                   
                      while (left < right && nums[right] == nums[right - 1]) right--;

                      left++;
                      right--;
                  } else if (sum < 0) {
                      left++; 
                  } else {
                      right--; 
                  }
              }
          }

          return res;
    }
}
