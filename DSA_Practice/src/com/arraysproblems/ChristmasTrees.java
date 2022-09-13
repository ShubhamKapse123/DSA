package com.arraysproblems;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTrees {

	public static void main(String[] args) {
		int[] A = {1, 6, 4, 2, 6, 9};
		int [] B= {2, 5, 7, 3, 2, 7};
		// this variblem is value that is the 10^9 max val for int.
		final int inf = (int)(1e9 + 10);

		
        int n = A.length;
        int ans = inf;
        for(int i = 0 ; i < n ; i++){
        	// this loop for left side element find min val
            int left_min = inf , right_min = inf;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    left_min = Math.min(left_min, B[j]);
                }
            }
            
         // this loop for left side element find min val
            for(int j = i + 1 ; j < n ; j++){
                if(A[j] > A[i]){
                    right_min = Math.min(right_min, B[j]);
                }
            }
         // here is the sum of left middle right
            int temp_ans = left_min + B[i] + right_min;
            // this is the min value final answer.
            ans = Math.min(ans , temp_ans);
        }
        if(ans == inf) ans = -1;
        System.out.print(ans);

	}

}
