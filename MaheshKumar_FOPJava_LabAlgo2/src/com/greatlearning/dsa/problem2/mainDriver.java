package com.greatlearning.dsa.problem2;

import java.util.Scanner;

public class mainDriver {

	public static void main(String[] args) {
		// MergeSort mergeSort = new MergeSort();
		BubbleSortImplementation sort = new BubbleSortImplementation();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the size of currency denominatios");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();

		int[] notes = new int[size];// Array to capture denominations from user

		System.out.println("Enter the currency denominations values");
		for (int i = 0; i < size; i++) {

			notes[i] = in.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = in.nextInt();

		sort.performBubbleSort(notes); // sort the denominations in descending order
		// mergeSort.sort(notes, 0, notes.length-1); // sort the denominations
		notesCount.notesCount(notes, amount);

		in.close();
	}

}
