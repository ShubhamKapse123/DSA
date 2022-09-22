package com.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PairsWitGivenXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {5, 4, 10, 15, 7, 6};
        System.out.println(solve(a,5));
	}
	
	  static int solve(int[] A, int B) {
	        Set<Integer> map= new HashSet();
	        int c=0;
	        
	     
	        
	       

	        for(int i=0;i<A.length-1;i++){
	            map.add(A[i]^A[i+1]);
	        }
	        

	        
	      

	        for(Integer val:map){
	   
	            if(val==B){
	     
	            c++;
	            }
	        }

	       return c;

	    }

}
