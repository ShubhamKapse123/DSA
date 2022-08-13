package com.arraysproblems;

import java.util.Arrays;

/*You are given an integer array A.

Decide whether it is possible to divide the array into 
one or more subarrays of even length such that the first and last
element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).*/

import java.util.List;

public class EvenSubarrays {
	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(2, 4, 8, 6);
        int n=A.size();
        String res="NO";
         if(n%2==0 && A.get(n-1)%2==0 && A.get(0)%2==0){
              res="YES";           
        }
         System.out.print(res);
    }
        


}
