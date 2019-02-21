package com.codility.hackerearth.java;

import java.util.Scanner;

public class LargestStringContainingZeros {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int length = 6;//sc.nextInt();
		String str = "011100";
		System.out.println("Largest Substring: " + new LargestStringContainingZeros().findLargestSubstring(str));
	}

	public String findLargestSubstring(String str) {
		int maxlength = 0;
		String longStr = null;

		for (int i = 0; i < str.length() - 1; i++)  { 
			int count0 = 0;
			int count1 = 0;

			for(int j = i; j < str.length(); j++) {
				if(str.charAt(j) == '0') {
					count0++;
				} else {
					count1++;
				}
				String subStr = str.substring(i, j+1);
				if(count0 > count1 && subStr.length() >= maxlength) {
					maxlength = subStr.length();
					longStr = new String(subStr);
				}
			}
		}
		return longStr; 
	}
}
