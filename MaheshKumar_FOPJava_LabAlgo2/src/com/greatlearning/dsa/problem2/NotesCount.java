package com.greatlearning.dsa.problem2;

public class NotesCount {

	public void notesCount(int notes[], int amount) {

		int[] noteCounter = new int[notes.length];

		try {

			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {

					noteCounter[i] = amount / notes[i];
					amount = amount - (noteCounter[i] * notes[i]);
				}

				if (noteCounter[i] != 0)
					System.out.println(notes[i] + ":" + noteCounter[i]);

			}

		} catch (ArithmeticException e) {
			System.out.println(e + "  notes of denomination 0 is invalid");
		}

	}

}
