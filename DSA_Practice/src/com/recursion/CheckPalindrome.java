package com.recursion;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               String A="strings";

		        if(checkPalindrome(A,0,A.length()-1)){
		            System.out.println(1);
		        }
		        System.out.println(0);
	}
		   
		    
		 static boolean checkPalindrome(String val,int s,int e){
		      if(s>=e){
		            return true;
		        }
		      
		      String  a=String.valueOf(val.charAt(s));
		      String b=String.valueOf(val.charAt(e));

		     if(a.equals(b)){
		
		          return checkPalindrome(val,s+1,e-1);
		     }
		       
		     return false;
		 }
	
}
