package org.peter.blackjack;

import java.util.Scanner;

public class CardValue {
    private int value;

    public int getCardValue() {
        return this.value;
    }

    public void setValue(int index){
        this.value = CardValueGenerator.valueGenerator(index);
    }

}
