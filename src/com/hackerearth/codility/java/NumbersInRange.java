package com.hackerearth.codility.java;

import java.util.Scanner;

public class NumbersInRange {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		// Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();

		// Write here the logic to print all integers between L and R
		for(int i = L; i<=R; i++) {
			System.out.println(i);
		}
	}
}
