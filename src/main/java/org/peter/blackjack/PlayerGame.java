package org.peter.blackjack;

import java.util.Random;
import java.util.Scanner;

public class PlayerGame {
    int playerScore;

    public int getPlayerScore() {
        return this.playerScore;
    }

    public void gameNow() {
        this.playerScore = playerGame();
    }

    private int playerGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int myScore = 0;

        boolean nextFlop = true;

        while (nextFlop) {
            System.out.println("Kérem laphúzáshoz nyomja meg a 0(nulla)-ás billentyűt\nvagy ha meg szeretne állni akkor nyomja meg az 1(egy)-es billentyűt. ");
            String pick = scanner.nextLine();
            if (pick.equals("1") || pick.equals("0")) {
                int pickValue = Integer.parseInt(pick);
                if (pickValue == 0) {
                    int cardIndex = random.nextInt(Cards.length());
                    System.out.println("Az Ön lapja: " + Cards.getCard(cardIndex));
                    if (cardIndex == Cards.length()-1) {
                        boolean valid = false;
                        while (!valid) {
                            System.out.println("Ön Ászt húzott!\nKérem döntse el hogy 1 vagy 11 értékkel szeretné felvenni?");
                            String aceValue = scanner.nextLine();
                            if (aceValue.equals("1")) {
                                myScore += 1;
                                valid = true;
                            } else if (aceValue.equals("11")) {
                                myScore += 11;
                                valid = true;
                            } else {
                                System.out.println("Érvénytelen parancs");
                            }
                        }
                    }
                    if (cardIndex > 8 && cardIndex < 12) {
                        myScore += 10;
                    }
                    if (cardIndex <= 8) {
                        myScore += cardIndex + 2;
                    }

                    this.playerScore = myScore;

                    if (myScore <= 21) {
                        System.out.println("Az Ön jelenlegi Összege: " + getPlayerScore() + "\n");
                    } else {
                        System.out.println("Az Ön lapjainak a száma túl sok. A Bank Nyert.");
                        nextFlop = false;
                    }
                } else if (pickValue == 1) {
                    System.out.println("\nÖn megállt. A lapjainak összege: " + getPlayerScore() + "\n");

                    nextFlop = false;

                } else {
                    System.out.println("Érvénytelen parancs!");
                }
            } else {
                System.out.println("Érvénytelen parancs!");
            }
        }
        return myScore;
    }
}
