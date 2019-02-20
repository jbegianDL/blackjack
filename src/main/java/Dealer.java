import java.util.ArrayList;

public class Dealer extends Player {
    private ArrayList<Card> dealerCardHand;

    @Override
    public void createHand(ArrayList<Card> deckOfCards) {
        dealerCardHand = new ArrayList<>();
        for (int count = 0; count <= 1; count++) {
            drawACard(deckOfCards);
        }
    }

    @Override
    public void drawACard(ArrayList<Card> deckOfCards) {
        Card drawnCard = deckOfCards.remove(0);
        dealerCardHand.add(drawnCard);
        System.out.println("You hand total is " + totalOFHand(dealerCardHand));
        checkForAce(dealerCardHand);
    }

    @Override
    public void showHand() {
        for (Card card : dealerCardHand) {
            card.printDetails();
        }
    }

    public void showDealerStartCard() {
        dealerCardHand.get(0).printDetails();
    }

    @Override
    public int checkForAce(ArrayList<Card> dealerCardHand) {
        int numericValue = 1;
        int cardAtEndOfHand = dealerCardHand.size() - 1;
        int dealerHandPlus11 = totalOFHand(dealerCardHand) + 11;

        if (dealerCardHand.get(cardAtEndOfHand).getRank().equalsIgnoreCase("Ace")) {
            if (dealerHandPlus11 >= 17 && dealerHandPlus11 <= 21) {
                numericValue = 11;
                dealerCardHand.get(cardAtEndOfHand).setNumericValue(numericValue);
            }
            System.out.println("You set Ace to value of: " + numericValue);

        }
        return numericValue;
    }
}
