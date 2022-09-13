package com.recursion;

public class pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3,3));
	}
	
	static int pow(int A, int B, int C) {
        if(A==0&&B==0) // In case  the value A=0 and B=0 0^0 should be 0.
        {
           return 0;
        }
       if(B == 0) {   //this is base condition  return 1 when B = 0. this condition help protect from  stack overflow 
           return 1;
       }
       long x = pow(A, B/2, C);    // Recursion call for divide task into sub task. conversion need into long because value will be big.
       //SC: O(N log N)
      
       // Using modulo to keep the multiplication of two max integers in the worst case also comes in the range [0, B-1]
       if(B % 2 == 0) {    //If B is even, powers can be broken in equal parts
           return (int)(((x % C * x % C)) % C);   
       } else {
    	   //+C  if the A will negative there  add C for pass one test case that result not be negative 
           return (int)(((x %C * x % C * A % C) +C) % C);
       }
	}

}
