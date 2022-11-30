package org.peter.blackjack;

import java.util.Random;

public class Dealer {

    private static int validNumber(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        return -1;
    }

    public static boolean askCard(int num) {
        if (validNumber(num) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean notAskCard(int num) {
        if (validNumber(num) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int giveCard() {
        Random random = new Random();

        int cardIndex = random.nextInt(Cards.length());
        System.out.println("Kártyalap : " + Cards.getCard(cardIndex));

        return cardIndex;
    }

}
