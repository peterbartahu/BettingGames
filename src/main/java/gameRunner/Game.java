package gameRunner;

import blackJack.BlackJackGame;
import lottery.LotteryNumberCreator;
import lottery.PlayerNumber;
import lottery.WinningNumbers;
import java.util.ArrayList;
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

            WinningNumbers haveWinningNumber = new WinningNumbers();

            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    new Menu().showMenu();
                    break;
                case 1:
                    PlayerNumber playerNumbersForFive = new PlayerNumber(5);
                    LotteryNumberCreator lotteryNumbersCreatorForFive = new LotteryNumberCreator(5, 1, 45);


                    System.out.println("\nAz Ön számai: ");
                    showLotteries(playerNumbersForFive.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showLotteries(lotteryNumbersCreatorForFive.getLotteryNumbers());

                    System.out.println("\n" + haveWinningNumber.winningNumbers(playerNumbersForFive.getPlayerNumbers(), lotteryNumbersCreatorForFive.getLotteryNumbers()));
                    new Menu().showMenu();
                    break;

                case 2:
                    PlayerNumber playerNumbersForSix = new PlayerNumber(6);
                    LotteryNumberCreator lotteryNumbersCreatorForSix = new LotteryNumberCreator(6, 1, 90);

                    System.out.println("\nAz Ön számai: ");
                    showLotteries(playerNumbersForSix.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showLotteries(lotteryNumbersCreatorForSix.getLotteryNumbers());

                    System.out.println("\n" + haveWinningNumber.winningNumbers(playerNumbersForSix.getPlayerNumbers(), lotteryNumbersCreatorForSix.getLotteryNumbers()));
                    new Menu().showMenu();
                    break;
                case 3:
                    BlackJackGame blackJack = new BlackJackGame();
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


    private void showLotteries(ArrayList<Integer> myList) {
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
