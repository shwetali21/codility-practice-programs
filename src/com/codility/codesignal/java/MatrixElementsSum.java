package com.codility.codesignal.java;

/** the CodeBots all decided to move to a new building and live together.
 * The building is represented by a rectangular matrix of rooms.
 * Each cell in the matrix contains an integer that represents the price of the room.
 * Some rooms are free (their cost is 0), but that's probably because they are haunted, 
 * so all the bots are afraid of them. That is why any room that is free or 
 * is located anywhere below a free room in the same column is not considered suitable for the bots to live in.
 * Help the bots calculate the total price of all the rooms that are suitable for them.
 * 
 * For matrix = 
 * [[0, 1, 1, 2], 
 *  [0, 5, 0, 0], 
 *  [2, 0, 3, 3]]
the output should be matrixElementsSum(matrix) = 9.

Here's the rooms matrix with unsuitable rooms marked with 'x':
   [[x, 1, 1, 2], 
    [x, 5, x, x], 
    [x, x, x, x]]
 */
public class MatrixElementsSum {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 1, 1, 0}, 
			{0, 5, 0, 1}, 
			{2, 1, 3, 10}};

			int[][] matrix1 = {{1, 1, 1, 0 }, 
							   {0, 5, 0, 1 }, 
							   {2, 1, 3, 10}};

			System.out.println("Row length : " + matrix.length);
			System.out.println("Column length: " + matrix[0].length);
			System.out.println("Total Price: " + new MatrixElementsSum().matrixElementsSum(matrix1) );
	}

	int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(i > 0 && matrix[i-1][j] == 0) {
					sum += 0;
					matrix[i][j] = 0;
				} else
					sum += matrix[i][j];
			}
		}
		return sum;
	}
}
