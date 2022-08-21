package com.bitmanupulate;

public class AddBinaryStrings {
public static void main(String[] args) {
	String A="1";
	String B="1";
	
    if(A.length()!=B.length()) {
    	String itr="";
    	int min =Math.min(A.length(),B.length());
    	int max =Math.max(A.length(),B.length());
    	
    	for(int i=1;i<=max-min;i++) {
    		itr+="0";
    	}
    	
    	if(A.length()>B.length()) {
    		B=itr.concat(B);
    	}else {
    		A=itr.concat(A);
    	}
    	    	
    }
    
    System.out.println(A);
    System.out.println(B);
    
    String result="";
    int carry=0;
   for(int j=A.length()-1;j>=0;j--) {
	  
	   int sum=0,sumMod=0;
	   int ai=Integer.parseInt(String.valueOf(A.charAt(j)));
	   int bi=Integer.parseInt(String.valueOf(B.charAt(j)));
	   
	   sum=ai+bi+carry;
	   sumMod=sum%2;
	   result=String.valueOf(sumMod)+result;
	   carry=sum/2;

   }
   if(carry==1) {
	   result="1"+result;
   }

   System.out.print(result);
    
	
}


}
