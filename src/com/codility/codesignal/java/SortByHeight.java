package com.codility.codesignal.java;

import java.util.Arrays;

public class SortByHeight {
	
	public static void main(String[] args) {
		
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		System.out.println("Sort by height: " + Arrays.toString(new SortByHeight().sortByHeight(a)));
	}
	
	int[] sortByHeight(int[] a) {
		
		for(int i = 0; i< a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] != -1 && a[j] != -1 && a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
