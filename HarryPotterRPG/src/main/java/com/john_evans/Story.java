package com.john_evans;

import java.util.Scanner;

public class Story {
    static Player player;
    static Scanner scanner=new Scanner(System.in);

    public static void startGame() {
        boolean nameSet=false;
        Helper.isRunning=true;
        String name;
        // print title screen
        Helper.clearConsole();
        Helper.printSeperator(40);
        Helper.printSeperator(30);
        System.out.println("AGE OF THE EVIL EMPEROR");
        System.out.println("TEXT RPG BY FRED FOR CODESTUDENT.NET");
        Helper.printSeperator(30);
        Helper.printSeperator(40);
        Helper.anythingToContinue();

        // getting the player name
        do {
            Helper.clearConsole();
            Helper.printHeading("What's your name?");
            name=scanner.next();
            // asking the player if he wants to correct his choice
            Helper.clearConsole();
            Helper.printHeading("Your name is "+ name + ".\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input=Helper.readInt("-> ", 2);
            if (input==1) nameSet=true;
        }

        while ( !nameSet);

        // create new player object with the name
        player=new Player(name);
        characterInfo();
        Helper.gameLoop();


        // start main game loop (next part)
        //Helper.gameLoop();
    }

    public static void characterInfo() {
        Helper.clearConsole();
        Helper.printHeading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: "+ player.hp + "/"+ player.maxHp);
        Helper.printSeperator(20);
        System.out.println("XP: "+ player.xp);
        Helper.printSeperator(20);

        // // printing the chosen traits
        // if (player.numAtkUpgrades > 0) {
        // 	System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
        // 	printSeperator(20);
        // }
        // if (player.numDefUpgrades > 0) {
        // 	System.out.println("Defensive trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
        // }

        Helper.anythingToContinue();
    }

}