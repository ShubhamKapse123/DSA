package com.arraysproblems;

public class Test {
public static void main(String[] args) {
	
	String A="bgipsvukg";
	int B[][] = {{2,6},{4,7},{6,7}};
	 int n= B.length;
     int n1=B[0].length;
     int[] Result= new int[n];
     
     for(int i=0;i<n;i++){
         int count=0;
         int s=B[i][0],e=B[i][1];
         

         System.out.println(s+"---"+e);
         
         String sub= A.substring(s, e+1);
         
         System.out.println(sub);
         
         for(int j=0;j<sub.length();j++) {
        	 String val=String.valueOf(sub.charAt(j));
            if(val.equals("a")||val.equals("u")||val.equals("e")||val.equals("i")||val.equals("o")) {
            	count++;
            }
         }
         
         Result[i]=count;
       
     }
     
     for(int i=0;i<Result.length;i++) {
    	 System.out.print(Result[i]);
     }
}
}
