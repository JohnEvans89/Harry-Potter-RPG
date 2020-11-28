package com.john_evans.Schools;

import com.john_evans.Helper;
//import com.john_evans.Player;
import com.john_evans.Sorting;

public class Ilvermorny extends School {
	//Player player;

	public Ilvermorny(String house) {
		super(house);
	}

	@Override
	public void sorting() {
		Sorting s = new Sorting();
		s.question1();
		Helper.clearConsole();
		s.question2();
		Helper.clearConsole();
		s.question3();
		Helper.clearConsole();
		s.question4();
		Helper.clearConsole();
		s.question5();
		Helper.clearConsole();
		s.question6();
		Helper.clearConsole();
		s.question7();
		Helper.clearConsole();
		s.question8();
		Helper.clearConsole();
		s.results();
		Helper.clearConsole();
	}

	public void letter(String name) {
		Helper.printHeading("ILLVERMORNY SCHOOL of WITCHCRAFT and WIZARDRY\r\nPage 1");
		System.out.println("Headmaster: John Evans\n\r");
		System.out.println("Dear " + name);
		System.out.println(
				"We are pleased to inform you that you have been accepted at Ilvermorny School of Witchcraft and Wizardry.");
		System.out.println(
				"Please find enclosed a list of all necessary books and equipment. Wands will be provided on your first day of term.");
		Helper.anythingToContinue();
		Helper.printHeading("ILLVERMORNY SCHOOL  of WITCHCRAFT and WIZARDRY\r\nPage 2");
		System.out.println(
				"-Basic Magical Theory I\r\n-Magical History of the World I\r\n-Charms I\r\n-Potions I\r\n-Defense Against the Dark Arts I\r\n-Transfiguration I\r\n-Herbology I\r\n-Native American Magic");
		Helper.anythingToContinue();
	}

}