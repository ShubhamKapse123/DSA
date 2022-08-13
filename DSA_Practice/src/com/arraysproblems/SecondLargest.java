package com.arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 24, 44, 6, 77);
		
		
		Collections.sort(A);

		System.out.print(A.get(A.size() - 2));

	}

}
