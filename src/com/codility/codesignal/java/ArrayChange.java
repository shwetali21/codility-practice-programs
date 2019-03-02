package com.codility.codesignal.java;

import java.util.Arrays;

/**You are given an array of integers. 
 * On each move you are allowed to increase exactly one of its element by one. 
 * Find the minimal number of moves required to obtain a strictly increasing sequence from the input.*/
public class ArrayChange {

	public static void main(String[] args) {
		int arr[] = {1, 1, 1};
		//int arr[] = {-1000, 0, -2, 0};
		
		System.out.println("Moves: " + new ArrayChange().arrayChange(arr));

	}

	int arrayChange(int[] inputArray) {
		int count = 0;
		for(int i = 0;i < inputArray.length - 1; i++) {
			if(inputArray[i] >= inputArray[i + 1]){
				count += inputArray[i] + 1 - inputArray[i + 1];
				inputArray[i + 1] = inputArray[i] + 1;
			}
		}
		System.out.println(Arrays.toString(inputArray));
		return count;
	}
}
