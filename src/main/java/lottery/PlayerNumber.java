package lottery;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerNumber {
    int slots;
    private ArrayList<Integer> playerNumbers;

    public PlayerNumber(int slots) {
        this.slots = slots;
        this.playerNumbers = playerNumberMix(slots);
    }

    public ArrayList<Integer> getPlayerNumbers() {
        return this.playerNumbers;
    }

    private ArrayList<Integer> playerNumberMix(int slots) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> playerNumbers = new ArrayList<>();

        int maxNumber = 0;

        if (slots == 5) {
            maxNumber = 45;
        } else if (slots == 6) {
            maxNumber = 90;
        }
        int i = 0;

        while(i != slots) {
            System.out.print("Kérem adjon meg egy számot 1 és " + maxNumber + " között. \n#");
            int playerLotteries = scanner.nextInt();
            if (playerLotteries > 0 && playerLotteries <= maxNumber) {
                if (!playerNumbers.contains(playerLotteries)) {
                    playerNumbers.add(playerLotteries);
                    i++;
                } else {
                    System.out.println("Ez a szám már szerepel a listában.");
                }
            } else {
                System.out.println("Hibás szám!");
            }
        }
        return playerNumbers;
    }
}
