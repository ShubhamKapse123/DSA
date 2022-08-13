package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sumofoddandevenindexed {
	
	/*You are given an integer array A of size N.

	You have to pick B elements in total. Some (possibly 0)
	elements from left end of array A and some (possibly 0)
	from the right end of array A to get the maximum sum.

	Find and return this maximum possible sum.

	NOTE: Suppose B = 4, and array A contains 10 elements, then

	You can pick the first four elements or can pick the
	last four elements, or can pick 1 from front and 3 from 
	the back, etc. You need to return the maximum possible sum of elements you can pick.*/
	
public static void main(String[] args) {
	 List<Integer> A= Arrays.asList(5, -2, 3 , 1, 2);
	 int B=3;
     int n = A.size();
     int []suff = new int[n + 1];

     suff[n - 1] = A.get(n-1);
     

     for(int i = n - 2; i >= 0; i--){
         suff[i] = A.get(i) + suff[i + 1];
     }

     for(int i = 0; i < suff.length; i++){
     System.out.print(suff[i] +" ");
     }
     
     
     
     
	  
	  int pref_sum = 0;
      int ans = suff[n - B];
      for(int i = 0; i < B; i++){
          pref_sum = pref_sum + A.get(i);
          int suff_sum = suff[n - B + (i + 1)];
          ans = Math.max(ans, pref_sum + suff_sum);
      }
      
     System.out.print(ans);
	  
         
}
}
