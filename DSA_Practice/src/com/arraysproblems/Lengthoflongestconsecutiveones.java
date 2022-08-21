package com.arraysproblems;

public class Lengthoflongestconsecutiveones {
public static void main(String[] args) {
	String A="111011101";
	
	int count=0;
	int maxLen=0;
	
	for(int i=0;i<A.length();i++) {
		if(A.charAt(i)=='1') {
			count++;
		}
	}
	
	for(int j=0;j<A.length();j++) {
		if(A.charAt(j)=='0') {
		int len=0;
		int l=0;
		for(int ls=j-1;ls>=0;ls--) {
			if(A.charAt(ls)=='1') {
				l++;
			}else {
				break;
			}
		}
		
		int r=0;
		for(int rs=j+1;rs<A.length();rs++) {
			if(A.charAt(rs)=='1') {
				r++;
			}else {
				break;
			}
		}
		
	   if(l+r<count) {
		   len=l+r+1;
	   }else {
		   len=l+r;
	   }
	   
	   maxLen=Math.max(maxLen,len);
		}
	    
	}
	
	System.out.print(maxLen);
}
}
