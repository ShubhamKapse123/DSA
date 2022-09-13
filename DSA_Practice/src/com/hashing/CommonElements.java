package com.hashing;
/*Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> A= Arrays.asList(1, 2, 2, 1);
		List<Integer> B= Arrays.asList(2, 3, 1, 2);

		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
        	System.out.println("----"+a.getOrDefault(x, 0));
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
	}

}
