package twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.



Problem Constraints
1 <= N <= 104

0 <= A[i], B <= 105



Input Format
First argument is an one-dimensional integer array A of size N.

Second argument is an integer B.



Output Format
Return an integer denoting the count of all distinct pairs with difference equal to B.



Example Input
Input 1:

 A = [1, 5, 3, 4, 2]
 B = 3
Input 2:

 A = [8, 12, 16, 4, 0, 20]
 B = 4
Input 3:

 A = [1, 1, 1, 2, 2]
 B = 0


Example Output
Output 1:

 2
Output 2:

 5
Output 3:

 2


Example Explanation
Explanation 1:

 There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2} 
Explanation 2:

 There are 5 unique pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20} 
Explanation 3:

 There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.*/

//Solution Approach
//Let us formulate a two pointer approach to the this problem.
//We will first sort the given array and use two pointers i and j with i = 0, j = 1.
//We will have three conditions:
//
//1. A[j] - A[i] < B --> We will increase the pointer j.
//2. A[j] - A[i] > B --> We will increase the pointer i.
//3. A[j] - A[-] = B --> We will increase both the pointers and add 1 to the answer.
//
//Refer to the complete solution for more details.
public class PairswithGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 5, 3, 4, 2};
		System.out.print(solve(A, 3));
	}
    //TC:O(NlogN),SC:O(N)
    static  int solve(int[] A, int B) {
        Arrays.sort(A);
        Map<Integer,Integer> rmap= new HashMap<>();
        int i=0,j=1;
        int diff=Integer.MIN_VALUE;
        while(j<A.length&&i<A.length){
             diff=A[j]-A[i];

            if(diff<B){
                j++;
            }else if(diff>B){
                i++;
            }else if(diff==B){
                if(i!=j){
                    rmap.put(A[i],A[j]);
                }
                i++;
            }
        }

        return rmap.size();

        
    }
}
