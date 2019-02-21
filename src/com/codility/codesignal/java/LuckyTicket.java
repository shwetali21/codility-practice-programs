package com.codility.codesignal.java;

/**Ticket numbers usually consist of an even number of digits. 
 * A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
 * */
public class LuckyTicket {
	public static void main(String[] args) {

		int n = 1230;
		System.out.println("LuckyTicket? " + new LuckyTicket().isLucky(n));
	}

	boolean isLucky(int n) {

		String num = String.valueOf(n);
		int length = num.length();

		int first = 0;
		int second = 0;

		for(int i=0, j=length/2; i<length/2 && j<length; i++, j++) {
			first += Integer.parseInt(String.valueOf(num.charAt(i)));
			second += Integer.parseInt(String.valueOf(num.charAt(j)));
		}
		return first == second;
	}

	/*
	 * boolean isLucky(int n) { String s = n+""; int sum = 0;
	 * 
	 * for(int i=0; i<s.length()/2; i++)
	 * sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
	 * 
	 * return sum==0; }
	 */
}
