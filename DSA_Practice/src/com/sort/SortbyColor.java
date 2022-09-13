package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortbyColor {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(0,1,2,0,1,2);
		
     System.out.println(sortColors(A));
	}
	 static List<Integer> sortColors(List<Integer> A) {
         //Use Pointer approach 
        //Two point at the ends i,j.
       //Third scans array k. 
        //If you have 0 or 2. Move to respective end.
       //Else Increase.
         int n=A.size();
         int i=0;
         int j=n-1;
         int k=0;

         if(A.size()==1){
             return A;
         }

         while(k<=j){
              if(A.get(k)==0){
                  Collections.swap(A,k,i);
                  i++;
                  k++;
              }else if(A.get(k)==1){
                  k++;
              }else if(A.get(k)==2){
                  Collections.swap(A,k,j);
                  j--;
                 // k++;
              }
         }    
         
      return A;

   }
}
