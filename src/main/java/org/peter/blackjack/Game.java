package org.peter.blackjack;

public class Game {

    public void gameControl() {
        System.out.println("Üdvözlöm a Blackjack játékban! \nÖn a Bank ellen fog játszani, a játék célja, hogy az Ön lapjainak összértéke minél közelebb legyen a huszonegyhez. \nHa az Ön lapjai nem lépik túl a 21-et és az Ön lapjainak az összege magasabb mint a Bank lapjainak összege akkor Ön nyert! \nSok szerencsét!\n");
        Score score = new Score();
        score.addPlayerScore(PlayerGame.playerGame());
        score.addComputerScore(ComputerPlayer.computerGame(score.getPlayerScore()));
        whoWin(score.getPlayerScore(),score.getComputerScore());
    }

    private void whoWin(int score1, int score2) {
        System.out.println("\nAz összesített eredmények alapján az Ön pontjai " + score1 + ", a Bank pontjai pedig " + score2 + ".");
        if ((score1 <= 21 && score2 > 21) || score1 > score2) {
            System.out.println("\nÖn nyert!\n");
        } else if (score1 == score2) {
            System.out.println("\nDöntetlen!\n");
        } else {
            System.out.println("\nA Bank nyert!\n");
        }
    }

}