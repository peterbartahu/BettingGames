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

        showMenu();

        while (flag) {

            WinningNumbers haveWinningNumber = new WinningNumbers();

            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    PlayerNumber playerNumbersForFive = new PlayerNumber(5);
                    LotteryNumberCreator lotteryNumbersCreatorForFive = new LotteryNumberCreator(5, 1, 45);


                    System.out.println("\nAz Ön számai: ");
                    showNumbers(playerNumbersForFive.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showNumbers(lotteryNumbersCreatorForFive.getLotteryNumbers());

                    System.out.println("\n" + haveWinningNumber.winningNumbers(playerNumbersForFive.getPlayerNumbers(), lotteryNumbersCreatorForFive.getLotteryNumbers()));
                    showMenu();
                    break;

                case 2:
                    PlayerNumber playerNumbersForSix = new PlayerNumber(6);
                    LotteryNumberCreator lotteryNumbersCreatorForSix = new LotteryNumberCreator(6, 1, 90);

                    System.out.println("\nAz Ön számai: ");
                    showNumbers(playerNumbersForSix.getPlayerNumbers());

                    System.out.println("\nA sorsolás számai: ");
                    showNumbers(lotteryNumbersCreatorForSix.getLotteryNumbers());

                    System.out.println("\n" + haveWinningNumber.winningNumbers(playerNumbersForSix.getPlayerNumbers(), lotteryNumbersCreatorForSix.getLotteryNumbers()));
                    showMenu();
                    break;
                case 3:
                    BlackJack blackJack = new BlackJack();
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

    private void showMenu() {
        System.out.println("\nKérem válasszon az alábbi opciók közül");
        System.out.println("\t 0 - Menü mutatása");
        System.out.println("\t 1 - Ötös lottó játék");
        System.out.println("\t 2 - Hatos lottó játék");
        System.out.println("\t 3 - BlackJack");
        System.out.println("\t 4 - Kilépés");
        System.out.print("\nMenü pont: ");
    }

    private void showNumbers(ArrayList<Integer> myList) {
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
