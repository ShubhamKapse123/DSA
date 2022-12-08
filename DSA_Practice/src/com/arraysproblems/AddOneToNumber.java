package com.arraysproblems;

import java.util.ArrayList;
//
//Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
//
//The digits are stored such that the most significant digit is at the head of the list.
//
//NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
//
//Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
//A: For the purpose of this question, YES
//Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
//A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
//
//
//Problem Constraints
//1 <= size of the array <= 1000000
//
//
//
//Input Format
//First argument is an array of digits.
//
//
//
//Output Format
//Return the array of digits after adding one.
//
//
//
//Example Input
//Input 1:
//
//[1, 2, 3]
//
//
//Example Output
//Output 1:
//
//[1, 2, 4]
//
//
//Example Explanation
//Explanation 1:
//
//Given vector is [1, 2, 3].
//The returned vector should be [1, 2, 4] as 123 + 1 = 124.
//
//
//
//See Expected Output

public class AddOneToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//TC:O(N)
    //SC:O(N)
public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
int N = A.size();
ArrayList<Integer> res = new ArrayList<Integer>();
//we need to add 1, start with carry = 1/
int carry = 1;

for(int i=N-1;i>=0;i--){
int val = A.get(i)+ carry;
//if sum >= 10, value to be added will be val%10 and carry can not exceed 1
if(val >=10){
carry = 1;
val = val%10;
}
else{
carry = 0;
}
res.add(val);
}

//for case like 9999, there will be a carry left
if(carry>0)
res.add(carry);

ArrayList<Integer> result = new ArrayList<Integer>();
boolean firstNonZero = true;
int len = res.size();
//logic to reverse and remove prefix 0.
for(int j = len - 1 ; j>=0; j--){
int curr = res.get(j);
//skips all 0 till first non zero is found.
if(curr == 0 && firstNonZero){
continue;
}
else if(curr != 0)
{
firstNonZero = false;
}
result.add(curr);
}
return result;
}
}
