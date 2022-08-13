package com.arraysproblems;

import java.util.Scanner;

/*Given an integer array A of size N and an integer B, 
you have to print the same array after rotating it B times towards the right.*/

public class RotationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
       
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] input = new int[n];

        for(int i=0;i<n;i++)
        {
                input[i]= sc.nextInt();
        }

         int round= sc.nextInt(),ls=input.length-1;

        round%=input.length;
         
        if(round<=input.length){
         reverseArray(input,0,ls);
         reverseArray(input,0,round-1);
         reverseArray(input,round,ls);
        }
     
       for(int i=0;i<input.length;i++)
        {
             System.out.print(input[i]+" ");
        }
     
    }

    static void reverseArray(int arr[],int start, int end){
        int temp;

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
