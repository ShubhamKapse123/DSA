package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowSum {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5,6,7,8);
		List<Integer> arr1 = Arrays.asList(1,2,3,4);
		List<Integer> arr2 = Arrays.asList(9,2,3,4);
		  
				  
		ArrayList<List<Integer>> A = new ArrayList();
		A.add(arr);
		A.add(arr1);
		A.add(arr2);

		ArrayList<Integer> resutl = new ArrayList();

		System.out.println(A.get(0).size());
		System.out.println(A.size());

		for (int i = 0; i < A.size(); i++) {
			int sum = 0;

			for (int j = 0; j < A.get(0).size(); j++) {

				sum += A.get(i).get(j);

			}
			resutl.add(sum);
		}

		System.out.print(resutl);

	}
}
