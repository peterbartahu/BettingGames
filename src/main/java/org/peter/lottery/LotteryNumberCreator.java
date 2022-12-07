package org.peter.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryNumberCreator {

    public static List<Integer> lotteryNumberMix(int slots) {
        List<Integer> lotteries = new ArrayList<>();
        int max = 0;
        if (slots == 5) {
            max = 45;
        } else if (slots == 6) {
            max = 90;
        }
        boolean flag = false;
        Random random = new Random();

        for (int i = 0; i < slots; i++) {
            int lotteryNumber = random.nextInt((max + 1) - 1) + 1;
            do {
                for (int j = 0; j < i; j++) {
                    if (lotteries.contains(lotteryNumber)) {
                        flag = true;
                        break;
                    }
                }
            } while (flag);
            lotteries.add(lotteryNumber);
        }

        return lotteries;
    }
}
