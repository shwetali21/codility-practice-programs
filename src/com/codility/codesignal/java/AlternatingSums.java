package com.codility.codesignal.java;

import java.util.Arrays;

/**You are given an array of positive integers - the weights of the people.
 * Return an array of two integers, where the first element is the total weight of team 1, 
 * and the second element is the total weight of team 2 after the division is complete.
 * 
 * Example
 * 
 * For a = [50, 60, 60, 45, 70], the output should be alternatingSums(a) = [180, 105].*/
public class AlternatingSums {
	public static void main(String[] args) {

		int arr[] = new int[] {50, 60, 60, 45, 70};

		System.out.println("Team Sum: " + Arrays.toString(new AlternatingSums().alternatingSums(arr)));

	}

	public int[] alternatingSums(int[] a) {

		int team[] = new int[2];
		for(int i=0; i<a.length;i++) {
			if(i%2 == 0)
				team[0] += a[i];
			else
				team[1] += a[i];	
		}
		return team;
	}
}
