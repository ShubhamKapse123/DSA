package com.sort;

/*Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 105


Input Format
The first argument is an integer array A.


Output Format
Return an integer array that is the sorted array A.


Example Input
Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]


Example Output
Output 1:
[1, 1, 3]
Output 2:
[1, 2, 3, 4]


Example Explanation
For Input 1:
The array in sorted order is [1, 1, 3].
For Input 2:
The array in sorted order is [1, 2, 3, 4].*/


/*Solution Approach
We will keep the count of frequency of each of the
elements of the array using a frequency array. Then
we will move from 1 to size of the the frequency array
and insert them in our final sorted array.

Time Complexity : O(N + K)
Space Complexity : O(K)
where N is the size and K is the maximum 
value of the given array*/
public class Count_Sort {

	public static void main(String[] args) {
		int [] par= {2,3,4,6,8,9,9,2,9,9,5,6};
		System.out.println(solve(par));

	}
	
    //O(N+R)
    //O(N+R)
    // solve by count sort algorithm 
    // step 1: make frequncy array sixe is max+1 (maximum value of given array plus one)
    //find the frequest of element and store into one array
    //step 2: make frequecy prefix array 
    // step 3: then take orginal array element as index of prefix array 
    // ans whichever value we found in frequecy prefix array this represent the position of answer array
    // store the value on this position.
public static int[] solve(int[] A) {
    int n=A.length;
    int max=0;
   
    for(int i=0;i<n;i++){
        max=Math.max(max,A[i]);
    }
//this is for the store the frequecy of element if we not use hashing
    int freqArr[]=new int [max+1];
    for(int i=0;i<n;i++){
        int element=A[i];
        freqArr[element]++;
    }

//this is frequecy prefix array 
    int freqArrPrefix[]= new int [max+1];
        freqArrPrefix[0]=freqArr[0];
      for(int i=1;i<freqArrPrefix.length;i++){
       freqArrPrefix[i]=freqArrPrefix[i-1]+freqArr[i];
      }

      int ans[]= new int[n];
//then take orginal array element as index of prefix array 
    // ans whichever value we found in frequecy prefix array this represent the position of answer array
    // store the value on this position. 
      for(int i=n-1;i>=0;i--){
          int idx=freqArrPrefix[A[i]]-1;
          ans[idx]=A[i];
          freqArrPrefix[A[i]]--;
      }       
    return ans;
}

}
