package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;

/*Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows).


Problem Constraints

1 <= N <= 1000

0 <= A[i] <= 1



Input Format

The only argument given is the integer matrix A.



Output Format

Return the row with the maximum number of 1.



Example Input

Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 1, 1, 1]    ]


Example Output

Output 1:

 0
Output 2:

 1


Example Explanation

Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 1 has maximum number of 1s.*/

public class Rowwithmaximumnumbeofones {

	public static void main(String[] args) {

		
		ArrayList<ArrayList<Integer>> A= new ArrayList<ArrayList<Integer>>();

		solve(A);
	}
	
	 public static int solve(ArrayList<ArrayList<Integer>> A) {
	        int n=A.size();
	        int finalmaxCount=0;
	        int result=0;
	        int resultnew=0;
	        for(int i=0;i<n;i++){
	            int maxCount=0;
	            for(int j=0;j<n;j++)
	            {
	                if(A.get(i).get(j)==1)
	                {
	                    maxCount++;
	                }
	            }

	            if(maxCount>finalmaxCount)
	            {
	                finalmaxCount=maxCount;
	                result=i;
	            }else if(maxCount==finalmaxCount)
	            {
	                resultnew=i;
	                //this for minimum row that value 1 max
	               if(result>resultnew)
	               {
	                   result=resultnew;
	               }
	            }
	        }
	        return result;
	    }

}
