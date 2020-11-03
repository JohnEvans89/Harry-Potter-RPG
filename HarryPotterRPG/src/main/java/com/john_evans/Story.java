package com.john_evans;

import java.util.Scanner;

import com.john_evans.Schools.Ilvermorny;

public class Story {
	static Player player;
	static Scanner scanner = new Scanner(System.in);

	public static void startGame() {
		boolean nameSet = false;
		Helper.isRunning = true;
		String name;
		// print title screen
		Helper.clearConsole();
		Helper.printSeperator(40);
		Helper.printSeperator(30);
		System.out.println("AMERICAN WIZARD");
		System.out.println("TEXT RPG BY JOHN");
		Helper.printSeperator(30);
		Helper.printSeperator(40);
		Helper.anythingToContinue();

		// getting the player name
		do {
			Helper.clearConsole();
			Helper.printHeading("What's your name?");
			name = scanner.next();
			// asking the player if he wants to correct his choice
			Helper.clearConsole();
			Helper.printHeading("Your name is " + name + ".\nIs that correct?");
			System.out.println("(1) Yes!");
			System.out.println("(2) No, I want to change my name.");
			int input = Helper.readInt("-> ", 2);
			if (input == 1)
				nameSet = true;
		}

		while (!nameSet);

		// create new player object with the name
		player = new Player(name);
		Ilvermorny i = new Ilvermorny("P");
		i.letter(player.name);

		// characterInfo();
		// start main game loop (next part)
		// Helper.gameLoop();
	}

}