package org.peter.lottery;

import java.util.List;

public class WinningNumbers {
    public String winningNumbers(final List<Integer> playerNumbers, final List<Integer> lotteryNumbers) {
        int score = 0;
        for (int i = 0; i < playerNumbers.size(); i++) {
            if (lotteryNumbers.contains(playerNumbers.get(i))) {
                score++;
            }
        }
        return "Találatok száma: " + score;
    }
}
