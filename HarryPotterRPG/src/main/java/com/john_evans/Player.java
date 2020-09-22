package com.john_evans;

import java.util.Scanner;

public class Player extends Character {

	public int numAtkUpgrades, numDefUpgrades;
	public String[] atkUpgrades = { "Strength", "Power", "Might", "Gpdlike Strength" };
	public String[] defUpgrades = { "Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura" };
    public String school;
    Double newMoney;
    Scanner scan = new Scanner (System.in); 

	public Player(String name) {
		super(name, 100, 0);
		this.numAtkUpgrades = 0;
		this.numDefUpgrades = 0;
        //chooseCountry();
        //Helper.characterInfo();

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
		}
		else if (input == 2) {
			System.out.println("ILLVERMORNY");
		}
		else if (input == 3) {
			System.out.println("BEAUXBATONS");
		}
		else if (input == 4) {
			System.out.println("DURMSTRANG");
		}
		else if (input == 5) {
			System.out.println("CASTELOBROXO");
		}
		else if (input == 6) {
			System.out.println("UAGADOU");
		}
		else if (input == 7) {
			System.out.println("MAHOUTOKORO");
        }
        
	}

	public void chooseTrait() {
		Helper.clearConsole();
		Helper.printHeading("Choose a trait:");
		System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
		System.out.println("(2) " + defUpgrades[numDefUpgrades]);
		// get the players choice:
		int input = Helper.readInt("-> ", 2);
		Helper.clearConsole();
		// deal with both cases
		if (input == 1) {
			Helper.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
			numAtkUpgrades++;
		} else {
			Helper.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
			numDefUpgrades++;
		}
		Helper.anythingToContinue();
	}

public void moneyChange(){ 
    Helper.printHeading("What is your initial currency?"); 
System.out.println("1. US Dollars");
System.out.println("2. Dragots");
int choice = Helper.readInt("-> ", 2);
if(choice==1){
    System.out.println("How much?");
    Double input = scan.nextDouble();
//dollars to dragot
newMoney=input*1.5;
System.out.println(newMoney); 
}
else{
        System.out.println("How much?");
    Double input = scan.nextDouble();
//dollars to dragot
newMoney=input/1.5;
System.out.println(newMoney); 
} 
}
 

// Default money to 0 at the 
// start like HP/maxHP and XP 

// Player.wallet=newMoney; 



}