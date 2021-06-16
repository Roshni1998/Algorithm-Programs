package com.algorithmpractice;

import java.util.Scanner;

/*
 * Java program to implement Binary Search for strings
 */

public class BinarySearch {

	// Returns index of x if it is present in array, else return -1
	static int binarySearch(String[] array, String str) {
		for (int i = 0; i <= array.length - 1; i++) {
			int mid = i + (array.length - 1) / 2;
			int result = str.compareTo(array[mid]);

			// Check if string is present at mid
			if (result == 0)
				return mid;

			// If result is greater, then ignore left half
			if (result > 0)
				i = mid + 1;

			// If result is smaller, then ignore right half
			else
				result = mid - 1;
		}
		return -1;
	}

	// Driver method to test above
	public static void main(String[] args) {

		String[] array = { "Apple", "Banana", "Orange", "Coconut", "Peach" };
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String that you want to search :");
		String str = obj.nextLine();
		int result = binarySearch(array, str);
		if (result == -1)
			System.out.println(str + " is not present in the String.");
		else
			System.out.println(str + " found at" + " index " + result);
	}

}
