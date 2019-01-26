package com.hackerearth.codility.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Read different types of data from standard input, process them as shown in output format and print the answer to standard output.
 * Input format:
 * First line contains integer N. 
 * Second line contains string S.
 * 
 * Output format:
 * First line should contain N x 2. 
 * Second line should contain the same string S.*/
public class PrintNumAndString {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();

		System.out.println(num*2);
		System.out.println(str);

	}
}
