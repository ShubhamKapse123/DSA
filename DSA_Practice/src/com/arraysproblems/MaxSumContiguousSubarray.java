package com.arraysproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Problem Description
//Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
//
//
//
//Problem Constraints
//1 <= N <= 1e6
//-1000 <= A[i] <= 1000
//
//
//
//Input Format
//The first and the only argument contains an integer array, A.
//
//
//
//Output Format
//Return an integer representing the maximum possible sum of the contiguous subarray.
//
//
//
//Example Input
//Input 1:
//
// A = [1, 2, 3, 4, -10] 
//Input 2:
//
// A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 
//
//
//Example Output
//Output 1:
//
// 10 
//Output 2:
//
// 6 
//
//
//Example Explanation
//Explanation 1:
//
// The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
//Explanation 2:
//
// The subarray [4,-1,2,1] has the maximum possible sum of 6. 


public class MaxSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> sublist1=(ArrayList<Integer>) Arrays.asList(2,1,10);
		
		 maxSubArray(sublist1);
	}
	
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    //TC:O(N)
    //SC:O(1)
    //This problem solve by using Kaden's Algo: This also remove the negavtival and
    // add only positive number in case of same value is negative. but all negative value contain array then 
    // conditon will change and we take all sum. in current val and compair with max value
    public static int maxSubArray(final List<Integer> A) {
        int currentval=0;
        int maxval=Integer.MIN_VALUE;

        for(int i=0;i<A.size();i++){
            currentval+=A.get(i);
            
            if(currentval>maxval){
                maxval=currentval;
            }

         if(currentval<0){
                currentval=0;
            }
          
        }

        return maxval;
    }


}
