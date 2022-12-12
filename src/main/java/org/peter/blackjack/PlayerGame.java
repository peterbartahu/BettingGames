package org.peter.blackjack;

import java.util.Scanner;

public class PlayerGame {

    public static int playerGame() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Az Ön köre: ");
            System.out.println("Kérem laphúzáshoz nyomja meg a 0(nulla)-ás billentyűt\nvagy ha meg szeretne állni akkor nyomja meg az 1(egy)-es billentyűt. ");
            String pick = scanner.nextLine();
            if (pick.equals("0") || pick.equals("1")) {
                if (pick.equals("0")) {
                    score += CardValueGenerator.valueGenerator(Dealer.giveCard());
                    System.out.println("Az Ön Pontjai: " + score + "\n");
                    if (score > 21) {
                        flag = false;
                    }
                } else if (pick.equals("1")) {
                    System.out.println("Ön megállt. Az eredménye: " + score + "\n");
                    flag = false;
                } else {
                    System.out.println("Hibás parancs!");
                }
            } else {
                System.out.println("Hibás parancs");
            }
        }
        return score;
    }

}