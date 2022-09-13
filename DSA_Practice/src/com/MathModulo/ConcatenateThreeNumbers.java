package com.MathModulo;
/*Problem Description
Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47 


Example Output
Output 1:

 102030 
Output 2:

 434755 


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030 
Explanation 2:

 43 + 47 + 55 = 434755 */

import java.util.ArrayList;
import java.util.Collections;

public class ConcatenateThreeNumbers {
	public static void main(String[] args) {
		
	int A=2;
	int B=3;
	int C=4;
	
	   int ans=0;
	     ArrayList<Integer> arr= new ArrayList();
	     arr.add(A);
	     arr.add(B);
	     arr.add(C);
	     
	     Collections.sort(arr);

	     ans=arr.get(0)*10000+arr.get(1)*100+arr.get(2);

	}
}
