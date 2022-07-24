package com.basicprosolve;
import java.lang.*;
import java.util.*;
/*Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user*/
public class SummationGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int num=sc.nextInt();
        int sum=0;
         for(int i=1;i<=num;i++){
            sum=sum+i;
         }
        System.out.print(sum);
    }
}
