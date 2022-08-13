package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pickfrombothsides {
public static void main(String[] args) {
	List<Integer> arr= Arrays.asList(5, -2, 3 , 1, 2);
	int B=3;
	int sum=0;
	
	ArrayList<Long> prefixsum= new ArrayList<>();
	
	prefixsum.add((long)arr.get(0));
	for(int i=1;i<arr.size();i++) {
		prefixsum.add(prefixsum.get(i-1)+arr.get(i));		
	}
	
	int l=B;
	int r=0;
	
	while(r<=B) {
		if(l<0) {
			sum=Math.max((prefixsum.size()-1)-(prefixsum.size()-1-r),sum);
		}else {
				sum=(int) Math.max((prefixsum.get(l)+prefixsum.size()-1)-(prefixsum.size()-1-r),sum);
			}
		
		l--;
		r++;
		
	}
	
	System.out.print(sum);
	
}
	


}
