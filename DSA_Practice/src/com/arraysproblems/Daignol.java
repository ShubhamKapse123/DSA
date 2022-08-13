package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Daignol {


 public static void main(String[] args) {
	 ArrayList<ArrayList<Integer>> n= new ArrayList<>();
	 
	 n.add( new ArrayList<Integer>());
	 
	 n.add((ArrayList<Integer>) Arrays.asList(5, 6, 7, 8));
	 n.add((ArrayList<Integer>) Arrays.asList(9, 2, 3, 4));
	 
	 for(int i=0;i<n.size();i++) {
		 System.out.println(n.get(i));
	 }
	 
	
}
}
