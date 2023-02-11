package com.stack;

import java.util.Stack;

/*An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each string may be an integer or an operator.



Problem Constraints
1 <= N <= 105



Input Format
The only argument given is string array A.



Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]


Example Output
Output 1:
    9
Output 2:
    6


Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    13 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6
    
    Solution Approach
This is pretty much a simulation problem.
Think using stack.

When you encounter an operator, that is when you need the top 2 numbers on the stack, 
perform the operation on them, and put them on the stack.
    */



public class EvaluateExpression {

	public static void main(String[] args) {
		System.out.println("hellow");
		// TODO Auto-generated method stub
		String A[]= { "5", "1", "2", "+", "4", "*", "+", "3", "-" };
		System.out.print(evalRPN(A));
		
	}
	
	 static int evalRPN(String[] A) {
	        Stack<String> stk= new Stack<>();
	        
	        for(int i=0;i<A.length;i++){
	            String val=A[i];
	        if(val.equals("+")||val.equals("-")||val.equals("*")||val.equals("/")){
	              int oprt2=Integer.parseInt(stk.peek());
	              stk.pop();
	            int oprt1=Integer.parseInt(stk.peek());
	            stk.pop();
	            int ans=0;
	            switch (val){
	                case "+":
	                    ans = oprt1+oprt2;	                                
	                    stk.push(String.valueOf(ans));
	                break;
	                case "-":
	                     ans = oprt1-oprt2;
	                    stk.push(String.valueOf(ans));
	                break;
	                case "*":
	                     ans = oprt1*oprt2;
	                    stk.push(String.valueOf(ans));
	                break;
	                case "/":
	                     ans = oprt1/oprt2;
	                    stk.push(String.valueOf(ans));
	                break;
	                default:
	                System.out.println("Invalide operator");
	            }
	        }else{
	            stk.push(val);
	        }
	        }

	        return Integer.parseInt(stk.peek());
	        
	    }

}
