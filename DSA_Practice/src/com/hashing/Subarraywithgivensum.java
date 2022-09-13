package com.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/*Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.*/
public class Subarraywithgivensum {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b=solve(a,5);
		
		for(int i=0;i<b.length;i++) {
			System.err.print(b[i]);
		}
	
		
		
	}
	
	public static int[] solve(int[] A, int B) {
        HashMap <Long,Integer> map = new HashMap<>();
        long pf = 0;
        int start=-1;
        int end=-1;
        for(int i=0; i<A.length; i++){
            pf=pf+A[i];
            if(map.containsKey(pf-B)){
            
                start=map.get(pf-B)+1;
                end=i;
                 break;
            }
            if(pf==B){
                start=0;
                end=i;
                break;
            }
            map.put(pf,i);
        }
         int[] res={-1};
        if(start==-1 && end==-1){
            return res;
        }
        int e=0;
        int[] arr= new int[end-start+1];
        System.out.println(start+"---"+end);
        for(int i=start; i<=end; i++){
            arr[e]=A[i];
            e++;
        }
        return arr;
    }

}
