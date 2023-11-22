package Homeworks.Java_Advanced_Homework.HomeworkFour;

import java.util.Arrays;

public class Player {
    Card[] hand ;
    String playerName;

    public Player(int numCards, String playerName) {
        this.hand = new Card[numCards];
        this.playerName = playerName;
    }

    public void playerCards(Card card, int index) {
        hand[index] = card;
    }

    @Override
    public String toString() {
        return "Player " + playerName + "{" +
                "hand=" + Arrays.toString(hand) +
                ", playerName='" + playerName + '\'' +
                '}';
    }

}
