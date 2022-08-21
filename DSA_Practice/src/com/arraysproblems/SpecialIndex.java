package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialIndex {
	
	public static void main(String[] args) {
		 List<Integer> Ar= Arrays.asList(2, 1, 6, 4);
		 ArrayList<Integer> A= new ArrayList<Integer>(Ar);
         int n=A.size();
 
         int count=0;
         int po[]=new int[n];
         int pe[]=new int[n];
         
         pe[0]=A.get(0);
         po[0]=0;

    for(int i=1;i<A.size();i++){
      if(i%2==0) {
    	  pe[i]+=pe[i-1]+A.get(i);
    	  po[i]+=po[i-1];
      }else {
    	  po[i]+=po[i-1]+A.get(i);
    	  pe[i]+=pe[i-1];
      }
    }
      
      for(int j=0;j<n;j++) {
    	  
    	  int leftodd=(j-1==-1)?0:po[j-1];
    	  int lefteven=(j-1==-1)?0:pe[j-1];
    	  int rightodd=pe[n-1]-pe[j]; 
    	  int righteven=po[n-1]-po[j];
    	  
    	  int even=lefteven+righteven;
    	  int odd= leftodd+rightodd;
    	  
    	  if(even==odd) {
    		  count++;
    	  }
    	  
      }
      
      System.out.print(count);
    }
    
	

}
