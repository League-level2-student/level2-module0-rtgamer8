package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		int[] ai = { 1, 2, 3, 4, 5, };
		// 2 print the third element in the array
		System.out.println(ai[3]);
		// 3. set the third element to a different value
		ai[2] = 4;
		// 4. print the third element again
		System.out.println(ai[3]);

		// 6. make an array of 50 integers
		int[] ia2 = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < ia2.length; i++) {
			ia2[i] = r.nextInt(101);
		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		int small = 99999999;
		for (int i = 0; i < ia2.length; i++) {
			if (ia2[i] < small) {
				small = ia2[i];
			}
		}
		System.out.println(small);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ia2.length; i++) {

			System.out.println(ia2[i]);

		}

		// 10. print the largest number in the array.

		int big = 0;
		for (int i = 0; i < ia2.length; i++) {
			if (ia2[i] > big) {
				big = ia2[i];
			}
		}
		System.out.println(big);
	}
}