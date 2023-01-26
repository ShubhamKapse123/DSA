package com.hashing;

import java.util.HashSet;


//
//Given an unsorted integer array A of size N.
//
//Find the length of the longest set of consecutive elements from array A.
//
//
//
//Problem Constraints
//1 <= N <= 106
//
//-106 <= A[i] <= 106
//
//
//
//Input Format
//First argument is an integer array A of size N.
//
//
//
//Output Format
//Return an integer denoting the length of the longest set of consecutive elements from the array A.
//
//
//
//Example Input
//Input 1:
//
//A = [100, 4, 200, 1, 3, 2]
//Input 2:
//
//A = [2, 1]
//
//
//Example Output
//Output 1:
//
// 4
//Output 2:
//
// 2
//
//
//Example Explanation
//Explanation 1:
//
// The set of consecutive elements will be [1, 2, 3, 4].
//Explanation 2:
//
// The set of consecutive elements will be [1, 2]

/*One solution is to sort the elements and then find the longest subarray with consecutive elements. But this will take O(NlogN).

An efficient way is to use hashing.

First, create an empty hash, and for each element, we insert and update the hash table and maxCount.

We only insert the element which is not yet inserted.
Calculate the lcount, i.e., the longest consecutive element till the current element - 1.
Calculate the rcount, i.e., the longest consecutive element from the current element + 1.

Update hMap[ele] (current element) = lcount + 1 + rcount.

Also, update the maxCount.*/

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {7, 1, 3, 4, 1, 7};
		longestConsecutive(A);
	}
	
	
	 static int longestConsecutive(final int[] A) {
	        //TC:O(N)
	        //SC:O(N)
	        HashSet<Integer> HS= new HashSet<>();
	        int ans=0;
	        //adding all array element into HashSet
	        for(int i=0;i<A.length;i++){
	            HS.add(A[i]);
	        }
	    //iterate the array and check if element -1 is present in HashSet then we not we take as first element
	    // is not present then we take as first element and  check x+1 contains in HashSet then check continius til the element
	    // not found in HashSet  then update the ans value comparing with  ans. we need max long length.
	        for(int i=0;i<A.length;i++){
	            int x=A[i];

	            if(!HS.contains(x-1)){
	                int count=1;
	                int y=x+1;

	                while(HS.contains(y)){
	                    y++;
	                    count++;
	                }
	                ans=Math.max(ans,count);
	            }
	            
	        }

	        return ans;
	    }

}
