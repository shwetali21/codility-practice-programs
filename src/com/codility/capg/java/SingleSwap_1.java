package com.codility.capg.java;


/**Write a function :-
 * class Solution {
 * 	public boolean solution (int[] A);
 * }
 * 
 * Given a non empty zero-indexed array A consisting of N integers,
 * returns true if the array can be sorted into non-decreasing order 
 * by performing at most one swap operation 
 * or false otherwise.*/

public class SingleSwap_1 {
	public static void main(String[] args) {

		int[] arr = new int[] {1, 3, 2, 5, 6};

		System.out.println("Array can be arranged in Ascending Order? : " + checkSingleSwap(arr));
	}

	private static boolean checkSingleSwap(int[] arr) {

		int count = 0;

		for(int i=0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;

				count++;
			}
			if(count > 1) 
				return false;
		}
		return true;
	}
}