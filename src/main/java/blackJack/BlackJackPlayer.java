package blackJack;

import java.util.Random;
import java.util.Scanner;

public class BlackJackPlayer extends BlackJackCardScore {

    int playerScore;

    public int getPlayerScore(){
        return this.playerScore;
    }

    public void gameNow(){
        playerGame();
    }

    private int playerGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        BlackJackCards cards = new BlackJackCards();
        BlackJackCardScore cardScore = new BlackJackCardScore();

        boolean nextFlop = true;

        while (nextFlop) {
            System.out.println("Kérem laphúzáshoz nyomja meg a 0(nulla)-ás billentyűt\nvagy ha meg szeretne állni akkor nyomja meg az 1(egy)-es billentyűt. ");
            String húzás = scanner.nextLine();
            int myScore = 0;
            if (húzás.equals("1") || húzás.equals("0")) {
                int húzásÉrték = Integer.parseInt(húzás);
                if (húzásÉrték == 0) {
                    int myCard = random.nextInt(13);
                    System.out.println("Az Ön lapja: " + cards.getCard(myCard));
                    myScore += cardScore.setCardScore(myCard);
                    score += myScore;
                    if (myScore <= 21) {
                        System.out.println("Az Ön jelenlegi Összege: " + cardScore.getScore() + "\n");
                    } else {
                        System.out.println("Az Ön lapjainak a száma túl sok. A Bank Nyert.");
                        nextFlop = false;
                    }
                } else if (húzásÉrték == 1) {
                    System.out.println("\nÖn megállt. A lapjainak összege: " + cardScore.getScore() + "\n");

                    nextFlop = false;

                } else {
                    System.out.println("Érvénytelen parancs!");
                }
            } else {
                System.out.println("Érvénytelen parancs!");
            }
        }
        return this.playerScore = cardScore.getScore();
    }
}
