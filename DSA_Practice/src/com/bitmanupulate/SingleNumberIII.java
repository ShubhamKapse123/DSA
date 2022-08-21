package com.bitmanupulate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.


Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.*/
public class SingleNumberIII {
public static void main(String[] args) {
	 ArrayList<Integer> arr= new ArrayList<Integer>();

	 List<Integer> A= Arrays.asList(186, 256, 102, 377, 186, 377);
	    boolean check=false;
	      for(int i=0;i<A.size();i++){
	    	  check=false;
	          for(int j=0;j<A.size();j++){
	              if(i!=j)
	                {
	                    if(A.get(i)==A.get(j)){
	                        check=true;
	                        break;
	                    }
	                }          
	                
	            }

	               
	    if(check==false){
	   arr.add(A.get(i));
	    }
	      }

	        
	      Collections.sort(arr);
     System.out.print(arr);
     }

}
