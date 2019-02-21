package com.codility.codesignal.java;

import java.util.Arrays;
import java.util.Collections;

/**Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 * 
 * For Example,
 * picture = ["abc",
           	  "ded"]
 * the output should be
 * addBorder(picture) = ["*****",
                      	 "*abc*",
                      	 "*ded*",
                      	 "*****"]
 */
public class AddBorder {

	public static void main(String[] args) {
		String[] picture = {"abc", "ded"};

		System.out.println("" + Arrays.toString(new AddBorder().addBorder(picture)));
	}

	String[] addBorder(String[] picture) {

		String[] newPicture = new String[picture.length+2];
		int len = 1;
		for(int i=0; i<picture.length; i++) {
			newPicture[len++] = "*" + picture[i] + "*";
		}
		newPicture[0] = String.join("", Collections.nCopies(picture[0].length(), "*"));
		newPicture[len] = String.join("", Collections.nCopies(picture[0].length(), "*"));

		/**From Java 11
		 * newPicture[0] = "*".repeat(picture[0].length() + 2);
		 * newPicture[len] = "*".repeat(picture[0].length() + 2);
		 */
		return newPicture;
	}

}
