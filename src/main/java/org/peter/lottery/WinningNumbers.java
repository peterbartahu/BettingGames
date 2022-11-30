package org.peter.lottery;

import java.util.List;

public class WinningNumbers {
    public String winningNumbers() {
        List<Integer> playerNumbers = LotteryNumbers.getPlayerNumbers();
        List<Integer> lotteryNumbers = LotteryNumbers.getLotteryNumbers();
        int score = 0;
        for (int i = 0; i < lotteryNumbers.size(); i++) {
            if (lotteryNumbers.contains(playerNumbers.get(i))){
                score++;
            }
        }
        return "Találatok száma: " + score;
    }
}
