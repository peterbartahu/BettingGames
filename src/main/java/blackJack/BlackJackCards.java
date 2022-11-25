package blackJack;

public class BlackJackCards {
    private final String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"}; // 0-12

    public String getCard(int place){
        return cards[place];
    }
}
