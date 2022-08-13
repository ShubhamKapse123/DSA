package com.arraysproblems;

import java.util.ArrayList;

public class SpiralOrderMatrixII {
public static void main(String[] args) {
	int A=5,i=0,j=0,val=1;
	 
   int matrix[][]= new int[A][A];
   
   for(int k=1;k<=A-1;k++) {
	   matrix[i][j]=val++;
	   j++;
   }
   
   System.out.println(j+"----"+i);
   
   for(int k=1;k<=A-1;k++) {
	   matrix[i][j]=val++;
	   i++;
   }
   
   System.out.println(j+"----"+i);
   
   
   for(int k=1;k<=A-1;k++) {
	   matrix[i][j]=val++;
	   j--;
   }
   
   System.out.println(j+"----"+i);
   
   for(int k=1;k<=A-1;k++) {
	   matrix[i][j]=val++;
	   i--;
   }

   System.out.println(j+"----"+i);
   
   for(int k=0;k<matrix.length-1;k++) {
	   for(int ki=0;ki<matrix.length-1;ki++) {
System.out.print(matrix[k][ki]); 
	   }
	   System.out.println("");  
   }
  
}
}
