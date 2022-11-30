package org.peter.gamerunner;

import java.util.List;
import org.peter.lottery.LotteryNumberCreator;
import org.peter.lottery.LotteryNumbers;
import org.peter.lottery.PlayerGame;
import org.peter.lottery.WinningNumbers;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Game {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Sok szeretettel üdvözljük és sikeres játékot kíváunk!");
        System.out.printf("A mai dátum: %1$tY. %1$tm. %1$te. \n", Calendar.getInstance());

        new Menu().showMenu();

        while (flag) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    new Menu().showMenu();
                    break;
                case 1:

                    new PlayerGame().playerNumberMix(5);
                    new LotteryNumberCreator().lotteryNumberMix(5);


                    System.out.println("\nAz Ön számai: ");
                    showLotteries(LotteryNumbers.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showLotteries(LotteryNumbers.getLotteryNumbers());

                    LotteryNumbers.clearNumbers();

                    System.out.println("\n" + new WinningNumbers().winningNumbers());


                    new Menu().showMenu();
                    break;

                case 2:
                    new PlayerGame().playerNumberMix(6);
                    new LotteryNumberCreator().lotteryNumberMix(6);

                    System.out.println("\nAz Ön számai: ");
                    showLotteries(LotteryNumbers.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showLotteries(LotteryNumbers.getLotteryNumbers());

                    LotteryNumbers.clearNumbers();


                    System.out.println("\n" + new WinningNumbers().winningNumbers());

                    new Menu().showMenu();
                    break;
                case 3:
                    org.peter.blackjack.Game blackJack = new org.peter.blackjack.Game();
                    blackJack.gameControl();
                    new Menu().showMenu();
                    break;
                case 4:
                    System.out.println("\nKöszönjük a játékot!");
                    flag = false;
                    break;
            }
        }
    }


    private void showLotteries(List<Integer> myList) {
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
