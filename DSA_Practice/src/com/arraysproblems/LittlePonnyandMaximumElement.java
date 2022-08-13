package com.arraysproblems;

import java.util.Arrays;
import java.util.List;

/*Little Ponny is given an array, A, of N integers. 
In a particular operation, he can set any element of the array equal to -1.

He wants your help in finding out the minimum number of
operations required such that the maximum element of the resulting array is B. 
If it is not possible, then return -1.*/
public class LittlePonnyandMaximumElement {
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(2, 4, 3, 1, 5);
		int B=3,count=0;
		
		if(A.contains(B)) {
			for(int num:A) 
			{
				if(num>=B) {
					count++;
				}
				
			}
		}else {
			count=-1;
		}
		
		System.out.print(count);
		
		
	}

}
