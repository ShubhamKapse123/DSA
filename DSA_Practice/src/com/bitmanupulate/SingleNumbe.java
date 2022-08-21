package com.bitmanupulate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given an array of integers A, every element appears 
twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. 
Could you implement it without using extra memory?*/
public class SingleNumbe {
 public static void main(String[] args) {
	

	List<Integer> arr= Arrays.asList(1, 2, 2, 3, 1);
	
	Collections.sort(arr);
	int i=1;
	int val=arr.get(0);
	while(i<arr.size()) {
		val=val^arr.get(i);
	i++;	
	}
	
	System.out.print(val);
	
 }
}
