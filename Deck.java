package cardgame;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Random random = new Random();
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        fillDeck();

    }

    private void fillDeck() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card c = new Card(i, j);
                deck.add(c);
            }

        }

    }

    public Card randomCard() { //here it picks a random card out of the index. Another method, shuffling the deck and then picking a card.
        int indexNumber = random.nextInt(deck.size());
        return deck.get(indexNumber);

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

}
