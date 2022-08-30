package com.arraysproblems;

import java.util.Scanner;

public class StarPatternI {

	public static void main(String[] args) {

		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// upper side
		for (int i = 0; i < n; i++)

		{
			// this star for right side
			for (int j = 0; j < n - i; j++)

			{
				System.out.print("*");
			}
			// this two loop for space first iteration is not going into this two loops
			for (int k = n - i; k < n; k++)

			{
				System.out.print(" ");

			}

			for (int l = n - i; l < n; l++)

			{

				System.out.print(" ");

			}
			// this star for left side
			for (int m = 0; m < n - i; m++)

			{
				System.out.print("*");
			}
			// this for next line up to last iteration

			System.out.println("");

		}

		// lower side

		for (int i = 1; i <= n; i++) {

			for (int j = n - i; j < n; j++)

			{

				System.out.print("*");

			}

			for (int k = 0; k < n - i; k++)

			{

				System.out.print(" ");

			}

			for (int l = 0; l < n - i; l++)

			{

				System.out.print(" ");

			}

			for (int m = n - i; m < n; m++)

			{

				System.out.print("*");

			}

			System.out.println("");

		}
	}

}
