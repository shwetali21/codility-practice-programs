package com.codility.capg.java;

/**Program to find the least difference between two adjacent elements in an array.*/

public class AdjacentElementDifference {
	public static void main(String[] args) {

		int[] arr = new int[] {5, 3, 2, 4, 7};

		System.out.println("Least Difference Between two adjacent Elements: " + new AdjacentElementDifference().findLeastAdjacentDiff(arr));
	}

	public int findLeastAdjacentDiff(int[] arr) {

		if(arr.length == 1) {
			return 0;
		}

		int leastDiff = Math.abs(arr[0] - arr[1]);

		for(int i = 0; i < arr.length - 1; i++) {
			if(Math.abs(arr[i] - arr[i+1]) < leastDiff) {
				leastDiff = Math.abs(arr[i] - arr[i+1]);
			}
		}
		return leastDiff;
	}
}
