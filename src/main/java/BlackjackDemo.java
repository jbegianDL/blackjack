import java.util.ArrayList;

public class BlackjackDemo {
    public static void main(String[] args) {

        //Testing building of deck
        DeckGenerator generator = new DeckGenerator();
        Player player = new Player();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();

        generator.showAllCardsInDeck(deckOfCards);
        System.out.println(" ");
        System.out.println(" ");
        player.createPlayerHand(deckOfCards);
        System.out.println(" ");
        player.printPlayersHand();
        System.out.println(" ");
        player.drawACard(deckOfCards);
        System.out.println(" ");
        player.printPlayersHand();
        System.out.println(" ");
        player.drawACard(deckOfCards);
        System.out.println(" ");
        player.printPlayersHand();


    }
}

