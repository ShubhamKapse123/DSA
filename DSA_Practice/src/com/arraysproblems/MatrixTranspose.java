package com.arraysproblems;

public class MatrixTranspose {
public static void main(String[] args) {
	int arr[][]= {{1, 2,3},{4,5,6},{7,8,9}};
	int r=arr.length;
	int c=arr[0].length;
	int arrrot[][]= new int[c][r];

		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				arrrot[i][j]=arr[j][i];
			}
		}

	
	for(int i=0;i<c;i++) {
		for(int j=0;j<r;j++) {
			System.out.print(arrrot[i][j]);
		}
		System.out.println("");
	}
	
}
}
