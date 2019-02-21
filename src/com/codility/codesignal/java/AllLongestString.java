package com.codility.codesignal.java;

import java.util.Arrays;

/**Find the longest String in an Array*/
public class AllLongestString {

	public static void main(String[] args) {
		//String[] inputArray = new String[] {"aba", "aa", "ad", "vcd", "aba"};
		String[] inputArray = new String[] {"abc", "eeee", "abcd" };

		System.out.println("Longest Strings: " + Arrays.toString(new AllLongestString().allLongestStrings(inputArray)));
	}

	String[] allLongestStrings(String[] inputArray) {
		String l = ""; //full string with "," separator

		for(String s : inputArray) {
			//length is first index of substring
			//if list has same size strings, add this one
			if( l.indexOf(",") == s.length()) {
				l += s + ",";
			}
			//reset if list has smaller strings
			else if (l.indexOf(",") < s.length()) {
				l = s + ","; 
			}
		}

		return l.split( "," );
	}	


	/*
	 * String[] allLongestStrings(String[] inputArray) {
	 * 
	 * List<String> longStr = new ArrayList<>(); int maxlength = 0;
	 * 
	 * for(int i = 0; i < inputArray.length; i++) { longStr.add(inputArray[i]);
	 * if(inputArray[i].length() >= maxlength) { maxlength = inputArray[i].length();
	 * } } final int len = maxlength; longStr.removeIf(s -> s.length() < len);
	 * 
	 * return longStr.toArray(new String[longStr.size()]); }
	 */
}
