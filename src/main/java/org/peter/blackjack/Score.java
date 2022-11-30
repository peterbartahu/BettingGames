package org.peter.blackjack;

public class Score {

    private static int playerScore = 0;
    private static int computerScore = 0;

    public static int getPlayerScore() {
        return playerScore;
    }

    public static int addPlayerScore(int score) {
        return playerScore += score;
    }

    public static int getComputerScore() {
        return computerScore;
    }

    public static void addComputerScore(int score) {
        computerScore += score;
    }
}
