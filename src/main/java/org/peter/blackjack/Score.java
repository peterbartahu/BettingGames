package org.peter.blackjack;

public class Score {

    private int playerScore;
    private int computerScore;

    public int getPlayerScore() {
        return playerScore;
    }

    public void addPlayerScore(int score) {
        playerScore += score;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void addComputerScore(int score) {
        computerScore += score;
    }
}
