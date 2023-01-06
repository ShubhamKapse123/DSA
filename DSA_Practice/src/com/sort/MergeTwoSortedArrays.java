package com.sort;

/*Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.



Problem Constraints
-1010 <= A[i], B[i] <= 1010



Input Format
First Argument is a 1-D array representing A.

Second Argument is also a 1-D array representing B.



Output Format
Return a 1-D vector which you got after merging A and B.



Example Input
Input 1:

A = [4, 7, 9 ]
B = [2, 11, 19 ]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

Merging A and B produces the output as described above.
Explanation 2:

 Merging A and B produces the output as described above.*/

//Approach
/*Use of additional space is allowed. So, maybe you should try collecting the output in a separate array.

Note: You need two pointers at the head of each array, and you need to compare the values at the head of the arrays to get the current minimum.

Since A is sorted, all values after the pointer are going to be bigger.
Since B is sorted, all values after the pointer are going to be bigger.
All values before the pointer have already been put in the result array.

Corner cases:

What if pointer 1 reaches the end of the array first?
What if pointer 2 reaches the end of the array first?
If pointer 1 reaches the end we can just keep on putting the elements from B in the result array while the pointer 2 does not reach the end.
The same process goes for if pointer 2 reaches the end.*/

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,4,5,7};
      int b[]= {11,7,44,20,5};
      
    System.out.println(solve(a,b));
	}

    //TC:O(N+M)
    //SC:O(N);
    static int[] solve(final int[] A, final int[] B) {
        //taking  3 index for 3 separate array 
        int i=0,j=0,k=0; int n=A.length;  int m=B.length;
        int C[]=new int[n+m];

// find the min value to compare the i and j value and whicherver is min add into new array
// then simply increase the count of min value index
        while(i<n && j<m){
            if(A[i]<B[j]){
                C[k]=A[i];
                k++;
                i++;
            }else{
              C[k]=B[j];
                k++;
                j++;   
            }
        }
// here adding the remain value after compare   
        while(i<n){
             C[k]=A[i];
                k++;
                i++;
         }

           while(j<m){
            C[k]=B[j];
                k++;
                j++;
        }

        return C;
    }
}
