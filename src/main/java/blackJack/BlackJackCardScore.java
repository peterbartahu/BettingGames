package blackJack;

import java.util.Scanner;

public class BlackJackCardScore extends BlackJackCards {
    int score;

    public int getScore() {
        return score;
    }

    public int setCardScore(int value){
        return score += cardValue(value);
    }

    private int cardValue(int myCard) {
        Scanner scanner = new Scanner(System.in);
        int myScore = 0;
        if (myCard == 12) {
            boolean valid = false;
            while (!valid) {
                System.out.println("Ön Ászt húzott!\nKérem döntse el hogy 1 vagy 11 értékkel szeretné felvenni?");
                String aszÉrték = scanner.nextLine();
                if (aszÉrték.equals("1")) {
                    myScore += 1;
                    valid = true;
                } else if (aszÉrték.equals("11")) {
                    myScore += 11;
                    valid = true;
                } else {
                    System.out.println("Érvénytelen parancs");
                }
            }
        }
        if (myCard > 8 && myCard < 12) {
            myScore += 10;
        }
        if (myCard != 12 && myCard <= 8) {
            myScore += myCard + 2;
        }
        return myScore;
    }
}
