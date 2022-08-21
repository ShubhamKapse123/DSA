package com.bitmanupulate;


/*Reverse the bits of an 32 bit unsigned integer A.*/
public class ReverseBits {

	public static void main(String[] args) {
	 int a=2;
	 
	 String binaryA="";
	 
	 while(a>=1) {
		int val=a%2;
		
		binaryA=val+binaryA;
		
		a=a/2;
	 }
	 
	 System.out.println(binaryA);
	 
    while(32-binaryA.length()>=1) {
    	binaryA="0"+binaryA;
    }
    
    StringBuilder sb= new StringBuilder(binaryA);
    sb.reverse();
    
    Long val= Long.parseLong(sb.toString(),2);
    

    
    System.out.print(val);
    
    
   
	}


}
