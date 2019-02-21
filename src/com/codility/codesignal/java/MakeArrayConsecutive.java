package com.codility.codesignal.java;

import java.util.Arrays;

/**Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, 
 * each statue having an non-negative integer size. Since he likes to make things perfect,
 * he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. 
 * He may need some additional statues to be able to accomplish that.
 * Help him figure out the minimum number of additional statues needed.
 * 
 * Example
 * For statues = [6, 2, 3, 8], the output should be
 * makeArrayConsecutive2(statues) = 3.
 * Ratiorg needs statues of sizes 4, 5 and 7.
 */
public class MakeArrayConsecutive {
	public static void main(String[] args) {

		int[] arr = new int[] {6, 2, 3, 8};
		System.out.println("" +new MakeArrayConsecutive().makeArrayConsecutive2(arr));
	}

	int makeArrayConsecutive2(int[] statues) {

		Arrays.sort(statues);

		int count = 0;
		for(int L = 0; L < statues.length - 1;  L++) {
			if(Math.abs(statues[L] - statues[L+1]) != 1);
			count += Math.abs(statues[L] - statues[L+1] + 1);
		}
		return count;
	}

}
