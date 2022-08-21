package com.bitmanupulate;

import java.util.Arrays;
import java.util.List;

/*Richard Hendricks, a mastermind in compression algorithms, is an employee of Hooli in Silicon Valley.
One day, he finally decided to quit and work on his new idea of the middle-out compression algorithm.

He needed to work at the bit - level to compress data. He, eventually, encountered this problem.
There is an array A of N integers. He has to perform certain operations on the elements.
In any one operation, two indices i and j (i < j) are chosen, and A[i] is replaced with A[i] & A[j],
and A[j] is replaced with A[i] | A[j], where & represents the Bitwise AND operation and | represents the Bitwise OR operation.
This operation is performed over all the pairs of integers in the array.

Help Richard find the Bitwise XOR of all the elements after performing the operations.

Problem Constraints
1 <= N <= 105
1 <= Ai <= 109
In
A = [1, 3, 5]
out

7

Explain
After performing the operations, the array becomes [1, 1, 7].
The XOR of all the elements of this array is 7.
There can be other possible arrays, but we can prove that the XOR will always be 7.
*/
public class BitCompression {
	
public static void main(String[] args) {
    int xorValue = 0;
    
    List<Integer> A= Arrays.asList(1, 3, 5);
    int k=0,j=k+1;
         while(k<A.size()-1){
              int s1 = A.get(k);
              int s2 = A.get(j);
              //here is set the A[i] and A[j] as per the question
              A.set(k,s1 & s2);
              A.set(j,s1 | s2);
              k++;
              j++;
          }

      // this loop for convert new array to OXR.
           
      for(int i=0;i<A.size();i++){
           xorValue ^= A.get(i);
      }
}

}
