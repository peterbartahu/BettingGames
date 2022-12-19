package org.peter.blackjack;

public class BankPlayer {
    public static int computerSimulation(final int playerScore) {
        int bankScore = 0;
        boolean flag = true;
        if (!(playerScore > 21)) {
            System.out.println("A Bank köre következik: ");
            while (flag) {
                final int dealerCard = Dealer.giveCard();
                if (dealerCard == 12) {
                    if (bankScore <= 10) {
                        System.out.println("Bank Ász lapot húzott. A választott érték: 11");
                        bankScore += 11;
                    } else {
                        System.out.println("Bank Ász lapot húzott. A választott érték: 1");
                        bankScore += 1;
                    }
                } else if (dealerCard > 8 && dealerCard < 12) {
                    bankScore += 10;
                } else {
                    bankScore += CardValueGenerator.valueGenerator(dealerCard);
                }
                if (bankScore > playerScore || bankScore == playerScore || bankScore == 21) {
                    flag = false;
                }
                System.out.println("A Bank pontjai: " + bankScore);
            }
        }
        return bankScore;
    }
}

