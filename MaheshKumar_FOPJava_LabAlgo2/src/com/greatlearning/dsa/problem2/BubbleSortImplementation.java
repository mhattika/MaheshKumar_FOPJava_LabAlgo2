package com.greatlearning.dsa.problem2;

public class BubbleSortImplementation {

	void performBubbleSort(int[] arr) {

		int size = arr.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (arr[j - 1] < arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}
}
