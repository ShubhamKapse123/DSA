package com.bindarysearch;
/*Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the single element that appears only once.



Example Input
Input 1:

A = [1, 1, 7]
Input 2:

A = [2, 3, 3]


Example Output
Output 1:

 7
Output 2:

 2


Example Explanation
Explanation 1:

 7 appears once
Explanation 2:

 2 appears once*/

/*Solution Approach
Lets say the position of the element occuring once is x.
What property do you observe for the elements which are towards the left of x?

For any i from [0,x) ,we can say that

    if i is even A[i]==A[i+1]
    if i is odd  A[i]==A[i-1]
This cannot be said for elements from [x+1,n). Because in that case if i is even A[i]==A[i-1] and vice versa.

Therefore we just have to find the last index ‘j’ such that it satisfies the property of index from [0,x).
If we get j , then A[j+1] would be our answer.
*/
public class SingleElemeninSorteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(int[] A) {
	        int left=0,right=A.length;
	        while(left<=right){
	            int mid=(left+right)/2;
	            
	            //if the mid index element  is not equal to it closed left and right element 
	            // this the our ans
	            if(mid==0||mid==A.length-1 || A[mid]!=A[mid-1]&&A[mid]!=A[mid+1]){
	                return A[mid];
	            }

	            // here we check the start index is even or odd  because  we need the start ind is
	            // even then search element in left side other than right
	            if(mid%2==0){
	                if(A[mid]==A[mid+1])
	                left=mid+1;
	                if(A[mid]==A[mid-1])
	                right=mid-1;
	            }else{
	                if(A[mid]==A[mid-1])
	                left=mid+1;
	                if(A[mid]==A[mid+1])
	                right=mid-1;
	            }
	        }
	        return 0;
	    }

}
