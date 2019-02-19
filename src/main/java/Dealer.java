import java.util.ArrayList;

public class Dealer extends Player {
    private ArrayList<Card> dealerCardHand;

    @Override
    public void createHand(ArrayList<Card> deckOfCards){
        dealerCardHand = new ArrayList<>();
        for(int count = 0; count <= 1; count++){
            drawACard(deckOfCards);
        }
    }

    @Override
    public void drawACard(ArrayList<Card> deckOfCards){
        Card drawnCard = deckOfCards.remove(0);
        dealerCardHand.add(drawnCard);
        System.out.println("You hand total is " + totalOFHand(dealerCardHand));

    }

    @Override
    public void showHand(){
        for(Card card : dealerCardHand){
            card.printDetails();
        }
    }

    public void showDealerStartCard(){
        dealerCardHand.get(0).printDetails();
    }
}
