package com.sort;

public class SequenceProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2));

	}
	
	static int solve(int A) {
        int ans=0;
        if(A==0)
        {
        return 1;
        }else if(A==1){
        return 1;
        }else if(A==2){
        return 3;
          }
        
        ans = solve(A-1)+solve(A-2)+solve(A-3)+A;
        
        return ans;
    }

}
