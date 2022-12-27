package com.MathModulo.combinationpermutation;

import java.awt.image.ColorConvertOp;

/*Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 


Problem Constraints
1 <= A <= 109



Input Format
First and only argument of input contains single integer A



Output Format
Return a string denoting the corresponding title.



Example Input
Input 1:

A = 3
Input 2:

 
A = 27


Example Output
Output 1:

"C"
Output 2:

"AA"


Example Explanation
Explanation 1:

 
3 corrseponds to C.
Explanation 2:

    1 -> A,
    2 -> B,
    3 -> C,
    ...
    26 -> Z,
    27 -> AA,
    28 -> AB */

public class ExcelColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(30));

	}

	  //TC:O(log26A^26-1)
    //SC:O(log26A^26-1)
    public static String convertToTitle(int A) {
        String result="";
        
        while(A>0){
            //we take A-1 because 65 is convert in char is A. 
            //if we not put -1 from A then 65+1 will take and out put will wrong
            // for this we take -1 and % use for taking the first char.
            // and division for next char. if greater than 26;
            // otherwise it will 0 and loop terminates 
            int val=(A-1)%26;
            result=(char)(65+val)+result;
            A=(A-1)/26;
        }

        return result;
    }
}
