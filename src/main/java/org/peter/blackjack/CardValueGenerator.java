package org.peter.blackjack;

import java.util.Scanner;

public class CardValueGenerator {
    public static int valueGenerator(int index) {
        Scanner scanner = new Scanner(System.in);
        int cardValue = 0;
        if (index == 12) {
            while (true) {
                System.out.println("Ön ászt húzott, kérem üsse be hogy 1 vagy 11 értéket szeretne választani a laphoz.");
                String aceValue = scanner.nextLine();
                if (aceValue.equals("1")) {
                    int number = Integer.parseInt(aceValue);
                    cardValue += number;
                    break;
                } else if (aceValue.equals("11")) {
                    int number = Integer.parseInt(aceValue);
                    cardValue += number;
                    break;
                } else {
                    System.out.println("Hibás érték");
                }
            }

        } else if (index >= 0 && index <= 8) {
            cardValue += (index + 2);
        } else if (index > 8 && index < 12) {
            cardValue += 10;
        }
        return cardValue;
    }
}
