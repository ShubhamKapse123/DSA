package com.arraysproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MINIMUM_PICKS {
	public static void main(String[] args) {
		
	
		List<Integer> A = Arrays.asList(-98, 54, -52, 15, 23, -97, 12, -64, 52, 85);
		
	     Optional<Integer> maxeven=A.stream().filter(m->m%2==0).max((a,b)->a.compareTo(b));
	        Optional<Integer> minodd=A.stream().filter(m->(m%2==1||m%2==-1)).min((a,b)->a.compareTo(b));
	        int result=(maxeven.get()-minodd.get());
		
        System.out.print(maxeven.get()+"=="+minodd.get());

     
	}

}
