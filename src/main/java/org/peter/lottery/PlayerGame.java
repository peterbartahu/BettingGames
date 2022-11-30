package org.peter.lottery;

import java.util.Scanner;

public class PlayerGame {

    public void playerNumberMix(int slots) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;

        if (slots == 5) {
            maxNumber = 45;
        } else if (slots == 6) {
            maxNumber = 90;
        }

        int i = 0;

        while (i != slots) {
            System.out.print("Kérem adjon meg egy számot 1 és " + maxNumber + " között. \n#");

            String playerLotteries = scanner.nextLine();

            if (isNumber(playerLotteries)) {
                int myNumber = Integer.parseInt(playerLotteries);
                if (myNumber > 0 && myNumber <= maxNumber) {
                    if (LotteryNumbers.getPlayerNumbers().contains(myNumber)) {
                        System.out.println("Ez a szám már szerepel a listában.");
                    } else {
                        LotteryNumbers.addPlayerNumbers(myNumber);
                        i++;
                    }
                } else {
                    System.out.println("Hibás szám");
                }
            } else {
                System.out.println("Hibás szám");
            }
        }
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