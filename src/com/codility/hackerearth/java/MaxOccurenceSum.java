package com.codility.hackerearth.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurenceSum {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int N = sc.nextInt();

		System.out.println("Enter the Uniqueness of Elements of array: ");
		int[] U = new int[N]; //{15, 15, 12, 13, 13, 13, 1, 1, 1, 1};
		for(int i =0 ; i < N; i++) {
			U[i] = sc.nextInt();
		}

		System.out.println("Enter the Elements of array: ");
		int[] A = new int[N]; //{20, 30, 15, 16, 12, 1, 23, 24, 1, 2};
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(U[0], A[0]);

		for(int i = 0; i<N; i++) {
			if(map.containsKey(U[i])) {
				if(map.get(U[i]) < A[i])
					map.put(U[i], A[i]);
			} else
				map.put(U[i], A[i]);
		}
		int sum = 0;
		for(int n: map.values()) {

			sum += n;
		}

		System.out.println(sum);
	}
}
