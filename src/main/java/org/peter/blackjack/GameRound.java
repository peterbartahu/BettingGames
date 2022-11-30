package org.peter.blackjack;

public class GameRound {

    public void gameControl() {
        do {
            PlayerGame.playerGame();
            if (Score.getPlayerScore() < 21 && Score.getPlayerScore() > Score.getComputerScore()) {
                ComputerPlayer.computerGame();
            }
        } while (gameValidation(Score.getPlayerScore(), Score.getComputerScore()) && NextRound.isPlayerNextRound() && NextRound.isComputerNextRound());


    }

    private void whoWin(int score1, int score2) {
        if ((score1 <= 21 && score2 > 21) || score1 > score2) {
            System.out.println("\nÖn nyert\n");
        } else if (score1 == score2) {
            System.out.println("\nDöntetlen\n");
        } else {
            System.out.println("\nA Bank nyert\n");
        }
    }


    private boolean gameValidation(int playerScore, int computerScore) {
            if (playerScore > 21) {
                System.out.println("A játékos pontjai meghaladták a 21-et. Ön vesztett.\nA Bank pontja: " + Score.getComputerScore());
                return false;
            }
            if (computerScore > 21) {
                System.out.println("A Bank Pontjai meghaladták a 21-et. Ön nyert.");
                return false;
            }
            return true;
        }
}