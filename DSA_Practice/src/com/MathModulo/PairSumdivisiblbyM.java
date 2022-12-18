package com.MathModulo;

public class PairSumdivisiblbyM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,17,100,11};
		int arr[]= new int[28];
		
		for(int i=0;i<ar.length;i++) {
		int rem=ar[i]%28;
	
		arr[rem]++;
		}
		
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}

	}

}
