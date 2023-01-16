package com.bindarysearch;

/*Given an integer A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM THE STANDARD LIBRARY.

NOTE: Do not use the sqrt function from the standard library. Users are expected to solve this in O(log(A)) time.



Problem Constraints
0 <= A <= 1010



Input Format
The first and only argument given is the integer A.



Output Format
Return floor(sqrt(A))



Example Input
Input 1:

 11
Input 2:

 9


Example Output
Output 1:

 3
Output 2:

 3


Example Explanation
Explanation:

 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.*/

/*Solution Approach
Think in terms of binary search.

Let us say S is the answer.

We know that 0 <= S <= x.

Consider any random number r.

If r*r <= x, S >= r , i.e. S would lie towards right of r

If r*r > x, S < r. , i.e. S would lie towards left of r

Maybe try to run a binary search for S.*/


public class SquareRootofIntege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(29));
	}
	
	   //TC:O(logN)
    //SC:O(1)
    // we use binarySearch
    public static int sqrt(int A) {
        long left=1,rigth=A,ans=0;

        while(left<=rigth){
           // this will divide the search in two part 
            long mid=(left+rigth)/2;

            if(mid*mid==A){
                return (int)mid;
            }
// we check if mid*mid is less to A then go to rigth for better ans and also update the ans
            if(mid*mid<A){
                ans=mid;
                left=mid+1;
            }
// here we are check if mid*mid greater than given A the find ans in left side for this we write this condition 
            if(mid*mid>A){
                rigth=mid-1;
            }
        }

        return (int)ans;
    }

}
