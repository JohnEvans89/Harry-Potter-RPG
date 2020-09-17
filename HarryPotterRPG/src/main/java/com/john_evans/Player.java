package com.john_evans;

public class Player extends Character {

    public int numAtkUpgrades, numDefUpgrades;

    public String[] atkUpgrades ={"Strength","Power","Might","Gpdlike Strength"};
public String[] defUpgrades = {"Heavy Bones","Stoneskin", "Scale Armor", "Holy Aura"};

public Player(String name) {
        super(name, 100, 0);
        this.numAtkUpgrades=0;
        this.numDefUpgrades=0;
        chooseTrait();
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

public void chooseTrait(){
		Helper.clearConsole();
		Helper.printHeading("Choose a trait:");
		System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
		System.out.println("(2) " + defUpgrades[numDefUpgrades]);
		//get the players choice:
		int input = Helper.readInt("-> ", 2);
		Helper.clearConsole();
		//deal with both cases
		if(input == 1){
			Helper.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
			numAtkUpgrades++;
		}else{
			Helper.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
			numDefUpgrades++;
		}
		Helper.anythingToContinue();
	}

    
}