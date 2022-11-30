package org.peter.lottery;

import java.util.ArrayList;
import java.util.List;

public final class LotteryNumbers {
    public static List<Integer> lotteryNumbers = new ArrayList<>();
    public static List<Integer> playerNumbers = new ArrayList<>();

    public static List<Integer> getLotteryNumbers() {
        return lotteryNumbers;
    }

    public static List<Integer> getPlayerNumbers() {
        return playerNumbers;
    }

    public static void addLotteryNumber(int number) {
        lotteryNumbers.add(number);
    }

    public static void addPlayerNumbers(int number) {
        playerNumbers.add(number);
    }

    public static void clearNumbers(){
        lotteryNumbers = new ArrayList<>();
        playerNumbers = new ArrayList<>();
    }
}
