package org.peter.gamerunner;

import java.util.List;
import org.peter.blackjack.GameRound;
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

        showMenu();

        while (flag) {
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    lotteryGame(5);
                    break;
                case 2:
                    lotteryGame(6);
                    break;
                case 3:
                    GameRound blackJack = new GameRound();
                    blackJack.gameControl();
                    showMenu();
                    break;
                case 4:
                    System.out.println("\nKöszönjük a játékot!");
                    flag = false;
                    break;
            }
        }
    }

    private void lotteryGame(int slots) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        lotteryNumbers.setLotteryNumbers(LotteryNumberCreator.lotteryNumberMix(slots));
        lotteryNumbers.setPlayerNumbers(PlayerGame.playerNumberMix(slots));

        System.out.println("\nAz Ön számai: ");
        showLotteries(lotteryNumbers.getPlayerNumbers());

        System.out.println("\nA sorsolás számai: ");
        showLotteries(lotteryNumbers.getLotteryNumbers());
        System.out.println("\n" + new WinningNumbers().winningNumbers(lotteryNumbers.getPlayerNumbers(), lotteryNumbers.getLotteryNumbers()));

        lotteryNumbers.clearLists();
        showMenu();
    }

    private void showLotteries(List<Integer> myList) {
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }

    public void showMenu() {
        System.out.println("\nKérem válasszon az alábbi opciók közül");
        System.out.println("\t 0 - Menü mutatása");
        System.out.println("\t 1 - Ötös lottó játék");
        System.out.println("\t 2 - Hatos lottó játék");
        System.out.println("\t 3 - BlackJack játék");
        System.out.println("\t 4 - Kilépés");
        System.out.print("\nMenü pont: ");
    }
}

