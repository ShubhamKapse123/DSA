package com.sort;

/*Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= min(|A|, 500)

1 <= A[i] <= 109



Input Format
The first argument is an integer array A.

The second argument is integer B.



Output Format
Return the Bth smallest element in given array.



Example Input
Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2.*/

//The algorithm of selection sort should be used.
//The selection sort algorithm sorts an array by repeatedly
//finding the minimum element (considering ascending order)
//from unsorted part and putting it at the beginning.
//You need to get the minimum element to the beginning of the array
//only B times as you require the Bth element.
public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2, 1, 4, 3, 2};
      System.out.println(kthsmallest(arr,3));
	}
	
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    //this porblem is sorted by the using seletion sorted
    //TC:O(N)
    //SC:O(1)
	static int  kthsmallest(final int[] A, int B) {
        int n=A.length;
        for(int i=0;i<n;i++){
            int min_ind=i, min_val=A[i];
            for(int j=i;j<n;j++){
                if(A[j]<min_val){
                    min_ind=j;
                    min_val=A[j];
                }
            }

            //this is swaping of the minum value put into current position that correct position 
         int temp=A[i];
         A[i]=min_val;
         A[min_ind]=temp;

        }

        return A[B-1];
    }

}
