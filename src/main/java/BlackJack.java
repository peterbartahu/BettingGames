import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    public void gameControl() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean nextFlop = true;

        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"}; // 13
        int myScore = playerGame(scanner, random, nextFlop, cards);
        int computerScore= computerGame(random, myScore, cards);
        System.out.println(whoWin(myScore, computerScore));

    }

    private String whoWin(int score1, int score2) {
        if(score1 > score2){
            return "Ön nyert!";
        }else if(score1 == score2){
            return "Döntetlen!";
        }else {
            return "A Bank nyert!";
        }

    }

    private int score(int myScore, String[] cards, int myCard) {
        if (myCard == 12) {
            myScore += aceNumero(myCard);
        } else if (myCard > 8 && myCard < 12) {
            myScore += figureCard(myCard);
        } else {
            myScore += Integer.parseInt(cards[myCard]);
        }
        return myScore;
    }

    private int computerGame(Random random, int playerScore, String[] cards) {
        boolean push = false;
        int computerScore = 0;

        do {
            int myCard = random.nextInt(13);

            if (myCard == 12) {
                if (computerScore > 11) {
                    computerScore += 11;
                } else {
                    computerScore += 1;
                }
            }

            if (myCard > 8 && myCard < 12) {
                computerScore += 10;
            }
            if (myCard != 12 && myCard < 9) {
                computerScore += Integer.parseInt(cards[myCard]);
            }

            if(computerScore == playerScore){
                push = true;
            }

            if (computerScore > playerScore && computerScore <= 21 || computerScore > 21) {
                push = true;
            }

            System.out.println("Bank lap: " + cards[myCard]);
            System.out.println("Bank lapösszeg: " + computerScore);
        } while ((!push));
        return computerScore;
    }

    private int playerGame(Scanner scanner, Random random, boolean nextFlop, String[] cards) {
        int myScore = 0;
        while (nextFlop) {
            System.out.println("Kérem laphúzáshoz nyomja meg a 0(nulla)-ás billentyűt\nvagy ha meg szeretne állni akkor nyomja meg az 1(egy)-es billentyűt. ");
            String húzás = scanner.nextLine();
            if (húzás.equals("1") || húzás.equals("0")) {
                int húzásÉrték = Integer.parseInt(húzás);
                if (húzásÉrték == 0) {
                    int myCard = random.nextInt(13);
                    System.out.println("Az Ön lapja: " + cards[myCard]);

                    myScore = score(myScore, cards, myCard);


                    if (myScore <= 21) {
                        System.out.println("Az Ön jelenlegi Összege: " + myScore);
                    } else {
                        System.out.println("Az Ön lapjainak a száma túl sok. A Bank Nyert.");
                        nextFlop = false;
                    }
                } else if (húzásÉrték == 1) {
                    System.out.println("Ön megállt. Az pontjai: " + myScore + "\n");

                    nextFlop = false;

                } else {
                    System.out.println("Érvénytelen parancs!!");
                }
            } else {
                System.out.println("Érvénytelen parancs");
            }
        }
        return myScore;
    }


    private int aceNumero(int myCard) {
        Scanner scanner = new Scanner(System.in);
        int plusPoint = 0;
        if (myCard == 12) {
            boolean valid = false;
            while (!valid) {
                System.out.println("Ön Ászt húzott!\nKérem döntse el hogy 1 vagy 11 értékkel szeretné felvenni?");
                String aszÉrték = scanner.nextLine();
                if (aszÉrték.equals("1")) {
                    plusPoint = 1;
                    valid = true;
                } else if (aszÉrték.equals("11")) {
                    plusPoint = 11;
                    valid = true;
                } else {
                    System.out.println("Érvénytelen parancs");
                }
            }
        }

        return plusPoint;
    }

    private int figureCard(int myCard) {
        int plusPoint = 0;
        if (myCard > 8 && myCard < 12) {
            plusPoint = 10;
        }
        return plusPoint;
    }
}