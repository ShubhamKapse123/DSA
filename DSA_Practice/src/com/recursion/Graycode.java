package com.recursion;

import java.util.ArrayList;

public class Graycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println(grayCode(2));
	}
	
	static ArrayList<Integer> grayCode(int a) {
		ArrayList<Integer> ans= new ArrayList();
		if(a==1) {
			ans.add(0);
			ans.add(1);
			
			return ans;
		}
		

		ArrayList<Integer> sqs=grayCode(a-1);
		
		for(int i=0;i<sqs.size();i++) {
			ans.add(sqs.get(i));
		}
		
		for(int i=sqs.size()-1;i>=0;i--) {
			ans.add(sqs.get(i)+(int)Math.pow(2, a-1));
		}
		return ans;
		
	}

}
