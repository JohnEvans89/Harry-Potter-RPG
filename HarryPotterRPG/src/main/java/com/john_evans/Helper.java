package com.john_evans;

import java.util.Scanner;

public class Helper {
	static Scanner scanner = new Scanner(System.in);
	static Player player;
    public static boolean isRunning;
    public static int place = 0, act;
public static String[] places = {"Everlasting Mountains", "Haunted Landlines", "Castle of the Evil Emperor", "Throne Room"};

	public static void gameLoop() {
		while (isRunning) {
			printMenu();
			int input = readInt("-> ", 3);
			if (input == 1)
				continueJourney();
			else if (input == 2)
				characterInfo();
			else
				isRunning = false;
		}
	}

	public static void continueJourney() {

	}

	public static void printMenu() {
		clearConsole();
		printHeading(places[place]);
		System.out.println("Choose an action:");
		printSeperator(20);
		System.out.println("(1) Continue on your journey");
		System.out.println("(2) Character Info");
		System.out.println("(3) Exit Game");
	}

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
	public static void characterInfo() {
		clearConsole();
		printHeading("CHARACTER INFO");
		System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
		printSeperator(20);
		System.out.println("XP: " + player.xp);
		printSeperator(20);

		// // printing the chosen traits
		// if (player.numAtkUpgrades > 0) {
		// 	System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
		// 	printSeperator(20);
		// }
		// if (player.numDefUpgrades > 0) {
		// 	System.out.println("Defensive trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
		// }

		anythingToContinue();
	}

	// method to simulate clearing out the console
	public static void clearConsole() {
		for (int i = 0; i < 10; i++)
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
		scanner.nextLine();
	}

}