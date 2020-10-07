package com.john_evans.Schools;

import com.john_evans.Helper;

public class Beauxbatons extends School{

    public Beauxbatons(String house) {
        super(house);
    }

    @Override
    public void sorting() {
        String choice="";
        System.out.println("Pick a color");
        System.out.println("1. Purple");
                System.out.println("2. Blue");
                        System.out.println("3. Green");
        int input = Helper.readInt("-> ", 3);
        if(input==1){
            choice= "Papillionlisse";
        }
        else if (input==2){
            choice= "OmbreLune";
        }
        else if (input==3){
            choice= "Bellefeuille";
        }
        System.out.println(choice);
    }
    // Beauxbatons has a unique sorting method. 
// In order to be sorted, you must shoot a silver arrow across the room. 
// After several seconds, the arrow will burst into sparks of your house color: 
// Purple for Papillionlisse, 
// Blue for OmbreLune and 
// green for Bellefeuille. The arrow will choose a house based on your personality, character, 
// and demeanor. Certain traits exemplify certain houses. You may possess 
// all the traits or strongly possess only one of them. The house descriptions are outlines 
// for your character, but not definite facts.
}