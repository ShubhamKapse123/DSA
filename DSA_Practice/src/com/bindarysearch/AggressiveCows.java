package com.bindarysearch;

import java.util.Arrays;

/*Problem Description
Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?



Problem Constraints
2 <= N <= 100000
0 <= A[i] <= 109
2 <= B <= N



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the largest minimum distance possible among the cows.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.
Explanation 2:

 The minimum distance will be 1.
 
 
 Approach:
 
 We�ll do the binary search to find the best possible maximum difference.

Since the maximum difference ranges between 0 to the max of array.
If we sort the array, the binary search starts with l = 0 and r = A[n-1], and we�ve to find the maximum distance.
 
 */


public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    //TC:(LogN+N*log(Arr[n-1]-arr[0]))
    //SC: O(1)
    static  int solve(int[] A, int B) {
        Arrays.sort(A);
        int l=1; int r=A[A.length-1]-A[0];
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(check(A,mid,B)){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }

        }

        return ans;
    }

    static boolean check(int[] A,int dist,int B){
        int c=1; int lst_Pos=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]-lst_Pos>=dist){
                c++;
                lst_Pos=A[i];

                  if(c==B){
                    return true;
                }
            }
        }
      
        return false;
    }

}
