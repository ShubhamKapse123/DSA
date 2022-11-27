package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
	               freqMap.put(list.get(i),list.get(i)+1);
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
	               freqMap.put(list.get(i),list.get(i)+1);
	           }else{
	               freqMap.put(list.get(i),1);
	           }

	            arr.add(i-B+1,freqMap.size());
	            i++;
	       }

	       return arr;
	    }

}
