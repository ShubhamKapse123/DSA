package com.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.*/

public class CheckPalindromeII {

	public static void main(String[] args) {
		String A="ppppvxyzfninfzyxvpppp";
		

	        int count=0;
	        HashMap<Character,Integer> hs= new HashMap<>();
	        
	        int odd=0;
	        int even=0;
	     
	        for(int i=0;i<A.length();i++){
	            if(hs.containsKey(A.charAt(i)))
	           hs.put(A.charAt(i),hs.getOrDefault(A.charAt(i), 0)+1);  
	           else
	           hs.put(A.charAt(i),1);      
	           }

	           for(Map.Entry<Character,Integer> en:hs.entrySet()) {
	        	   
	        	   if(en.getValue()%2==0) {
	        		   even++;
	        	   }else {
	        		   odd++;
	        	   }
	        	   
	           }
	           
	           if(odd==1||odd==0) {
	        	   System.out.println("0");
	           }

	           System.out.println(Math.pow(-6, 1));
               

	}

}
