package com.basicprosolve;
//Given a number A. Return square root of the number if it is perfect square otherwise return -1.
public class SquareRoot {
    public int solve(int A) {
        for(int i=1;i*i<=A;i++){
            if(A%i==0&&A/i==i){
                return i;
            }
        }
        return -1;
    }
}
