package com.arraysproblems;

import java.util.Arrays;
import java.util.List;

public class SubarrayWithLeastAverag {
  
	public static void main(String[] args) {
		
		List<Integer> A= Arrays.asList(13, 9, 1, 11, 13, 20, 8, 20, 16, 6, 20, 7, 11, 2, 3, 8, 15, 11);
		
		int B=14;
	
        int index=0;
        int sum=Integer.MIN_VALUE;

        for(int i=0;i<B;i++){
            sum+=A.get(i);
        }

        
        int avgresult=sum;
        System.out.println(avgresult);
        System.out.println("sum"+sum);
        for(int s=1,e=B;s<=A.size()-B;s++,e++){
           int avg=Integer.MIN_VALUE;

          sum=sum-A.get(s-1)+A.get(e);
          avg=sum;

          System.out.println(avg);
          System.out.println("sum"+sum);
          if(avg<avgresult){
              avgresult=avg;
              index=s;
          }
       
        }
    
        System.out.print(index);
	}
}
