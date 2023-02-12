package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.

The number of digits in a Perfect number is even.

It is a palindrome number.

For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.



Problem Constraints
1 <= A <= 100000



Input Format
The only argument given is an integer A.



Output Format
Return a string that denotes the Ath Perfect Number.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 22
Output 2:

 1111


Example Explanation
Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221*/
public class PerfectNumbers {
	
	/*whole question is based on observation
   
    Series : 
    queue = 1, 2, 11, 12, 21, 22, 111, 112, 211, 212
    answer series 
    1 + reverse of 1 = 11
    2 + reverse of 2 = 22
    11 + reverse of 11 = 1111
    12 + reverse of 12 = 1221
    22 + reverse of 22 = 2222
    111 + reverse of 111 = 111111
    112 + reverse of 112 = 112211 
    like this generate perfect numbers 
    */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.print(solve(2));

	}
	//TC:O(N);
    //SC:O(N);
    static String solve(int A) {
        Queue<String> q= new LinkedList();
        String finl;
        q.add("1");
        q.add("2");

        for(int i=1;i<A;i++){
            String s=q.remove();
            q.add(s+"1");
            q.add(s+"2");
        }

        finl=q.peek()+String.valueOf(new StringBuilder(q.peek()).reverse());

        return finl;
    }
}
