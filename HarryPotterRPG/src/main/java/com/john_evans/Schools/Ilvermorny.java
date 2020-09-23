package com.john_evans.Schools;

import com.john_evans.Helper;

public class Ilvermorny extends School {
    public Ilvermorny(String name) {
        super(name);
    }

    @Override
    public void sorting() {
        //Horned Serpent wants the student, the crystal set into its forehead will light up.
        //Wampus wants the student, it roars. 
        //Thunderbird signifies its approval by beating its wings,
        //Pukwudgie will raise its arrow into the air
       

// ‘It is sometimes said of the Ilvermorny houses that 
// they represent the whole witch or wizard: 
// the mind is represented by Horned Serpent; 
// the body, Wampus; 
// the heart, Pukwudgie and the 
// soul, Thunderbird. 
// Others say that Horned Serpent favours scholars, 
// Wampus, warriors, 
// Pukwudgie, healers and 
// Thunderbird, adventurers.’
       
        String choice="";
        System.out.println("What is the most important aspect to be a successful witch or wizard?");
        System.out.println("1. An active mind");
                System.out.println("2. A strong body");
                        System.out.println("3. A beating heart");
                                                System.out.println("4. A restless soul");
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
    
}