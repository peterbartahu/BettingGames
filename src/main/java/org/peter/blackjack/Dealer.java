package org.peter.blackjack;

import java.util.Random;

public class Dealer {

    public static int giveCard() {
        Random random = new Random();

        int cardIndex = random.nextInt(Cards.length());
        System.out.println("Kártyalap : " + Cards.getCard(cardIndex));

        return cardIndex;
    }
}
