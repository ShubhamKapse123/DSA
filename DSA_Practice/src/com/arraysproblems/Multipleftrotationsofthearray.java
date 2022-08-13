package com.arraysproblems;

import java.util.ArrayList;

/*Given an array of integers A and multiple values in B, which 
represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result
in the from of a matrix where ith row represents the rotated 
array for the ith value in B.*/
public class Multipleftrotationsofthearray {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> newList = new ArrayList();
        for(int k=0; k < B.size();k++){
            //rotateLeft(A,B.get(k))
            newList.add( rotateLeft(A,B.get(k)));
        }

        return newList;
        
    }

    public ArrayList<Integer> rotateLeft(ArrayList<Integer> A,int n){

       ArrayList<Integer> arrList = new ArrayList<Integer>();
       for(int k=0;k<A.size();k++){
           arrList.add(A.get(k));
       }
       
             n = n%arrList.size();
		for (int i = 0; i < n; i++) {
             
           
            int temp = arrList.get(0);
       
            for (int j = 0; j <  arrList.size()-1; j++) {
                arrList.set(j, arrList.get(j + 1));
            }
            arrList.set(arrList.size()-1, temp);
        }
  
      return arrList;
    } 
}
