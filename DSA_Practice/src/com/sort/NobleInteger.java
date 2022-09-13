package com.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(2, 1);
		
		Collections.sort(A);
		 
	      if(A.get(A.size()-1)==A.size()-(A.size()-1)-1){
	          System.out.println(1);
	      }

	    for(int i=0;i<A.size()-1;i++){
	    
	         if((A.get(i)==A.size()-i-1)&&A.get(i)!=A.get(i+1))
	        System.out.println(1);
	     
	    }
	    System.out.println(-1);
	}

}
