package Homeworks.Java_advanced_Homeworks.HomeworkFour;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players;
        final int cardsPerPlayer = 5;


        while (true) {
            System.out.println("Enter number of players: ");
            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                if (Rank.values().length * Suit.values().length >= players * cardsPerPlayer) {
                    break;
                } else {
                    System.out.println("Invalid number of players");
                }
            } else {
                System.out.println("Input a valid number: ");
                scanner.hasNext();
            }
        }

        Deck deck = new Deck();
        Player[] playersArray = new Player[players];
        for (int i = 0; i < players; i++) {
            playersArray[i] = new Player(5, "Player " + (i + 1));
        }


        for (int i = 0; i < players; i++) {
            for (Player player : playersArray) {
                Card card = deck.getCard();
                if (card != null) {
                    player.playerCards(card, i);
                }
            }
        }


        for (Player player : playersArray) {
            System.out.println(player);
        }
    }
}
