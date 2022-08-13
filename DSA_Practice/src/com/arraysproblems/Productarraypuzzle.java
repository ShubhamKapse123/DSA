package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Productarraypuzzle {

	 public static void main(String[] args) {
		 
		

		 List<Integer> A= Arrays.asList(1, 2, 3, 4, 5);
		   int n=A.size();
	        ArrayList<Integer> premulti=new ArrayList<>(n);
		     ArrayList<Integer> result=new ArrayList<>(n);
	          
	         int  suffix[]=new int[n];
	        
		        
		        premulti.add(A.get(0));
		        for(int i=1;i<A.size();i++) {
		        	premulti.add(premulti.get(i-1)*A.get(i));
		        }

	            suffix[n-1]=A.get(n-1);
	            for(int j=n-2;j>=0;j--){
	                suffix[j]=suffix[j+1]*A.get(j);
	            }
	            
	            
		        
		        
	           result.add(suffix[1]);
	 
	           
	           
		     for(int i = 1; i<n-1;i++){
	                result.add(premulti.get(i-1) * suffix[i+1]);

	        }
		     
		         result.add(premulti.get(n-2));
		     
	            System.out.println(result);
	    
	    }

}
