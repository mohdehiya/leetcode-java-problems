package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listinteger {
   public static void main(String[] args) {
            
	   List<List<Integer>> listOfLists = new ArrayList();
       List<Integer> list1 = Arrays.asList(1, 2, 3);
       
       List<Integer> list2 = Arrays.asList(4, 5);
    
       List<Integer> list3 = Arrays.asList(6, 7, 8, 9);

       listOfLists.add(list1);
       listOfLists.add(list2);
       listOfLists.add(list3);
       System.out.println(listOfLists);
   }
     }

