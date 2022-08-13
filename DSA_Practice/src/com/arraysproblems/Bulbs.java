package com.arraysproblems;

import java.util.Arrays;
import java.util.List;

/*A wire connects N light bulbs.

Each bulb has a switch associated with it; however, 
due to faulty wiring, a switch also changes the state of
all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number
of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.*/

public class Bulbs {
public static void main(String[] args) {
	int a[]= {0,1,0,1};
	int c=0;
    for(int i=0;i<a.length;i++) {
    	if(a[i]==0&&c%2==0) {  		
    		c++;
    	}else if(a[i]==1&&c%2==1){
    		c++;
    	}
    }
    
    System.out.println(c);
}
}
