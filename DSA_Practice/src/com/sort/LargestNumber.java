package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
The first argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*/
public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(3, 30, 34, 5, 9);
		

		
		System.err.println(largestNumber(A));

	}
	
    static String largestNumber(final List<Integer> A) {
    	  ArrayList<String> sr= new ArrayList<>();
          for(Integer val:A) {
       		 
       		sr.add(String.valueOf(val));
       	 }
       	
       	String re="";
       	//Reason why take str1, str 2 eg. "9+34">"34+9" look like this. but actually compare like 934>349 here 9 will come first postion
       	sr.sort((str1,str2)-> (str2+str1).compareTo(str1+str2));
           
       	 for(String val:sr) {
       		 re+=val;
       	 }

       	 
       	 // if all array element contain 0.
       	 if (re.charAt(0) == '0')
             return "0";
    	 
    	 return re;
    }

}
