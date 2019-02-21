package com.codility.codesignal.java;

public class ReverseInParenthesis {

	public static void main(String[] args) {
		String inputString = "(bar)";

		System.out.println("Reverse In Paranthesis: " + new ReverseInParenthesis().reverseInParentheses(inputString));
	}

	String reverseInParentheses(String inputString) {

		int lstOpen = inputString.lastIndexOf('(');
		int fstClse = inputString.indexOf(')');
		StringBuffer newString  = new StringBuffer(inputString);
		
		for(int i = lstOpen ; i < fstClse ; i++) {
			newString = new StringBuffer(inputString.substring(0, lstOpen));
			System.out.println("First Part: " + newString);
			
			StringBuffer rev = new StringBuffer(inputString.substring(lstOpen+1, fstClse)).reverse(); 
			newString = newString.append(rev);
			System.out.println("Second Part: " + newString);
			
			rev = newString.append(inputString.substring(fstClse+1, inputString.length()));
			System.out.println(newString);
			
			inputString = inputString.replace(String.valueOf(inputString.charAt(fstClse)), "");
			inputString = inputString.replace(String.valueOf(inputString.charAt(lstOpen)), "");
			
			lstOpen = inputString.lastIndexOf('(');
			fstClse = inputString.indexOf(')');
		}

		return newString.toString();
	}
	
	
	/*
	 * StringBuilder str = new StringBuilder(inputString); int start, end;
	 * while(str.indexOf("(") != -1){ start = str.lastIndexOf("("); end =
	 * str.indexOf(")", start); str.replace(start, end + 1, new
	 * StringBuilder(str.substring(start+1, end)).reverse().toString()); } return
	 * str.toString();
	 */
}
