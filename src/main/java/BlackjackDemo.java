import java.util.ArrayList;

public class BlackjackDemo {
    public static void main(String[] args) {

        //Testing building of deck
        DeckGenerator generator = new DeckGenerator();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();

        generator.showAllCardsInDeck(deckOfCards);
        System.out.println(deckOfCards.size());

    }
}

