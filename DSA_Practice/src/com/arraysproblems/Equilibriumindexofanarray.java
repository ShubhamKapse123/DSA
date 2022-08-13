package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Equilibriumindexofanarray {
public static void main(String[] args) {
	List<Integer> A= Arrays.asList(-7, 1, 5, 2, -4, 3, 0);
    ArrayList<Long> prefix= new ArrayList();
    int result=0;
    prefix.add((long)A.get(0));
    for(int i=1;i<A.size();i++)
    {
        prefix.add((long)prefix.get(i-1)+A.get(i));
    }

    for(int k=0;k<A.size()-1;k++)
    {
        long l=0,r=0;
        if(k==0){
            l=prefix.get(0);
        }else{
            l=prefix.get(k-1);
        }

        r=prefix.get(A.size()-1)-prefix.get(k);
        
        System.out.println(l+"="+r);

        if(l==r){
        	System.out.println("int if");
            result=k;
        }else{
            result=-1;
        }
           

    }
System.out.print(result);
	
	
}
}
