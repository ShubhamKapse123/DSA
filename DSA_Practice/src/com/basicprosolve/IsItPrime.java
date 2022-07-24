package com.basicprosolve;
import java.lang.*;
import java.util.*;

/*Given an integer A, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.*/

public class IsItPrime {
	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        int input=sc.nextInt();  
	        boolean test=true;
	          for(int i=2;i*i<=input;i++){
	            if(input%i==0)
	               test= false;           
	        }

	        if(test)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	    }
	 
}
