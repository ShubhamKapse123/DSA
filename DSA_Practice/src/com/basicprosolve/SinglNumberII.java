package com.basicprosolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SinglNumberII {
	
	public static void main(String[] args) {
		
	List<Integer> A=  Arrays.asList(186, 256, 102, 377, 186, 377 );
		 ArrayList<Integer> arr= new ArrayList<Integer>();

	        for(int i=0;i<A.size();i++){
	            boolean check=false;
	            for(int j=1;j<A.size();j++){
	            	int a=A.get(i);
	            	int b=A.get(j);
	                if(a==b){
	                   check=true;
	                   break;
	                }

	            }
	            if(check==false){
	                arr.add(A.get(i));
	            }
	        }
	            
	            System.out.print(arr);
	}

}
