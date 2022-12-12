package com.arraysproblems;
//Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
//
//
//
//Problem Constraints
//1 <= N <=30
//
//0 <= A[i][j] <= 10
//
//
//
//Input Format
//Single argument representing a 2-D array A of size N x N.
//
//
//
//Output Format
//Return an integer denoting the sum of all possible submatrices in the given matrix.
//
//
//
//Example Input
//A = [ [1, 1]
//      [1, 1] ]
//
//
//Example Output
//16
//
//
//Example Explanation
//Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
//Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
//Number of submatrices with 3 elements = 0
//Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
//Total Sum = 4+8+4 = 16
public class SumofallSubmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create 2-d array and call this method.
	}
	
	public int solve(int[][] A) {
        //solve using contribution techenic
        //TC:O(N^2),SC:(1)
        int tl_br=0;
        int finalSum=0;
        int n=A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //
                //TopLeft=[i+1,j+1],BottomRight=[N-i,M-j]
                
                tl_br=((i+1)*(j+1))*((n-i)*(n-j));
                finalSum+=tl_br*A[i][j];
            }
        }
     return finalSum;      
    }

}
