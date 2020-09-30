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

    public void question2() {
        int Q2 = questionPick(1, 6);
        System.out.println("Q2");
        if (Q2 == 1) {
            System.out.println("I most value…");
            System.out.println("1. Freedom");
            System.out.println("2. Individuality");
            System.out.println("3. Service");
            System.out.println("4. Ambition");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                T++;
            } else if (input == 2) {
                P++;
            } else if (input == 3) {
                H++;
            } else if (input == 4) {
                W++;
            }
        } else if (Q2 == 2) {
            System.out.println("I would most like to discover…");
            System.out.println("1. A powerful magical creature loyal only to me");
            System.out.println("2. An all magical city hidden from the No-Maj world");
            System.out.println("3. A spell more powerful than any other");
            System.out.println("4. A magical plant that will cure any illness");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                H++;
            } else if (input == 2) {
                P++;
            } else if (input == 3) {
                W++;
            } else if (input == 4) {
                T++;
            }
        } else if (Q2 == 3) {
            System.out.println("I challenge…");
            System.out.println("1. Authority");
            System.out.println("2. Other people's patience");
            System.out.println("3. Convention");
            System.out.println("4. Myself");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                W++;
            } else if (input == 2) {
                P++;
            } else if (input == 3) {
                H++;
            } else if (input == 4) {
                T++;
            }
        } else if (Q2 == 4) {
            System.out.println("My greatest weakness is…");
            System.out.println("1. Nobody's business but mine");
            System.out.println("2. What makes me, me");
            System.out.println("3. The source of my greatest strength");
            System.out.println("4. Something I must change");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                W++;
            } else if (input == 2) {
                P++;
            } else if (input == 3) {
                H++;
            } else if (input == 4) {
                T++;
            }
        }else if (Q2 == 5) {
            System.out.println("If I could I would never feel…");
            System.out.println("1. Pain");
            System.out.println("2. Fear");
            System.out.println("3. Regret");
            System.out.println("4. Shame");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                H++;
            } else if (input == 2) {
                W++;
            } else if (input == 3) {
                T++;
            } else if (input == 4) {
                P++;
            }
        }
        else if (Q2 == 6) {
            System.out.println("A soulmate is...");
            System.out.println("1. Out there somewhere");
            System.out.println("2. An illusion");
            System.out.println("3. A psychic twin");
            System.out.println("4. Strong where I'm weak, weak where I'm strong");
            int input = Helper.readInt("-> ", 4);
            if (input == 1) {
                P++;
            } else if (input == 2) {
                W++;
            } else if (input == 3) {
                H++;
            } else if (input == 4) {
                T++;
            }
        }
    }


public void question5() {
        int Q5 = questionPick(1, 3);
        System.out.println("Q5");
        if (Q5 == 1) {
            System.out.println("What jinx would you least like to experience?");
            System.out.println("1. A jinx that meant nothing was funny");
            System.out.println("2. A jinx that made all food taste like straw");
            System.out.println("3. A jinx that kept you constantly awake");
            System.out.println("4. A jinx that played music constantly in your head");
            System.out.println("5. A jinx that struck you dumb");
            System.out.println("6. A jinx that forced you to tell the truth");
            int input = Helper.readInt("-> ", 6);
            if (input == 1) {
                T=T+2;
            } else if (input == 2) {
                P++;
                W++;
            } else if (input == 3) {
                H=H+2;
            } else if (input == 4) {
                T++;
                H++;
            } else if (input ==5){
                P=P+2;
            }else if (input ==6){
                W=W+2;
            }
        }



    public void question6() {
        int Q6 = questionPick(1, 3);
        System.out.println("Q6");
        if (Q6 == 1) {
            System.out.println("What jinx would you least like to experience?");
            System.out.println("1. A jinx that meant nothing was funny");
            System.out.println("2. A jinx that made all food taste like straw");
            System.out.println("3. A jinx that kept you constantly awake");
            System.out.println("4. A jinx that played music constantly in your head");
            System.out.println("5. A jinx that struck you dumb");
            System.out.println("6. A jinx that forced you to tell the truth");
            int input = Helper.readInt("-> ", 6);
            if (input == 1) {
                T=T+2;
            } else if (input == 2) {
                P++;
                W++;
            } else if (input == 3) {
                H=H+2;
            } else if (input == 4) {
                T++;
                H++;
            } else if (input ==5){
                P=P+2;
            }else if (input ==6){
                W=W+2;
            }
        }
    else if (Q6 == 2) {
            System.out.println("Which would you choose if you could only have one?");
            System.out.println("1. The power to change one day in your future");
            System.out.println("2. The power to change one day in your past");
            System.out.println("3. The power to make one person impervious to harm");
            System.out.println("4. The power to bring one person back from the dead");
            System.out.println("5. The power to cure one illness worldwide");
            System.out.println("6. The power to eradicate one quality from all humans");
            System.out.println("7. The power to know the answer to any single question");
            int input = Helper.readInt("-> ", 7);
            if (input == 1) {
                T=T+2;
            } else if (input == 2) {
                P++;
            } else if (input == 3) {
                P=P+2;
            } else if (input == 4) {
                H++;
            }else if (input == 5) {
                T++;
            }else if (input == 6) {
                W=W+2;
            }else if (input == 7) {
                W++;
                H=H+2;
            }
        }else if (Q6 == 3) {
            System.out.println("Where would you least like to find yourself?");
            System.out.println("1. Imprisoned alone in a silent dungeon");
            System.out.println("2. Locked in a crowded cage, standing room only");
            System.out.println("3. In the dock in court, accused of a crime you did not commit");
            System.out.println("4. On the deck of a ship as the tidal wave comes over the horizon");
            System.out.println("5. Trapped in the attic as the house burns below you");
            System.out.println("6. On the rope bridge fraying over the canyon");
            System.out.println("7. Lost in the forest at night, eyes staring at you through the dark");
            int input = Helper.readInt("-> ", 7);
            if (input == 1) {
                P=P+2;
            } else if (input == 2) {
                T=T+2;
                H++;
            } else if (input == 3) {
                P++;
            } else if (input == 4) {
                W++;
            }else if (input == 5) {
                W=W+2;
            }else if (input == 6) {
                H=H+2;
            }else if (input == 7) {
                T++;
            }
        }
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




}