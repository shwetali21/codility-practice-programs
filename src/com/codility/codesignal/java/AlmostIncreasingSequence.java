package com.codility.codesignal.java;

/**Given a sequence of integers as an array,
 * determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 * 
 * For sequence = [1, 3, 2, 1], the output should be almostIncreasingSequence(sequence) = false.
 * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
 * 
 * For sequence = [1, 3, 2], the output should be almostIncreasingSequence(sequence) = true.
 * 
 * You can remove 3 from the array to get the strictly increasing sequence [1, 2].
 * Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
 * */
public class AlmostIncreasingSequence {
	public static void main(String[] args) {

		//int arr[] = new int[] {1, 3, 2};	// true condition
		//int arr[] = new int[] {1, 2, 1, 2};	// false condition
		//int arr[] = new int[] {1, 3, 1, 2};	// false condition
		//int arr[] = new int[] {10, 1, 2, 3, 4, 5};	//true
		//int arr[] = new int[] {1, 2, 5, 3, 5}; //true;

		//int arr[] = new int[] {1, 2, 3, 4, 5, 3, 5, 6};	//true	
		//int arr[] = new int[] {1, 2, 3, 4, 99, 5, 6};	//true;

		int arr[] = new int[] {40, 50, 60, 10, 20, 30};	//false

		System.out.println("Can be arranged in Increasing Order? " + new AlmostIncreasingSequence().almostIncreasingSequence(arr));

	}

	boolean almostIncreasingSequence(int[] sequence) {
		int numErr = 0;
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] - sequence[i+1] >= 0) {
				numErr += 1;
				if (i - 1 >= 0 && i + 2 <= sequence.length - 1
						&& sequence[i] - sequence[i+2] >= 0
						&& sequence[i-1] - sequence[i+1] >= 0) {
					return false;
				}
			}
		}

		return numErr <= 1;
	}

	/*
	 * boolean almostIncreasingSequence(int[] sequence) { boolean flag = false; int
	 * count = 0; int count1 = 0;
	 * 
	 * for(int i = 0; i < sequence.length - 1; i++) { if(sequence[i] >=
	 * sequence[i+1]) { count++; } }
	 * 
	 * int[] newArr = sequence; Arrays.sort(newArr);
	 * 
	 * for(int i = 0; i < sequence.length - 1; i++) { if(sequence[i] ==
	 * sequence[i+1]) count1++; }
	 * 
	 * if(count > 1 || count1 > 1) flag = false; if(count <= 1 && count1 <= 1) flag
	 * = true; if(newArr != sequence) flag = true;
	 * 
	 * 
	 * return flag; }
	 */
}


/*int bad= 0;
	for(int i = 1; i<sequence.length;i++) if(seq[i]<=seq[i-1]) {
		bad++;
		if(bad>1) return false
				if(seq[i]<=seq[i-2]&&seq[i+1]<=seq[i-1]) return false
	}
return true*/