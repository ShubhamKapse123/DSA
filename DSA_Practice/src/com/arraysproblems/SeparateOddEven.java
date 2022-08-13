package com.arraysproblems;

import java.util.ArrayList;
import java.util.Scanner;
/*You are given an integer T denoting the number of test cases.
For each test case, you are given an integer array A.

You have to put the odd and even elements of array 
A in 2 separate arrays and print the new arrays.

NOTE: Array elements should have the same relative order as in A.*/

public class SeparateOddEven {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	     int T=sc.nextInt();


	    
	     while(T>0){
	          ArrayList<Integer> even= new ArrayList();
	           ArrayList<Integer> odd= new ArrayList();
	         int N=sc.nextInt();
	         int arr[]= new int[N];
	         
	         for(int i=0;i<N;i++){
	     
	         arr[i]=sc.nextInt();
	         }


	         for(int i=0;i<arr.length;i++){
	             if(arr[i]%2==0){
	                 even.add(arr[i]);
	             }else{
	                 odd.add(arr[i]);
	             }
	         }
	        
	  
	        for(int o:odd){
	            System.out.print(o+" ");
	        }
	        System.out.println("");
	          for(int e:even){
	            System.out.print(e+" ");
	        }
	         System.out.println("");
	        
	        T--;

	     }
	        

	}

}
