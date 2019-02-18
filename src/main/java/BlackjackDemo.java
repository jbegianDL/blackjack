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
        player.showHand();
        System.out.println(" ");
        dealer.showDealerStartCard();
        System.out.println(" ");

        player.drawACard(deckOfCards);
        player.showHand();
        System.out.println(" ");
        dealer.showDealerStartCard();
        System.out.println(" ");

        player.drawACard(deckOfCards);
        player.showHand();
        System.out.println(" ");
        dealer.showDealerStartCard();




    }
}

