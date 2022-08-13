package com.arraysproblems;
/*Given an array A, find the size of the smallest subarray such
that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.*/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestMinMax {

	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(343, 291, 963, 165, 152 );
		int n=arr.size();
		int min=Collections.min(arr);
		int max=Collections.max(arr);
		int minindex=-1;
		int maxindex=0;
		int ans= Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr.get(i)==min) {
				minindex=i;
			}
			
			if(arr.get(i)==max) {
				maxindex=i;
			}
			if(minindex!=-1&&maxindex!=-1)
			 ans= Math.min(ans, Math.abs(maxindex-minindex)+1);
		}
		
		System.out.print(ans);

	}

}
