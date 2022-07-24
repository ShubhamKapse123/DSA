package com.basicprosolve;
import java.lang.*;
import java.util.*;
/*For each given integer A, you have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.*/
public class PerfectNumber {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int N= sc.nextInt();
	      while(N>0)
	      {
	       int a= sc.nextInt();
	       int sum=0;

	      for(int i=1;i<a;i++){
	          if(a%i==0)
	             sum=sum+i;            
	      }
	      
	      if(sum==a){
	      System.out.println("YES");
	      }else{
	      System.out.println("NO");
	      }
	      N--;
	      }
	    }
}
