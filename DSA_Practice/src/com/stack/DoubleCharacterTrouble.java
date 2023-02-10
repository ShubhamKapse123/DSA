package com.stack;

import java.util.Stack;

/*You are given a string A.

An operation on the string is defined as follows:

Remove the first occurrence of the same consecutive characters. eg for a string "abbcd", the first occurrence of same consecutive characters is "bb".

Therefore the string after this operation will be "acd".

Keep performing this operation on the string until there are no more occurrences of the same consecutive characters and return the final string.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is string A.



Output Format
Return the final string.



Example Input
Input 1:

 A = abccbc
Input 2:

 A = ab


Example Output
Output 1:

 "ac"
Output 2:

 "ab"


Example Explanation
Explanation 1:

Remove the first occurrence of same consecutive characters. eg for a string "abbc", 
the first occurrence of same consecutive characters is "bb".
Therefore the string after this operation will be "ac".
Explanation 2:

 No removals are to be done.
 
 approach 
 
 Consider an example string abba.
 When we remove the “bb”, the remaining string is “aa” which has to be removed as well.
 So we need to keep track of the characters before the first occurrence of similar consecutive characters.
 We can do this using a stack.
 We keep pushing the characters in a stack, if the current character is equal to the top of the stack,
 we pop from the stack since they represent
 a pair of similar characters.
 Finally, we print the stack in reverse.
*/


public class DoubleCharacterTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//TC:O(N);
    //TC:O(N);
    public String solve(String A) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> stk= new Stack<>();
       //here we are add the char in stack if the top most element 
       // match with current char the remove this char from stack 
       // because this is the consecutive character  if not then simply add into stack
        for(int i=0;i<A.length();i++){
          char c=A.charAt(i);
          if(!stk.isEmpty()&&c==stk.peek()){
              stk.pop();
          }else{
              stk.push(c);
          }
        }
//suppose we have remaning charecter for  we need to reverse because 
// the last most char in string present in stack top most element 
// after reverse we need to return this answer.
       while(!stk.isEmpty()){
            sb.append(String.valueOf(stk.peek()));
            stk.pop();
        }
            return sb.reverse().toString();
    }

}
