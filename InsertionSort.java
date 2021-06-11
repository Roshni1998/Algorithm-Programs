package com.algorithmpractice;
/*
 * This Program is based on insertion sorting
 */

public class InsertionSort {

	// Sorting of an Array
	void sort(int array[]) {
		int size = array.length;
		for (int i = 1; i < size; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	// Prints the array
	static void printArray(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
	}

	// Driver method
	public static void main(String args[]) {
		int arr[] = { 38, 42, 98, 19, 57, 63, 75 };
		InsertionSort insertion = new InsertionSort();
		insertion.sort(arr);
		System.out.println("Sorting of an array using Insertion Sorting -");
		printArray(arr);
	}
	
}
