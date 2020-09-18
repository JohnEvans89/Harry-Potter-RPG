package com.john_evans;

public class Player extends Character {

	public int numAtkUpgrades, numDefUpgrades;
//Helper h = new Helper(); 
	public String[] atkUpgrades = { "Strength", "Power", "Might", "Gpdlike Strength" };
	public String[] defUpgrades = { "Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura" };
	public String school;

	public Player(String name) {
		super(name, 100, 0);
		this.numAtkUpgrades = 0;
		this.numDefUpgrades = 0;
        //chooseCountry();
        //Helper.characterInfo();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defend() {
		// TODO Auto-generated method stub
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
		if (input == 2) {
			System.out.println("ILLVERMORNY");
		}
		if (input == 3) {
			System.out.println("BEAUXBATONS");
		}
		if (input == 4) {
			System.out.println("DURMSTRANG");
		}
		if (input == 5) {
			System.out.println("CASTELOBROXO");
		}
		if (input == 6) {
			System.out.println("UAGADOU");
		}
		if (input == 7) {
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

}