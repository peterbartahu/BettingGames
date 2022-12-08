package org.peter.blackjack;

import java.util.Scanner;

public class CardValueGenerator {
    public static int valueGenerator(int index) {
        Scanner scanner = new Scanner(System.in);
        int generatedValue = 0;

        if (index == 12) {
            while (true) {
                System.out.println("Ön ászt húzott, kérem döntse el az értékét");
                String aceValue = scanner.nextLine();
                if (aceValue.equals("1")) {
                    int number = Integer.parseInt(aceValue);
                    generatedValue += number;
                    break;
                } else if (aceValue.equals("11")) {
                    int number = Integer.parseInt(aceValue);
                    generatedValue += number;
                    break;
                } else {
                    System.out.println("Hibás érték");
                }
            }

        } else if (index >= 0 && index <= 8) {
            generatedValue += (index + 2);
        } else if (index > 8 && index < 12) {
            generatedValue += 10;
        }
        return generatedValue;
    }
}
