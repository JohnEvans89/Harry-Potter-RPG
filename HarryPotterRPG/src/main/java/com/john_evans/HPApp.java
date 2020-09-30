package com.john_evans;

import com.john_evans.Schools.Beauxbatons;
import com.john_evans.Schools.Ilvermorny;

//import java.util.Scanner;

public class HPApp {

    
	public static void main(String[] args) {
        Beauxbatons b = new Beauxbatons("name");
        b.sorting();
        Ilvermorny i = new Ilvermorny("name");
        i.letter();
Sortinh s = new Sortinh();
s.question1();
s.question7();
s.question8();
         Player p= new Player("name");
        p.moneyChange();

// Scanner scan = new Scanner (System.in); 
// Double newMoney;

// Helper.printHeading("What is your initial currency?"); 
// System.out.println("1. US Dollars");
// System.out.println("2. Dragots");
// int choice = scan.nextInt();
// if(choice==1){
//     System.out.println("How much?");
//     Double input = scan.nextDouble();
// //dollars to dragot
// newMoney=input*1.5;
// System.out.println(newMoney); 
// }
// else{
//         System.out.println("How much?");
//     Double input = scan.nextDouble();
// //dollars to dragot
// newMoney=input/1.5;
// System.out.println(newMoney); 

// }

// //this may not be necessary after the country code//US=$ UK=pound or euro, etc. 

// //        Story.startGame();
//     scan.close();
}

}