package org.peter.blackjack;

public class NextRound {
    private static boolean playerNextRound = true;
    private static boolean computerNextRound = true;

    public static boolean isPlayerNextRound() {
        return playerNextRound;
    }

    public static void noPlayerNextRound() {
        NextRound.playerNextRound = false;
    }

    public static boolean isComputerNextRound() {
        return computerNextRound;
    }

}
