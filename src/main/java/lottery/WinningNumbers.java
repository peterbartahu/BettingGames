package lottery;

import java.util.ArrayList;

public class WinningNumbers {

    public String winningNumbers(ArrayList<Integer> playerNumbers, ArrayList<Integer> lotteryNumbers){
        int counter = 0;
            for (int i = 0; i < playerNumbers.size(); i++) {
                if(lotteryNumbers.contains(playerNumbers.get(i))){
                    counter++;
                }
            }
        return "Találatok száma: " + counter;
    }
}
