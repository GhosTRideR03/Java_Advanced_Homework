package Homeworks.Java_Advanced_Homework.HomeworkFour;

import java.util.Random;

public class Deck {
    private final Card[] cards;
    private int currentCardIndex;

    public Deck() {
        cards = new Card[Suit.values().length * Rank.values().length];
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[index] = new Card(suit, rank); // Создание всех возможных карт и добавление их в колоду
                index++;
            }
        }
        currentCardIndex = 0;
        shuffle();
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndex = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[randomIndex];
            cards[randomIndex] = temp;
        }
    }

    public Card getCard() {
        if (currentCardIndex < cards.length) {
            return cards[currentCardIndex++];
        } else {
            return null;
        }
    }
}

