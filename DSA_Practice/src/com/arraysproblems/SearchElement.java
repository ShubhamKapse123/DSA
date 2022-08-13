package com.arraysproblems;

import java.util.Scanner;

/*You are given an integer T (number of test cases).
You are given array A and an integer B for each test case. 
You have to tell whether B is present in array A or not.*/

public class SearchElement {
	  public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	        Scanner sc= new Scanner(System.in);     
	         int t=sc.nextInt();
	         
	         for(int i=0;i<t;i++){
	              int chek=sc.nextInt();
	             boolean check=false;
	             int  al[]= new int[chek];
	         
	              for(int j=0;j<chek;j++){
	             al[j]=sc.nextInt();
	              }

	               int b=sc.nextInt();
	              boolean flag=false;
	         
	         for(int k=0;k<al.length;k++)
	         {
	             if(b==al[k])  
	              flag=true;      
	         }
	         if(flag==true)
	         System.out.println(1);
	         else
	         System.out.println(0);
	     }
	   
	    }
}
