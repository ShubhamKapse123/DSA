package com.hashing;

import java.util.HashSet;

public class SubarraywithZerosum {

	public static void main(String[] args) {
		int[] A= {1, 2, 3, 4, 5,4,-4,7};
		System.out.print(solve(A));
	}
	
    //TC:O(N)
    //SP:O(N)
    static  int solve(int[] A) {
        long prifix=0;
        HashSet<Long> simple= new HashSet();
        simple.add(0L);
        //we make prefix sum and from ele to duplicate ele (1,3,2,5,6,3,4,6,9) here form 3 to duplicate 3 this
        // gab is cover or the index cover between this two ele this is sub array that make sum zero.
        for(int i=0;i<A.length;i++){
            prifix+=A[i];
            if(simple.contains(prifix)){
                return 1;
            }
            simple.add(prifix);
        }

        return 0;

    }

}
