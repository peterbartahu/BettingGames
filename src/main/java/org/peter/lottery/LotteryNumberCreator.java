package org.peter.lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryNumberCreator {


    public void lotteryNumberMix(int slots) {
        int min = 1;
        int max = 0;
        if (slots == 5) {
            max = 45;
        } else if (slots == 6) {
            max = 90;
        }
        boolean flag = false;
        Random random = new Random();


        for (int i = 0; i < slots; i++) {
            int lotteryNumber = random.nextInt((max + 1) - min) + min;
            do {
                for (int j = 0; j < i; j++) {
                    if (LotteryNumbers.getLotteryNumbers().contains(lotteryNumber)) {
                        flag = true;
                        break;
                    }
                }
            } while (flag);
            LotteryNumbers.addLotteryNumber(lotteryNumber);
        }
    }
}
