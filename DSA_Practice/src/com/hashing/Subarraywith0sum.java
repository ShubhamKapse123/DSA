package com.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.*/
public class Subarraywith0sum {

	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(1,-1);
		
		HashSet<Long> hs= new HashSet<>();
		long sum=0;
		for(int i=0;i<arr.size();i++) {
			sum+=arr.get(i);
			
			if(sum==0||arr.get(i)==0||hs.contains(arr.get(i))) {
				System.out.println("1");
			}else {
				hs.add(sum);
			}
		}

	}

}
