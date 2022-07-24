package com.basicprosolve;
import java.lang.*;
import java.util.*;

//For a given number A, print its multiplication table having the first 10 multiples.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

       for(int i=1;i<=10;i++){
        System.out.println(num+" * "+i+" = "+num*i);
       }
    }
}
