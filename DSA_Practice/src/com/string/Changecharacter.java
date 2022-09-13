package com.string;

import java.util.ArrayList;
import java.util.Collections;

public class Changecharacter {

	public static void main(String[] args) {
		String A="abcabbccd";
		int B=3;
		 int cnt[] = new int[26];
	        for(int i = 0; i < A.length(); i++){
	            ++cnt[A.charAt(i)-'a'];
	      
	        }
	        
	        ArrayList<Integer> C = new ArrayList<Integer>();
	        for(int i = 0; i < 26; i++){
	            if(cnt[i] > 0){
	               
	                C.add(cnt[i]);
	            }
	        }
	        
	        Collections.sort(C);
	        for(int i = 0; i < C.size(); ++i){
	            B -= C.get(i);
	            if(B < 0){
	             System.out.println(C.size() - i);
	            }
	        }

	}

}
