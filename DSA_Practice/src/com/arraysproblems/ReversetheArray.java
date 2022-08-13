package com.arraysproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*You are given a constant array A.
You are required to return another		
array which is the reversed form of the input array.*/

public class ReversetheArray {
	 // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A) {
       ArrayList<Integer> al= new ArrayList<Integer>(A);
        Collections.reverse(al);
        return al;
    }
}
