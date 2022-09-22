package com.hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Diff2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A=Arrays.asList(1, 5, 4, 1, 2);
		System.out.println(diffPossible(A,0));
		int K=0;
		int val=(int) Math.pow(2, K-1);
	}
	  static int diffPossible(final List<Integer> A, int B) {
	      	HashSet<Integer> hs = new HashSet<>();
		    	
		    	        for(int i=0;i<A.size();i++)	    	
		    	        {
	                            //change the equation A[j]-A[i]=B i.e A[j]=A[i]-B also, A[j]-A[i]=B i.e A[j]=A[i]+B
		    	            int sum1=A.get(i)+B;
		    	            int sum2=A.get(i)-B;
		    	            if(hs.contains(sum1) || hs.contains(sum2))
		    	            return 1;
		    	            hs.add(A.get(i));
	                    }
		    	        return 0;
	    }
}
	    
	    

