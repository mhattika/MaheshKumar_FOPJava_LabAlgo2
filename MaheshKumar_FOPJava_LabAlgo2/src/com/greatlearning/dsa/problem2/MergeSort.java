package com.greatlearning.dsa.problem2;

public class MergeSort {

	void merge(int arr[], int left, int mid, int right) {
		// finding the sizes of two sub Arrays
		int size1 = mid - left + 1;
		int size2 = right - mid;
		// 10 20 30 40 50
		// Create 2 temporary arrays
		int leftArray[] = new int[size1];
		int rightArray[] = new int[size2];
		// copy data to temporary arrays
		for (int i = 0; i < size1; i++)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < size2; ++j)
			rightArray[j] = arr[mid + 1 + j];
		// merge the 2 tempertory arrays
		// initial indexes of 2 Sub Arrays
		int i = 0, j = 0;
		// initial index of merged subarray
		int k = left;
		while (i < size1 && j < size2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		// copying the remaining elements of left array if any
		while (i < size1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		// copying the remaining elements of right array if any
		while (j < size2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	// Main function that sorts array from let to right using merge()
	void sort(int arr[], int left, int right) {
		if (left < right) {
			// finding the mid offset
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			// Merge the sorted values
			merge(arr, left, mid, right);
		}

	}
}
