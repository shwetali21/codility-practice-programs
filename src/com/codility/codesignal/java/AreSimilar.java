package com.codility.codesignal.java;

import java.util.Arrays;

public class AreSimilar {
	public static void main(String[] args) {
		/*
		 * int a[] = new int[] {1, 2, 3}; int b[] = new int[] {2, 1, 3};
		 */
		int a[] = new int[] {1, 2, 2};
		int b[] = new int[] {2, 1, 1};
		System.out.println("Are similar? " + new AreSimilar().areSimilar(a, b));
	}

	boolean areSimilar(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {sum++;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b) && sum < 3;
	}
}

