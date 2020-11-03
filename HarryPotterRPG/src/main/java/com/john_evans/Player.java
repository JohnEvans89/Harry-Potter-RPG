package com.john_evans;

import java.util.Scanner;

public class Player extends Character {

	public int numAtkUpgrades, numDefUpgrades, wallet;
	Double newMoney;
	int gall, sic, kn;
	Scanner scan = new Scanner(System.in);

	public Player(String name) {
		super(name, 100, 0);
		this.numAtkUpgrades = 0;
		this.numDefUpgrades = 0;
		this.wallet = 0;
		// chooseCountry();
		// Helper.characterInfo();

	}

	@Override
	public int attack() {
		return 0;
	}

	@Override
	public int defend() {
		return 0;
	}

	public void chooseCountry() {
		Helper.clearConsole();
		Helper.printHeading("Choose a your country/continent:");
		System.out.println("(1) United Kingdom");
		System.out.println("(2) United States/Canada");
		System.out.println("(3) Other West European Country");
		System.out.println("(4) East/North European Country");
		System.out.println("(5) South America");
		System.out.println("(6) Africa");
		System.out.println("(7) Asia");
		// get the players choice:
		int input = Helper.readInt("-> ", 6);
		Helper.clearConsole();
		if (input == 1) {
			System.out.println("HOGWARTS");
		} else if (input == 2) {
			System.out.println("ILLVERMORNY");
		} else if (input == 3) {
			System.out.println("BEAUXBATONS");
		} else if (input == 4) {
			System.out.println("DURMSTRANG");
		} else if (input == 5) {
			System.out.println("CASTELOBROXO");
		} else if (input == 6) {
			System.out.println("UAGADOU");
		} else if (input == 7) {
			System.out.println("MAHOUTOKORO");
		}

	}


	public void moneyChange() {
		Helper.printHeading("What is your initial currency?");
		System.out.println("1. US Dollars");
		System.out.println("2. Pounds Sterling");
//int choice = Helper.readInt("-> ", 2);
		System.out.println("What currency do you want to convert into?");
		System.out.println("1. Dragots");
		System.out.println("2. Galleons, Sickles, Knuts");
		int subChoice = Helper.readInt("-> ", 2);
		if (subChoice == 1) {
			System.out.println("How much?");
			Double input = scan.nextDouble();
			newMoney = 1.5 * input;
			System.out.println(newMoney + " Dragots");
		} else {
			System.out.println("How much?");
			Double input = scan.nextDouble();
			newMoney = input / .02;
			System.out.println(newMoney);
			while (newMoney >= 493) {
				gall++;
				newMoney -= 493;
			}
			while (newMoney >= 29) {
				sic++;
				newMoney -= 29;
			}
			System.out.println(gall + " Galleons");
			System.out.println((sic + " Sickles"));
			System.out.println(newMoney + " Knuts");
		}
	}
//dollars to dragot
//newMoney=input*1.5;
// Default money to 0 at the 
// start like HP/maxHP and XP 
// Player.wallet=newMoney; 

}