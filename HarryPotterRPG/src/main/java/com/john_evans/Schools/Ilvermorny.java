package com.john_evans.Schools;

import com.john_evans.Sorting;

public class Ilvermorny extends School {
    public Ilvermorny(String house) {
        super(house);
    }

    @Override
    public void sorting() {     

Sorting s=new Sorting();
s.question1();
s.question2();
s.question3();
s.question4();
s.question5();
s.question6();
s.question7();
s.question8();
s.results();

    }
    
public void letter(){ 
//Allow for summer reading 
//Maybe add ascii 
//2 page letter-allow for go to page 2 return to page 1 
//Would america use owls? 
Helper.printHeading("ILLVERMORNY SCHOOL of WITCHCRAFT and WIZARDRY\r\nPage 1");
//System.out.println("Headmaster: John Evans\n\r"); 
System.out.println("Dear Mr/Ms. [name],"); 
System.out.println("We are pleased to inform you that you have been accepted at Ilvermorny School of Witchcraft and Wizardry."); 
System.out.println("Please find enclosed a list of all necessary books and equipment. Wands will be provided on your first day of term.");
System.out.println("Yours sincerely,"); 
System.out.println("Minerva McGonagall\r\nDeputy Headmistress");
Helper.anythingToContinue();
Helper.printHeading("ILLVERMORNY SCHOOL  of WITCHCRAFT and WIZARDRY\r\nPage 2");
System.out.println("
-Basic Magical Theory I\r\n
-Magical History of the World I\r\n
-Charms I\r\n
-Potions I\r\n
-Defense Against the Dark Arts I\r\n
-Transfiguration I\r\n
-Herbology I\r\n
-Native American Magic");
}
 
}