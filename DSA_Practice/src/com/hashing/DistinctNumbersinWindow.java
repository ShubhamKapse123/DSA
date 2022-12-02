package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



Input Format
First argument is an integer array A
Second argument is an integer B.



Output Format
Return an integer array.



Example Input
Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output
Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation
Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].*/

public class DistinctNumbersinWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList( 45, 45, 3, 3, 3, 45, 45, 45, 45, 3, 3, 3, 3, 3, 3, 45, 45, 45, 45, 3, 3, 45, 3, 45, 3);
		
		System.err.println(dNums(list,5));
	}
	
	  public static ArrayList<Integer> dNums(List<Integer> list, int B) {
	        int n=list.size();
	        ArrayList<Integer> arr=new ArrayList<>();
	        HashMap<Integer,Integer> freqMap= new HashMap();

	        if(B>n){
	            return arr;
	        }

	        int i=0;
	       
	       //this for first window from 0 to B
	       while(i<B){
	           if(freqMap.containsKey(list.get(i))){
	               freqMap.put(list.get(i),(freqMap.get(list.get(i)))+1);
	           }else{
	               freqMap.put(list.get(i),1);
	           }
	           i++;
	       }

	       arr.add(i-B,freqMap.size());


	       while(i<n){
	    	   
	    	   System.err.println(i);
	           //this for remove the first element from window
	           int freq=freqMap.get(list.get(i-B))-1;
	           if(freq==0){
	               freqMap.remove(list.get(i-B));
	           }else{
	               freqMap.put(list.get(i-B),freq);
	           }

	        //add element on last in window
	           if(freqMap.containsKey(list.get(i))){
	               freqMap.put(list.get(i), (freqMap.get(list.get(i)))+1);
	           }else{
	               freqMap.put(list.get(i),1);
	           }

	            arr.add(i-B+1,freqMap.size());
	         
	       }

	       return arr;
	    }

}
