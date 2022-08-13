package com.arraysproblems;
/*You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large*/

public class SpecialSubsequencesAG {
public static void main(String[] args) {
String input="ABCGAG";	

String[] inputarr=input.split("");

int ans=0,c=0;
for(int i=0;i<inputarr.length;i++) {
	if(inputarr[i].equals("A")) {
		c++;
	}else if(inputarr[i].equals("G")) {
		ans=(ans+c)%1000000007;
	}
}
System.out.println(ans);
}
}
