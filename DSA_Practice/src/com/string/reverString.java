package com.string;

public class reverString {
public static void main(String[] args) {
	String a="shubham";
	int s=0;
	int l=a.length()-1;
	char[] charr=a.toCharArray();
	while(s<l) {
		char temp=charr[s];
		charr[s]=charr[l];
		charr[l]=temp;
		
		s++;
		l--;
	}
	
	a=String.valueOf(charr);
	
	System.out.println(a);
}
}
