package com.MathModulo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.

Since the answer may be large, return the answer modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 106



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 2
Input 2:

 A = [5, 17, 100, 11]
 B = 28


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:

 All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5). 
 So total 4 pairs.*/
public class PairSumdivisiblebyM {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1, 2, 3, 4, 5);
		
		solve(list,2);

	}
	
	 // TC:O(N),SC:O(N)
    public static int solve(List<Integer> A, int B) {
        int finalCount=0;
        int n=A.size();
        //this is use for store the frequency of 0 or non 0 mode element 
        long arrCount[]= new long[B];
        
// make mode of all elemet and increment the element frequency that store in this arrCount
        for(int i=0;i<n;i++){
            int reminder=A.get(i)%B;
            arrCount[reminder]++;
            }
//take the first index element frequency  
        long x=arrCount[0];
        finalCount+=(x*(x-1))/2;
// for even number cases
        if(B%2==0){
            long y=arrCount[B/2];
            finalCount+=(y*(y-1))/2;
        }
 // normal number cases  
        int i=1,j=B-1;

        while(i<j){
            finalCount+=arrCount[i]*arrCount[j];
            i++;
            j--;
        }
        

        return (int)(finalCount % 1000000007); 
    }

}
