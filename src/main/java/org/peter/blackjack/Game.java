package org.peter.blackjack;

public class Game {

    public void gameControl() {
        System.out.println("Üdvözlöm a Blackjack játékban! \nÖn a Bank ellen fog játszani, a játék célja, hogy az Ön lapjainak összértéke minél közelebb legyen a huszonegyhez. \nHa az Ön lapjai nem lépik túl a 21-et és az Ön lapjainak az összege magasabb mint a Bank lapjainak összege akkor Ön nyert! \nSok szerencsét!\n");
        Score score = new Score();
        score.addPlayerScore(PlayerGame.playerGame());
        score.addComputerScore(BankPlayer.computerGame(score.getPlayerScore()));
        GameSummary.whoWin(score.getPlayerScore(), score.getComputerScore());
    }
}