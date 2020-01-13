package cardgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck main = new Deck();
        ArrayList<Card> list = main.getDeck();


        System.out.println("This is a higher/lower cardgame");
        System.out.println("How To Play: ");
        System.out.println("Playing cards will be shown and you will have to decide whether or not the next card will be higher or lower.");
        System.out.println("For each correct answer 1 point will be given and at the end of the game you total score will be shown.");
        boolean playing = true;
        int score = 0; //beginscore
        Card currentCard = main.randomCard(); //begincard
        while (playing) {
            Card nextCard = main.randomCard();

            System.out.println("\nGiven Card: " + currentCard);
            System.out.println("Will the next card be higher or lower?");
            String answer = sc.nextLine();

            if (nextCard.getValue() > currentCard.getValue()  && answer.toLowerCase().equals("higher")) {
                score++;
                System.out.println("You are right! Score(" + score + ")");

            } else if (nextCard.getValue()  < currentCard.getValue()  && answer.toLowerCase().equals("lower")) {
                score++;
                System.out.println("You are right!  Score(" + score + ")");

            } else if (nextCard.getValue()  == currentCard.getValue() ) {
                System.out.println("\nGiven Card: " + nextCard);
                System.out.println("The card value is the same, that is unfortunate :(");
                System.out.println("Your total score: " + score);
                score = 0;
                playing = false;

            } else {
                System.out.println("\nGiven Card: " + nextCard);
                System.out.println("You are wrong!");
                System.out.println("Your total score: " + score);
                score = 0;
                playing = false;

            }

            currentCard = nextCard; //The shown card becomes the new currentCard at the end of loop.
        }

    }
}
