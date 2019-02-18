import java.util.ArrayList;

public class BlackjackDemo {
    public static void main(String[] args) {

        //Testing building of deck
        DeckGenerator generator = new DeckGenerator();
        Player player = new Player();
        Dealer dealer = new Dealer();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();

        generator.showAllCardsInDeck(deckOfCards);
        System.out.println(" ");
        System.out.println(" ");
        dealer.createHand(deckOfCards);
        player.createHand(deckOfCards);

        System.out.println(" ");
        player.printHand();
        System.out.println(" ");
        dealer.printHand();
        System.out.println(" ");

        player.drawACard(deckOfCards);
        player.printHand();
        System.out.println(" ");
        dealer.drawACard(deckOfCards);
        dealer.printHand();
        System.out.println(" ");

        player.drawACard(deckOfCards);
        player.printHand();
        System.out.println(" ");
        dealer.drawACard(deckOfCards);
        dealer.printHand();

        System.out.println(deckOfCards.size());




    }
}

