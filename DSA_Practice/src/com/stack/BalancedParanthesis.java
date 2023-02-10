package com.stack;

import java.util.Stack;

/*Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints
1 <= |A| <= 100



Input Format
The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format
Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input
Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[] 


Example Output
Output 1:

 1 
Output 2:

 0 
Output 3:

 1 


Example Explanation
You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.*/

//approach
//
//First, let us look at the impossible cases:
//1) [() : There is no corresponding closing bracket for an opening bracket.
//2) [) : Incorrect closing bracket for an opening bracket.
//3) } : No opening bracket for a closed bracket.
//
//Now, we can observe that the earlier a bracket is encountered in the string, the later it is closed.
//We can guess that the Stack Data Structure will be used using this observation.
//
//We traverse the given string from the left. If the i-th character is an opening bracket, we push it onto the stack.
//If it is a closing bracket, we check for the impossible case 2 and case 3. If they are being violated, then we can simply return 0. Otherwise, we can pop the topmost bracket from the stack.
//To check for case 1, if our stack is not empty at the end of our traversal, then we can say that the brackets are not correctly matched.
//
//If all the conditions are fulfilled, then we can return 1.


public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int solve(String A) {
	        Stack<Character> stk= new Stack<>();

	        for(int i=0;i<A.length();i++){
	            char val=A.charAt(i);
	            //push into the Stack only opening brace
	            if(val=='{'||val=='['||val=='('){
	                stk.push(val);
	            }else{//this condition handle the more closing brace than opening
	                if(stk.size()==0){ return 0;}
	                //here we check pair of opening and closing from peek the closing brace value from stack the top most
	                // it present then remove it otherwise return 0 because here closing and opening is mismatch 
	                else if ((val=='}' && stk.peek()=='{')|| (val==']' && stk.peek()=='[')
	                || (val==')' && stk.peek()=='(')){

	                    stk.pop();

	                }else{
	                    return 0;
	                }
	            }


	        }

	        //we need  opening and closing brace are balance then always stack is Empty

	        if(stk.isEmpty()){
	            return 1;
	        }
	            return 0;
	        
	    }
	

}
