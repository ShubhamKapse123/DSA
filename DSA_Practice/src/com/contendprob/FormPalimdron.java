package com.contendprob;

public class FormPalimdron {

	public static void main(String[] args) {
		String A="aabb";
		
	      System.err.println(solve(A));
	      
	      System.out.println(Math.pow(2, 1));

	}
	
	static int solve(String A) {
		
		   int[] arr = new int[26];
		   
			   for(int k=0;k<A.length();k++) {
				   arr[A.charAt(k)-'a']+=1;
			   }
		      
		      int oddnumbe=0;
		      
		      for(int i=0;i<26;i++) {
	
		    	  if(arr[i]%2!=0) {
		    		  oddnumbe++;
		    	  }
		      }
		      
		      return oddnumbe<=1?1:0;
	}

}
