package com.basicprosolve;

import java.util.Arrays;
import java.util.List;

public class littleponymax {
	public static void main(String[] args) {
		
	
	List<Integer> A= Arrays.asList(2,4,3,1,5);
	int B=3;
	 int flag = -1;
     int count = 0;
     // Checking if B exist in list
     for(int i = 0; i<A.size();i++){
         if(A.get(i) == B){
             // intializing flag to 1 if B is found
             flag = 1;
             break;
         }
     }
     //if B found in list
     if(flag == 1){
         //Checking for no. of elements greater than B
         for(int i = 0;i<A.size();i++){
             if(A.get(i)>B)
                 count++;
         }

         System.out.print(count);
     }
     //if B not found in list
     else{
        System.out.print(flag);
     }    
     
	}
}
