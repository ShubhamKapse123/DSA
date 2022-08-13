package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSumQuer {
	public static void main(String[] args) {
		
		List<Integer> A= Arrays.asList( 7, 3, 1, 5, 5, 5, 1, 2, 4, 5);
		
		ArrayList<Integer> l1= new ArrayList<>();
		l1.add(7);
		l1.add(10);
		ArrayList<Integer> l2= new ArrayList<>();
		l2.add(1);
		l2.add(10);
		
		ArrayList<ArrayList<Integer>> aa= new ArrayList();
		aa.add(l1);
		aa.add(l2);
		
	
    ArrayList<Long> prefixsum=new ArrayList();
    ArrayList<Long> result=new ArrayList();
    
    prefixsum.add((long)A.get(0));
    for(int i=1;i<A.size();i++){

        prefixsum.add(prefixsum.get(i-1)+A.get(i));
        
    }
    
    System.out.println(prefixsum);
    
   for(int i=0;i<aa.size();i++) {
	   long sum=0;
	   int r=aa.get(i).get(1)-1;
       int l=aa.get(i).get(0)-1;
       
	   if(l==0) {
		   sum=prefixsum.get(r);
	   }else {
	   sum=prefixsum.get(r)-prefixsum.get(l);
	   }
	   	   
	   result.add(sum);

   }
    	
    System.out.print(result);
    
	}
}
