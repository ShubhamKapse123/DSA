package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an integer array A containing N distinct 
integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater
than all the elements to its right side.

NOTE:The rightmost element is always a leader*/
public class Leadersinanarray {
public static void main(String[] args) {
	List<Integer> A= Arrays.asList(2, 4, 8, 6);
	   ArrayList<Integer> leadList= new ArrayList<>();
	      int n=A.size();
	      int max= A.get(n-1);
	      leadList.add(max);
	      for(int i=n-2;i>=0;i--){
	          if(A.get(i)>max){
	              leadList.add(A.get(i));
	              max=A.get(i);
	          }
	      }
}
}
