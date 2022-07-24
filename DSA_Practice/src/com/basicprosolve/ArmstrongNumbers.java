package com.basicprosolve;

import java.util.Scanner;


//You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
//If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

public class ArmstrongNumbers {
	
    public static  int returnPowCount(int n)
    {
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }

        return count;
         
    }

    public static int isAmstrong(int N){
       int powN=returnPowCount(N);
      int sum=0,temp=N;
      
      while(temp>0)
      {
          int r=temp%10;

          sum=sum+(int)Math.pow(r,powN);

          temp=temp/10;

      }  

//System.out.println(sum+"-------"+N);
          if(sum==N){
              return sum;
          }
          
          return 0;
          

    }

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       int N=sc.nextInt();

       for(int i=1;i<=N;i++){
    	   int u=isAmstrong(i);
           if(u==1||u>9){
       System.out.println(u);
           }
       }

    }

}
