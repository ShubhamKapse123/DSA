package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(2, 7, 11, 15); 
		int B=9;
		System.out.println(twoSum(A,B));
		
		

	

	}
	
	 static ArrayList<Integer> twoSum(List<Integer> A, int B) {
		 HashMap<Integer,Integer> cheker= new HashMap<>();
		 ArrayList<Integer> result= new ArrayList<>();
		
		 for(int i=0;i<A.size();i++) {
			 //here we check the existing key. key logic is B-Present index elemet it will produce value that should be present in map as key
             //if the value we will get then simply add into arr and +1 because we don't want zero base index.
			 if(cheker.containsKey(B-A.get(i))) {
				 result.add(cheker.get(B-A.get(i))+1);
				 result.add(i+1);
                 return result;
			 }
			 
			 //condition  for take lower index. if this condition not here then greater value replace the lower index
			 //and  take highest  index. 
			 if(!cheker.containsKey(A.get(i)))
			 cheker.put(A.get(i), i);
		 }
	
		return result;
	    }

}
