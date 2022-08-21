package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatingSubarraysEasy {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(0, 0, 0, 1, 1, 0, 1);
		int B=0;
		int n=list.size();
		
		// k is the length of sub array
		int k=2*B+1;
		//centerIndex list using for storing the center index
		ArrayList<Integer> centerIndex=new ArrayList<>(k);
	
		 //if B==0 so, each index in the array acts as the center of 
		//alternating sequences of lengths 1.
		if(B==0) {
			for(int i=0;i<n;i++) {
				centerIndex.add(i);
			}
		}else {
		
		int start=0,end=k-1;
		
		while(start<=n-k) {
			int val=0;
			// this inner loop help to find out special index that is center index
			for(int i=start+1;i<=end;i++) {
				
				// here is checking the sub that alternating or not if yes is continue or not
				//it's break;
				if(list.get(i)!=list.get(i-1)) {
					val=i;
					continue;
				}else {
					break;
				}
			}
			
			
			
			// checking the length of  sub array are 
			//alternating or not if yes add center index of subarray(2*B+1) into list
			if(val==end) {
				centerIndex.add(start+B);
			}
			
			start++;end++;
			
		}
		}
		
		System.out.print(centerIndex);
			
	
	}

}
