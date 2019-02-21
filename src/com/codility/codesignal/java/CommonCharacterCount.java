package com.codility.codesignal.java;

/**Given two strings, find the number of common characters between them.
 * Example
 * For s1 = "aabcc" and s2 = "adcaa", 
 * the output should be commonCharacterCount(s1, s2) = 3.
 * */
public class CommonCharacterCount {
	public static void main(String[] args) {

		//String s1 = "aabcc"; String s2 = "adcaa";
		String s1 = "abca"; String s2 = "xyzacb";

		/*
		 * String s1 = "zzzz"; String s2 = "zzzzzzz";
		 */

		System.out.println("Common Character Count: " + new CommonCharacterCount().commonCharacterCount(s1, s2));
	}

	int commonCharacterCount(String s1, String s2) {

		int count = 0;

		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j) && !Character.toString(s1.charAt(i)).equals(" ")) {
					s1 = s1.replaceFirst(Character.toString(s1.charAt(i)), " ");
					s2 = s2.replaceFirst(Character.toString(s2.charAt(j)), " ");
					count++;
				} 
				if(s1.isEmpty())
					break;
			}
		}

		return count;
	}
}
