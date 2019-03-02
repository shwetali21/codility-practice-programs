package com.codility.codesignal.java;

/**Given a string, find out if its characters can be rearranged to form a palindrome.
 * Example
 * For inputString = "aabb", the output should be palindromeRearranging(inputString) = true.
 * 
 * We can rearrange "aabb" to make "abba", which is a palindrome.
 * */
public class PalindromeRearrange {
	public static void main(String[] args) {

		String inputString = "aabddb";
		//System.out.println('c' - 'a');
		System.out.println("PalindromeRearranging? " + new PalindromeRearrange().palindromeRearranging(inputString));
	}

	boolean palindromeRearranging(String inputString) {
		int[] abc = new int[26];
		int t = 0;

		for(int i = 0;i <inputString.length(); i++) {
			abc[inputString.charAt(i) - 'a']++;
		}

		for(int i:abc) 
			if(i % 2 == 1) 
				t++;
		return inputString.length() % 2 == t;
	}
}
