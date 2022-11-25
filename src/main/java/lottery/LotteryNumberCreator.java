package lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumberCreator{

    int slots,min,max;
    ArrayList<Integer> lotteryNumbers;

    public LotteryNumberCreator(int slots, int min, int max) {
        this.slots = slots;
        this.min = min;
        this.max = max;
        this.lotteryNumbers  = lotteryNumberMix(slots,min,max);
    }

    public ArrayList<Integer> getLotteryNumbers() {
       return this.lotteryNumbers;
    }

    private ArrayList<Integer> lotteryNumberMix(int slots, int min, int max){
        boolean flag = false;
        ArrayList<Integer> myLotteries = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < slots; i++) {
            int lotteryNumber = random.nextInt((max+1) - min) + min;
            do {
                for (int j = 0; j < i; j++) {
                    if(myLotteries.contains(lotteryNumber)){
                        flag = true;
                        break;
                    }
                }
            }while (flag);
            myLotteries.add(lotteryNumber);
        }
        return myLotteries;
    }
}
