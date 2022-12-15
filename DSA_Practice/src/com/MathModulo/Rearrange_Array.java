package com.MathModulo;

import java.util.ArrayList;

/*Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.

Constraints:

1 <= N <= 5×104

0 <= A[i] <= N - 1

The elements of A are distinct

Input Format

The argument A is an array of integers

Example 1:

Input : [1, 0]
Return : [0, 1]
Example 2:

Input : [0, 2, 1, 3]
Return : [0, 1, 2, 3]
See Expected Output*/

public class Rearrange_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//call methid here
	}
    //TC:O(N),SC:O(1)
    //we are used big bag  theory
    // we distrooy the origina array and then build new by using old array.
    // how so here i am use the /(division) and %(Mod) case that mean / is return the  new value and % return old value
    //
	public void arrange(ArrayList<Integer> a) {
        int n=a.size();

        for(int i=0;i<n;i++){
            //multiple the old value with array size and we need old value then simple /(divide)
            // if we need new value simply take a %(mode) of this value
            a.set(i,a.get(i)*n);
        }

        for(int i=0;i<n;i++){
            //we taking old value 
            int oldvalue=a.get(i)/n;
            // we getting new value
            int newvalue=a.get(oldvalue)/n;
            //we setting the old+n/n+new;
            a.set(i,a.get(i)+newvalue);
        }

        for(int i=0;i<n;i++){
            //set new value and return new build array (in real means  builde univers by using destroy univers part)
          int v=a.get(i)%n;
          a.set(i,v);
        }
	}
}
