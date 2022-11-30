package org.peter.blackjack;


public class ComputerPlayer {


    public static int computerGame() {


        System.out.println("A Bank köre: ");

        int cardIndex = Dealer.giveCard();
        int cardValue = CardValue.valueGenerator(cardIndex);
        if (cardIndex == 12) {
            if (Score.getComputerScore() <= 10) {
                Score.addComputerScore(11);
            } else {
                Score.addComputerScore(1);
            }
        } else if (cardValue > 8 && cardValue < 12) {
            Score.addComputerScore(10);
        } else {
            Score.addComputerScore(cardIndex + 2);
        }


        System.out.println("A Bank pontjai: " + Score.getComputerScore() + "\n");


        return Score.getComputerScore();
    }
}

