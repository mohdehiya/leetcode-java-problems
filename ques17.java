package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ques17 {
  
public static void main(String[] args) {
		
    	//Input: digits = "23"
        //Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    	
    	String digit ="67";
    	
    	List<String> res=letter(digit);
    	System.out.println(res);
	}
    public static List<String> letter(String digit){
    	   List<String> a = new ArrayList(); 
    	   
    	   String [] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	   
    	   a.add("");
    	   
    	   for (char digits : digit.toCharArray()) {
			
    		   List<String> temp = new ArrayList<>();
    		   String letter = letters[digits - '0'];   // ASCI VALUE OF 2 IS 50 AND 0 IS 48
    	
    		   for (String result : a) {
    				for (char mapping :letter.toCharArray()) {
    				temp.add(result + mapping); 	
    				}
    			}
    		   a=temp;
		}
    	   
    	   return a;
    }
}
