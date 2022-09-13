package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/*Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.*/
public class LargestContinuousSequenceZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A= Arrays.asList(1,2,-2,4,-4);
		HashSet<Character> hs= new HashSet<>();

		ArrayList<Integer> prifix= new ArrayList<>();
        HashMap<Integer,Integer> hm= new HashMap<>();
        prifix.add(0);
        for(int i=0;i<A.size();i++){
            prifix.add(prifix.get(i)+A.get(i));
        }
        int start=-1,len=0;
        for(int i=0;i<prifix.size();i++){
           if(hm.containsKey(prifix.get(i))){
             int j=hm.getOrDefault(prifix.get(i),0);
             if(i-j>len) {
                 len=i-j;
                 start=j;
             }
           }else{
               hm.put(prifix.get(i),i);
           }
        }
        ArrayList<Integer> ans = new ArrayList<> ();
        for(int i=start;i<start+len;i++) {
            ans.add(A.get(i));
        }
        
        
	}
	
	
}
