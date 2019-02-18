import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckGenerator {
    private ArrayList<String> cardSuits = new ArrayList<>(Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds"));
    private ArrayList<String> cardRanks = new ArrayList<>(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"));

    private Card newCard;

    public ArrayList<Card> makeADeckOfCards(){
        ArrayList<Card> deckOfCards = new ArrayList<>();
        for(String suit : cardSuits){
            for (String rank : cardRanks){
                newCard = new Card(suit, rank);
                //TODO Assign values to cards in Card Deck
                deckOfCards.add(newCard);
            }
        }
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public void showAllCardsInDeck(ArrayList<Card> cardDeck){
        for (Card card : cardDeck){
            card.printDetails();
        }
    }

}
