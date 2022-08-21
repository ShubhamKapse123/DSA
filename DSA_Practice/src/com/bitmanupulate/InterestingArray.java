package com.bitmanupulate;

import java.util.Arrays;
import java.util.List;

/*You have an array A with N elements. We have two types of operation available
on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e.,
XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1,
containing a single element equal to 0 after several splits and/or merge?*/

public class InterestingArray {
public static void main(String[] args) {
	List<Integer> A= Arrays.asList(9, 17);
    int n=A.size();
  String val="No";
     if(n==1){
          val="No";
     }else{

    for(int i=1;i<n;i++){
        int rs=A.get(i-1)^A.get(i);
        int  div1=rs/2;
        int div2=rs/2;

        if(rs%2!=0){
          div1+=rs%2;
        }

        int marge=div1^div2;
        if(marge==0){
            val="Yes";
        }
    }

     }
}
}
