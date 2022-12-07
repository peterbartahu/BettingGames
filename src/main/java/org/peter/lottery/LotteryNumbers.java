package org.peter.lottery;

import java.util.ArrayList;
import java.util.List;

public final class LotteryNumbers {
    private List<Integer> lotteryNumbers = new ArrayList<>();
    private List<Integer> playerNumbers = new ArrayList<>();

    public List<Integer> getLotteryNumbers() {
        return this.lotteryNumbers;
    }

    public List<Integer> getPlayerNumbers() {
        return this.playerNumbers;
    }

    public void setLotteryNumbers(List<Integer> numbers) {
        this.lotteryNumbers = numbers;
    }

    public void setPlayerNumbers(List<Integer> numbers) {
        this.playerNumbers = numbers;
    }

    public  void clearLists() {
        this.lotteryNumbers = new ArrayList<>();
        this.playerNumbers = new ArrayList<>();
    }
}
