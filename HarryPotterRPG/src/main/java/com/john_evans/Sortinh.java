package com.john_evans;

public class Sortinh {

    int H = 0;
    int W = 0;
    int T = 0;
    int P = 0;

    public int questionPick(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
public void sore(){
    int Q1 = questionPick(1, 3);
    System.out.println(Q1);

    if (Q1 == 1) {
        System.out.println("Would you rather?");
        System.out.println("1. Hunt");
        System.out.println("2. Heal");
        int input = Helper.readInt("-> ", 2);
        if (input == 1) {
            H++;
            W++;
        } else if (input == 2) {
            P++;
            T++;
        }
    } else if (Q1 == 2) {
        System.out.println("Would you rather?");
        System.out.println("1. Plot");
        System.out.println("2. Explore");
        int input = Helper.readInt("-> ", 2);
        if (input == 1) {
            H++;
            T++;
        } else if (input == 2) {
            P++;
            W++;
        }
    } else if (Q1 == 3) {
        System.out.println("Do you prefer to…");
        System.out.println("1. Remember");
        System.out.println("2. Experience");
        int input = Helper.readInt("-> ", 2);
        if (input == 1) {
            W++;
            T++;
        } else if (input == 2) {
            P++;
            H++;
        }
    }

    System.out.println(P);

    System.out.println(H);
    System.out.println(W);
    System.out.println(T);
}


}