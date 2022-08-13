package com.arraysproblems;

/*You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).*/
public class AmazingSubarrays {

	public static void main(String[] args) {
		String A="ABC";
        String arr[]=A.split("");
        long count =0;
        int n=A.length();
        for(int i=0;i<arr.length;i++){
              if(arr[i].equalsIgnoreCase("a")||arr[i].equalsIgnoreCase("e")||arr[i].equalsIgnoreCase("i")
              ||arr[i].equalsIgnoreCase("o")||arr[i].equalsIgnoreCase("u")) {
            	count+=(n-i);
            }
        }
       System.out.print((int)(count%10003));
    }
	
}
