package com.codility.codesignal.java;

/**A 1-interesting polygon is just a square with a side of length 1.
 * An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. 
 *
 * Example 
 * For n = 2, the output should be shapeArea(n) = 5;
 * For n = 3, the output should be shapeArea(n) = 13.
 */
public class ShapeArea {
	public static void main(String[] args) {
		
		int n = 1;
		
		System.out.println("Shape Area: " +  new ShapeArea().shapeArea(n));
	}

	public int shapeArea(int n) {
		
		return n*n + ((n-1)*(n-1)); 
		
	}
}
