package com.arraysproblems;

import java.util.Scanner;

/*Write a program to print maximum and minimum elements
of the input array A of size N where you have to take 
integer N and other N elements as input from the user.*/

public class MaxandMinofanArray {
	  public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	        Scanner sc= new Scanner(System.in);
	       int val=sc.nextInt();
	        int arr[] = new int[val];
	         
	       
	      
	       for(int i=0;i<val;i++){
	         arr[i]=sc.nextInt();
	        }

	        // int n=sc.nextInt();
	       int min=arr[0],max=arr[0];
	        for(int i=1;i<arr.length;i++){
	       
	          if(arr[i]<=min){
	            min=arr[i];
	          }else if(arr[i]>=max){
	            max=arr[i];
	          }
	           
	        }

	        System.out.print(max+" "+min);
	        

	    }
}
