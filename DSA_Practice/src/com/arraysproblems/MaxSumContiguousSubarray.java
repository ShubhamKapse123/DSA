package com.arraysproblems;

import java.util.Arrays;
import java.util.List;


/*Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output
Output 1:

 10 
Output 2:

 6 


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6. 
*/


public class MaxSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arr= Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
	}
	
	// Kadane's Algorithm
	public int maxSubArray( List<Integer> A) {      
        int size=A.size();

        /* variable max stores the maximum sum of contiguous subarray found so far, Everytime there is 
        a positive-sum value in max_ending compare it with max and update
         max if it is greater than max.*/
       int max = Integer.MIN_VALUE;

       // maintain a variable max_ending that stores the maximum sum contiguous subarray ending at current index
       int  max_ending= 0;

       for (int i = 0; i < size; i++) {
           max_ending = max_ending + A.get(i);
           if (max < max_ending)
               max = max_ending;
           if (max_ending < 0)
               max_ending = 0;
       }

    
      return max;
   }
}
