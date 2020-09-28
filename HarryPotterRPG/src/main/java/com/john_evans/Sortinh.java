package com.john_evans;

public class Sortinh {

    int H = 0;
    int W = 0;
    int T = 0;
    int P = 0;

    public int questionPick(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    public void question1() {
        int Q1 = questionPick(1, 3);
        System.out.println("Q1");
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
        System.out.println("P:" + P);
        System.out.println("H:" + H);
        System.out.println("W:" + W);
        System.out.println("T:" + T);
    }

    public void question8() {
        int Q8 = questionPick(1, 3);
        System.out.println("Q8");
        if (Q8 == 1) {
            System.out.println("You can rescue a baby or the only bottle of a potion that could save 1000 lives. Which do you save?");
            System.out.println("1. The baby. The bottle only MIGHT save 1000 lives");
            System.out.println("2. The bottle. The chance of saving 1000 lives is too important to miss");
            int input = Helper.readInt("-> ", 2);
            if (input == 1) {
                H++;
                P++;
            } else if (input == 2) {
                W++;
                T++;
            }
        } else if (Q8 == 2) {
            System.out.println("Which is the better motto?");
            System.out.println("1. It is nobler to be deceived than to be mistrustful");
            System.out.println("2. Friends should not demand blind faith");
            int input = Helper.readInt("-> ", 2);
            if (input == 1) {
                P++;
                T++;
            } else if (input == 2) {
                H++;
                W++;
            }
        } else if (Q8 == 3) {
            System.out.println("No curse can work without the victim's secret consent.");
            System.out.println("1. True");
            System.out.println("2. False");
            int input = Helper.readInt("-> ", 2);
            if (input == 1) {
                H++;
                T++;
            } else if (input == 2) {
                P++;
                W++;
            }
        }
        System.out.println("P:" + P);
        System.out.println("H:" + H);
        System.out.println("W:" + W);
        System.out.println("T:" + T);
    }

    public void question7() {
        System.out.println("Q7");
        System.out.println("Think of the question you would most like answered, by a person or an all-knowing being or device. Which of the following most closely resembles the answer you'd like to hear?");
        System.out.println("1. Without a shadow of a doubt");
        System.out.println("2. Never");
        System.out.println("3. Very soon");
        System.out.println("4. It is impossible");
        System.out.println("5. Yes");
        System.out.println("6. I will show you everything");
        System.out.println("7. Only if you agree");
        System.out.println("8. If you come with me");
        System.out.println("9. No, I didn't");
        System.out.println("10. You are");
        System.out.println("11. Yes, you may");
        System.out.println("12. Only once");
        System.out.println("13. If you want to");
        System.out.println("14. Forever");
        System.out.println("15. Not for many years");
        int input = Helper.readInt("-> ", 15);

        if (input == 1) {
            H++;
        } else if (input == 2) {
            P++;
        } else if (input == 3) {
            W++;
            T++;
        } else if (input == 4) {
            H++;
        } else if (input == 5) {
            W++;
            P++;
        } else if (input == 6) {
            H++;
            T++;
        } else if (input == 7) {
            P++;
        } else if (input == 8) {
            W++;
        } else if (input == 9) {
            H++;
        } else if (input == 10) {
            T++;
        } else if (input == 11) {
            W++;
            T++;
        } else if (input == 12) {
            P++;
        } else if (input == 13) {
            H++;
            W++;
        } else if (input == 14) {
            T++;
        } else if (input == 15) {
            P++;
        }
        System.out.println("P:" + P);
        System.out.println("H:" + H);
        System.out.println("W:" + W);
        System.out.println("T:" + T);

    }

}