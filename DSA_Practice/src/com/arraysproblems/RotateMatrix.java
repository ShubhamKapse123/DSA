package com.arraysproblems;

public class RotateMatrix {
public static void main(String[] args) {
	
	int A[][]= {{1,2},{3,4}};
	
    int r=A.length;
    int c=A[0].length;

	
    for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            A[i][j]=A[j][i];
        }
    }
    
    for(int j=0;j<c;j++){
        for(int i=0;i<r;i++){
         System.out.print(A[j][i]);
        }
    }
}
}
