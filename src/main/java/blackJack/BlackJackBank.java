package blackJack;

import java.util.Random;

public class BlackJackBank{
    int bankScore = 0;

    public int getBankScore() {
        return bankScore;
    }

    public void gameNow(int score) {
        computerGame(score);
    }

    private int computerGame(int playerScore) {
        System.out.println();
        Random random = new Random();
        boolean push = false;

        BlackJackCards cards = new BlackJackCards();

        do {
            int myCard = random.nextInt(13);

            System.out.println("Lapösszeg húzás előtt: " + bankScore);
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

            System.out.println("Bank lap: " + cards.getCard(myCard));
            System.out.println("Bank lapösszeg: " + bankScore + "\n");

            if (bankScore == playerScore || bankScore > playerScore || bankScore > 21) {
                push = true;
            }

        } while ((!push));

        return this.bankScore;
    }
}
