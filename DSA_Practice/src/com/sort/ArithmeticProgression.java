package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticProgression {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(2, 1);
		solve(A);

	}
	
	 static int solve(List<Integer> A) {
	        Collections.sort(A);
	        int diff=A.get(A.size()-1)-A.get(A.size()-2);

	        for(int i=A.size()-2;i>=0;i--){
	             int val=A.get(i+1)-A.get(i);
	             if(val!=diff)
	             return 0;
	        }

	        return 1;
	    }

}
