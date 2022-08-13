package com.arraysproblems;

import java.util.ArrayList;

/*Given an array A and an integer B. A pair(i, j) in the array is
a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.*/

public class GoodPair {
	  public int solve(ArrayList<Integer> A, int B) {
	        for(int i=0;i<A.size();i++){

	            for(int j=i+1;j<A.size();j++){          
	                    if(A.get(i)+A.get(j)==B){
	                      return 1;
	                }
	            }

	        }
	        return 0;
	    }
}
