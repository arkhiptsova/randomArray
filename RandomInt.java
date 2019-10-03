package FeetNumber;

/*
Mila Arkhiptcova
Write a program that generates 100 random integers between 0 and 9 
and displays the count for each number. (Hint: Use an array of 10 integers,
say counts, to store the counts for the number of 0s, 1s, ..., 9s.)
10/01/2019
Bellevue University
RandomInt.java
*/
public class RandomInt {

	public static void main(String[] args) {

		int[] counts = new int[10]; // Array of ten integers

		// Store randomly numbers in array
		for (int i = 1; i <= 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}

		// Display the results
		System.out.println("Count for each number between 0 and 9:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println("The " +i + "s: " + counts[i]);
		}
	}
	}


