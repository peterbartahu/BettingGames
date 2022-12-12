package org.peter.blackjack;

public class GameSummary {
    public static void whoWin(int playerScore, int bankScore) {
        if (playerScore > 21) {
            System.out.println("A játékos pontjai meghaladták a 21-et, a Bank nyert.");
        } else {
            System.out.println("\nAz összesített eredmények alapján az Ön pontjai " + playerScore + ", a Bank pontjai pedig " + bankScore + ".");
            if ((playerScore <= 21 && bankScore > 21) || playerScore > bankScore) {
                System.out.println("\nÖn nyert!\n");
            } else if (playerScore == bankScore) {
                System.out.println("\nDöntetlen!\n");
            } else {
                System.out.println("\nA Bank nyert!\n");
            }
        }
    }
}
