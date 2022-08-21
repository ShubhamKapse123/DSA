package com.MathModulo;

public class Divisibilityby8 {
public static void main(String[] args) {
	String A="16";
	int ans=0;
    int count=1;
    for(int i=A.length()-1;i>=0;i--){
       int a=Integer.parseInt(String.valueOf(A.charAt(i)));
        ans=a/8;
        count++;
       if(count>=3) {
    	   break;
       }
    }
        
                  System.out.print(ans);
                  
                  String v="ab";
                  int val=Integer.parseInt(String.valueOf(v.charAt(0)));
                  
                  System.out.print(val);
        
}
}
