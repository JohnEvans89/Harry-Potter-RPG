package com.john_evans.Schools;

import com.john_evans.Helper;

public class Ilvermorny extends School {
    public Ilvermorny(String name) {
        super(name);
    }

    @Override
    public void sorting() {     
        String choice="";
        System.out.println("What is the most important aspect to be a successful witch or wizard?");
        System.out.println("1. An explorative mind");
        System.out.println("2. A strong body");
        System.out.println("3. A beating heart");
        System.out.println("4. An adventurous soul");
        int input = Helper.readInt("-> ", 4);
        if(input==1){
            choice= "Horned Serpent";
        }
        else if (input==2){
            choice= "Wampus";
        }
        else if (input==3){
            choice= "Pukwudgie";
        }
        else if (input==4){
            choice= "Thunderbird";
        }
        System.out.println(choice);
    }
    
public void letter(){ 
//Allow for summer reading 
//Maybe add ascii 
//2 page letter-allow for go to page 2 return to page 1 
//Would america use owls? 
Helper.printHeading("ILLVERMORNY SCHOOL  of WITCHCRAFT and WIZARDRY\r\nPage 1");
//System.out.println("Headmaster: John Evans\n\r"); 
System.out.println("Dear Mr/Ms. [name],"); 
System.out.println("We are pleased to inform you that you have been accepted at Ilvermorny School of Witchcraft and Wizardry."); 
System.out.println("Please find enclosed a list of all necessary books and equipment. Wands will be provided on your first day of term.");
System.out.println("Yours sincerely,"); 
System.out.println("Minerva McGonagall\r\nDeputy Headmistress");
Helper.anythingToContinue();
Helper.printHeading("ILLVERMORNY SCHOOL  of WITCHCRAFT and WIZARDRY\r\nPage 2");
System.out.println("-Basic Magical Theory I\r\n-Magical History of the World I\r\n-Charms I\r\n-Potions I\r\n-Defense Against the Dark Arts I\r\n-Transfiguration I\r\n-Herbology I\r\n-Native American Magic");
}
 
}