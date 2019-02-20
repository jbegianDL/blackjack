import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Card> playersCardHand;

    public void createHand(ArrayList<Card> deckOfCards) {
//        System.out.println("\n_____-----Player's Hand-----_____");
        playersCardHand = new ArrayList<>();
        for (int count = 0; count <= 1; count++) {
            drawACard(deckOfCards);
        }
        checkForAce(playersCardHand);
    }

    public boolean checkForOver21(ArrayList<Card> playersCardHand) {
        int playersTotalHand = totalOfHand(playersCardHand);
        boolean under21 = true;
        if (playersTotalHand > 21) {
            under21 = false;
        }
        return under21;
    }

    public int checkForAce(ArrayList<Card> playersCardHand) {
        int numericValue = 1;
        int cardAtEndOfHand = playersCardHand.size() - 1;

            if (playersCardHand.get(cardAtEndOfHand).getRank().equalsIgnoreCase("Ace")) {
                System.out.println("You got an Ace.\n" +
                        "Would you like this card's value to be a [1] or [11]: ");
                String userInput = scanner.nextLine();
                switch (userInput) {

                    case "1":
                        numericValue = 1;
                        playersCardHand.get(cardAtEndOfHand).setNumericValue(numericValue);
                        System.out.println("You set Ace to value of 1 ");
                        break;

                    case "11":
                        numericValue = 11;
                        playersCardHand.get(cardAtEndOfHand).setNumericValue(numericValue);
                        System.out.println("You set Ace to value of 11 ");
                        break;

                    default:
                        System.out.println("Your selection was wrong!");
                }
            }
            return numericValue;
        }


    public int totalOfHand(ArrayList<Card> handOfCards) {
        int sum = 0;
        for (Card card : handOfCards) {
            sum += card.getNumericValue();
        }
        return sum;
    }

    public void drawACard(ArrayList<Card> deckOfCards) {
        Card drawnCard = deckOfCards.remove(0);
        playersCardHand.add(drawnCard);
        checkForAce(playersCardHand);

    }

    public void showHand() {
        System.out.println("\n_____-----Player's Hand-----_____");
        for (Card card : playersCardHand) {
            card.printDetails();
        }
    }

    public ArrayList<Card> getPlayersCardHand() {
        return playersCardHand;
    }
}
