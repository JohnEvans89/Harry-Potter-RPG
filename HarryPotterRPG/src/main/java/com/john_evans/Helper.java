package com.john_evans;

import java.util.Scanner;

public class Helper {
	static Scanner scanner = new Scanner(System.in);
	static Scanner enterScan = new Scanner(System.in);
	//static Player player;
	public static boolean isRunning;
	


	public static int readInt(String prompt, int userChoices) {
		int input;

		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			} catch (Exception e) {
				input = -1;
				System.out.println("Please enter an integer!");
			}
		} while (input < 1 || input > userChoices);
		return input;
	}

	// printing out the most important information about the player character
	

	// method to simulate clearing out the console
	public static void clearConsole() {
		for (int i = 0; i < 15; i++)
			System.out.println();
	}

	// method to print a seperator with length n
	public static void printSeperator(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("-");
		System.out.println();
	}

	// method to print a heading
	public static void printHeading(String title) {
		printSeperator(30);
		System.out.println(title);
		printSeperator(30);
	}

	// method to stop the game until user enters anything
	public static void anythingToContinue() {
		System.out.println("\nEnter to continue...");
		enterScan.nextLine();

		// scanner.nextLine();
		clearConsole();
	}

}