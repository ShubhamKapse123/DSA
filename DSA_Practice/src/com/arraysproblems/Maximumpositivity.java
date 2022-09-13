package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximumpositivity {
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575 );
		 int n=A.size();
	        ArrayList<Integer> arrlist= new ArrayList<Integer>();
	        int indexchaker=0;
	        int startindex=0;
	        for(int i=0;i<n;i++){
	            boolean status=true;
	            ArrayList<Integer> newlist= new ArrayList<>();
	            if(A.get(i)<0){
	                status=false;
	                startindex=i+1;
	            }

	            if(status==false){
	                while(startindex<n){
	                     if(A.get(startindex)<0){
	                       break;
	                     } 
	                    newlist.add(A.get(startindex));
	                   
	                    startindex++;
	                }

	                if(arrlist.size()==0){
	                	indexchaker=startindex;
	                    arrlist.addAll(newlist);
	                }else if(newlist.size()>arrlist.size()){
	                	indexchaker=startindex;
	                   arrlist.clear();
	                    arrlist.addAll(newlist);
	                }else if(newlist.size()==arrlist.size()){
	                    if(startindex<indexchaker) {
	                    	arrlist.addAll(newlist);
	                    }
	                }
	            }else {
	            	if(startindex==0)
	            	arrlist.add(A.get(i));
	            }
	                
	        }
	        
	        System.out.print(arrlist);
	}

}
