package com.bitmanupulate;
/*Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.


Problem Constraints
1 <= A <= 105


Input Format
The first argument is a single integer A.
The second argument is an integer array B.


Output Format
Return the number of subarrays with bitwise array 1.


Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]


Example Output
Output 1:
5
Output2:
2


Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1*/
import java.util.Arrays;
import java.util.List;

public class SubarrayswithBitwiseOR1 {
public static void main(String[] args) {
	List<Integer> B= Arrays.asList(1, 3, 5);
	int A=3;
	 long ans=0;
     long val=0;
   for(int i=0;i<A;i++)
     {
         //here it only add value of set bit
         //if value is unset bit the it will add existand val into the findal answer
       if(B.get(i)==1){
       val=(long)i+1;
       }
       
      ans+=val;
     }
   
   }

}
