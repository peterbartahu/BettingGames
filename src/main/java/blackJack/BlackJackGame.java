package blackJack;

public class BlackJackGame {

    public void gameControl() {

        BlackJackPlayer player = new BlackJackPlayer();
        BlackJackBank bank = new BlackJackBank();


        player.gameNow();

        if(player.getPlayerScore() <=21){
            bank.gameNow(player.getPlayerScore());
            whoWin(player.getPlayerScore(),bank.getBankScore());
        }


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
}