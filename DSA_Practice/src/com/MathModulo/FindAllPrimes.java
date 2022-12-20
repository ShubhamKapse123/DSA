package com.MathModulo;

import java.util.ArrayList;

/*Given an integer A. Find the list of all prime numbers in the range [1, A].


Problem Constraints
1 <= A <= 106



Input Format
Only argument A is an integer.



Output Format
Return a sorted array of prime number in the range [1, A].



Example Input
Input 1:
A = 7
Input 2:
A = 12


Example Output
Output 1:
[2, 3, 5, 7]
Output 2:
[2, 3, 5, 7, 11]


Example Explanation
For Input 1:
The prime numbers from 1 to 7 are 2, 3, 5 and 7.
For Input 2:
The prime numbers from 1 to 12 are 2, 3, 5, 7 and 11.*/

public class FindAllPrimes {

	public static void main(String[] args) {
		System.out.print(solve(7));
	}
	
    public static ArrayList<Integer> solve(int A) {
        ArrayList<Integer> al= new ArrayList();
        for(int k=1;k<=A;k++){
            if(isPrime(k)){
                al.add(k);
            }
        }

        return al;
    }


    public static boolean isPrime(int num){
            int count=0;
            //this because the prime frequency calculate recursively  after some frequency iteration 
            // that why we take i=n/i --> i*i=n--> i^2=n --> i=Math.sqrt(n)
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(i==num/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }

        if(count==2){
            return true;
        }else{
            return false;
        }

    }

}
