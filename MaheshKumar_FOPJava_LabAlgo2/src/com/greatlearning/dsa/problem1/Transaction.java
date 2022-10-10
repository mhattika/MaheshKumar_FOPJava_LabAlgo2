package com.greatlearning.dsa.problem1;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = in.nextInt();

		System.out.println("Enter the values of array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = in.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNum = in.nextInt();

		long sum = 0;
		int flag = 0;
		while (targetNum != 0) {

			System.out.println("Enter the value of target");
			int target = in.nextInt();
			for (int i = 0; i < size; i++) {

				sum = sum + arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					System.out.println();
					flag = 1;
					break;

				}

			}
			if (flag == 0)
				System.out.println("Given target is not achieved");
			targetNum = targetNum - 1;

		}
		in.close();
	}

}
