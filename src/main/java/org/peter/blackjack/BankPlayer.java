package org.peter.blackjack;


public class BankPlayer {

    public static int computerGame(int score) {
        int cScore = 0;
        boolean flag = true;
        if (score > 21) {

        } else {

            System.out.println("A Bank köre következik: ");
            while (flag && !(cScore > 21) && !(score > 21)) {

                int dealerCard = Dealer.giveCard();
                if (dealerCard == 12) {
                    if (cScore < 10) {
                        System.out.println("Bank Ász lapot húzott. A választott érték: 11");
                        cScore += 11;
                    } else {
                        System.out.println("Bank Ász lapot húzott. A választott érték: 1");
                        cScore += 1;
                    }
                } else if (dealerCard > 8 && dealerCard < 12) {
                    cScore += 10;
                } else {
                    cScore += CardValueGenerator.valueGenerator(dealerCard);
                }
                if (cScore > score || cScore == score || cScore == 21) {
                    flag = false;
                }
                System.out.println("A Bank pontjai: " + cScore);
            }
        }

        return cScore;
    }
}

