package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.
//
//The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
//
//Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
//
//Find and return the required subarray.
//
//NOTE:
//
//    1. If there is a tie, then compare with segment's length and return segment which has maximum length.
//    2. If there is still a tie, then return the segment with minimum starting index.
//
//
//Input Format:
//
//The first and the only argument of input contains an integer array A, of length N.
//Output Format:
//
//Return an array of integers, that is a subarray of A that satisfies the given conditions.
//Constraints:
//
//1 <= N <= 1e5
//-INT_MAX < A[i] <= INT_MAX
//Examples:
//
//Input 1:
//    A = [1, 2, 5, -7, 2, 3]
//
//Output 1:
//    [1, 2, 5]
//
//Explanation 1:
//    The two sub-arrays are [1, 2, 5] [2, 3].
//    The answer is [1, 2, 5] as its sum is larger than [2, 3].
//
//Input 2:
//    A = [10, -1, 2, 3, -4, 100]
//
//Output 2:
//    [100]
//
//Explanation 2:
//    The three sub-arrays are [10], [2, 3], [100].
//    The answer is [100] as its sum is larger than the other two.
public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = Arrays.asList(8986143, -5026827, 5591744);
		ArrayList<Integer> val= new ArrayList();
		val.addAll(A);
		maxset(val);
	}
	
	  public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
	        ArrayList<Integer> result=new ArrayList();
	        //TC:O(N) SC:O(N);
	        //taking -1 because it help for manuplating the index because 0 also the minimun index we take 
	        // for createing the new result index. 
	        int min=-1,result_min=-1;
	        int max=-1,result_max=-1;
	        long sum=0,result_sum=0;
	        
	        int n=A.size();

	        for(int i=0;i<n;i++){
	            //check the positive value
	            if(A.get(i)>=0){
	                sum+=A.get(i);
	                // this min for new array starting index
	                if(min==-1){
	                    min=i;
	                }
	                //max for end index of the new array;
	             max=i;
	           }else{
	               //reseting the all value tha negative value we get
	               sum=0;
	               min=-1;
	               max=-1;
	           }
	        
	        //check the sum and result sum of be some in some conditon 
	        if(sum==result_sum){
	            //if this is same then we check the min and max is greater than result min and max 
	            // then set the new result in result_min and result_max
	            if(result_max-result_min<max-min){
	                result_max=max;
	                result_min=min;
	            }
	        }else if(result_sum<sum){
	            //check the sum is greater then final_sum the obviousely we
	            //nes to update value with new one
	            result_sum=sum;
	            result_max=max;
	            result_min=min;
	        }
	        
	        }

	        //this check if max resut value will be negative becaue of the 0,0,-1,0 problem 
	        // 0 also be the max sum array
	              if(result_max==-1){
	                return result;
	              }
	// finally we set all value that rang of result_min to result_max
	/// this rang array we return
	            for(int j=result_min;j<=result_max;j++){
	                result.add(A.get(j));
	            }

	            return result;  
	    }

}
