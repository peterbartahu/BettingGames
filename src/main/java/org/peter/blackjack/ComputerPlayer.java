package org.peter.blackjack;

import java.util.Random;

public class ComputerPlayer {
    int bankScore = 0;

    public int getBankScore() {
        return this.bankScore;
    }

    public void bankSimulation(int score) {
        this.bankScore = computerGame(score);
    }

    private int computerGame(int playerScore) {
        Random random = new Random();
        boolean push = false;

        int bankScore = 0;

        do {
            int myCard = random.nextInt(Cards.length());

            if (myCard == 12) {
                if (bankScore >= 11) {
                    bankScore += 1;
                } else {
                    bankScore += 11;
                }
            } else if (myCard < 12 && myCard > 8) {
                bankScore += 10;
            } else {
                bankScore += myCard + 2;
            }

            System.out.println("Bank lap: " + Cards.getCard(myCard));
            System.out.println("Bank lapösszeg: " + bankScore + "\n");

            if (bankScore == playerScore || bankScore > playerScore || bankScore > 21) {
                push = true;
            }

        } while ((!push));

        return bankScore;
    }

}
