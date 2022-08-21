package com.arraysproblems;

public class RotateMatrix {
public static void main(String[] args) {
	
	int A[][]= {{1,2},{3,4}};
	
    int r=A.length;
    int c=A[0].length;

	
    for(int i=0;i<c;i++){
        for(int j=i+1;j<r;j++){
          int temp = A[i][j];
      	    A[i][j] = A[j][i];
      	    A[j][i] = temp;
        }
   }
   
  for (int i = 0; i < r; i++){
        for(int j = 0 ; j < c/2; j++ ){
      	    int temp =A[i][j];
      	    A[i][j] = A[i][c-j-1];
      	    A[i][c-j-1] = temp;
	    }
    }
}
}
