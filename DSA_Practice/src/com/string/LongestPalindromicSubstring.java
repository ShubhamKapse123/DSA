package com.string;
/*Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
A = "aaaabaaa"


Example Output
"aaabaaa"


Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".*/
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestPalindrome("abba");

	}
	
	  static String longestPalindrome(String A) {
	        String longest=A.substring(0,1);
	        
	        if(A.length()<=1){
	            return longest;
	        }

	        for(int i=0;i<A.length()-1;i++){
	            //odd palindron
	            String s1=expandCenter(A,i,i);
	            if(s1.length()>longest.length()){
	                longest=s1;
	            }
	              //for even palindron
	             String s2=expandCenter(A,i,i+1);
	            if(s2.length()>longest.length()){
	                longest=s2;
	            }
	        }

	     return longest;
	    }


	   //this two point passing this are expanding the center by using this method eg l<-c(string,l,r)->r
	    static String expandCenter(String val,int l,int r){
	        char [] str=val.toCharArray();
	       while(l>=0 && r<val.length() && str[r]==str[l]){
	           r++;
	           l--;
	       }

	        return val.substring(l+1,r);

	    }

}
