package com.bitmanupulate;

public class NumberofBits {
public static void main(String[] args) {
	int A=11;
	String B= Long.toBinaryString(A);
	int c=0;

	for(int i=0;i<B.length();i++) {
		if(B.charAt(i)=='1') {
			c++;
		}	 	
	}
	
System.out.print(c);
}
}
