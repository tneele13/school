 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardgame;

public class Card {

    private final int value;
    private final int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {                    // Gets value by index // Another method, is giving values by enums, but that is for another time in cardgame improved package.
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};
        return values[value] + " of " + suits[suit];
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

}
