import java.util.ArrayList;

public class Player {

        private ArrayList<Card> playersCardHand;

        public void createPlayerHand(ArrayList<Card> deckOfCards){
            playersCardHand = new ArrayList<>();
            for(int count = 0; count <= 1; count++){
                drawACard(deckOfCards);
            }
        }

        public void drawACard(ArrayList<Card> deckOfCards){
            Card drawnCard = deckOfCards.remove(0);
            playersCardHand.add(drawnCard);
        }

        public void printPlayersHand(){
            for(Card card : playersCardHand){
                card.printDetails();
            }
        }
}
