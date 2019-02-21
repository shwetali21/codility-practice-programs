package com.codility.hackerearth.java;

import java.util.Scanner;

public class RemoveAllOccurences {

	public static void main(String[] args) {

		// Get the array 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		for(int i = 0;i < size; i++) {
			array[i] = sc.nextInt();
		}

		// Get the key 
		int key = 3; 

		// Print the modified array 
		System.out.println(removeElements(array, key)); 
	}

	public static int removeElements(int[] arr, int key) {

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(key != arr[i])
				sum +=arr[i];
		}
		return sum;
	} 

}
