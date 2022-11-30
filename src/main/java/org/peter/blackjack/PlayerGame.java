package org.peter.blackjack;

import java.util.Scanner;

public class PlayerGame {

    public static int playerGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Az Ön köre: ");
        System.out.println("Kérem laphúzáshoz nyomja meg a 0(nulla)-ás billentyűt\nvagy ha meg szeretne állni akkor nyomja meg az 1(egy)-es billentyűt. ");
        String pick = scanner.nextLine();
        if (isNumber(pick)) {
            if (Dealer.askCard((Integer.parseInt(pick)))) {

                Score.addPlayerScore(CardValue.valueGenerator(Dealer.giveCard()));

                System.out.println("Az Ön Pontjai: " + Score.getPlayerScore() + "\n");

            } else if (Dealer.notAskCard((Integer.parseInt(pick)))) {
                System.out.println("Ön megállt. Az eredménye: " + Score.getPlayerScore() + "\n");
                NextRound.noPlayerNextRound();
            } else {
                System.out.println("Hibás parancs!");
            }
        } else {
            System.out.println("Hibás parancs");
        }

        return Score.getPlayerScore();

    }

    private static boolean isNumber(String numb) {
        try {
            Integer.parseInt(numb);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}