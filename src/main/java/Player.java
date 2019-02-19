import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Card> playersCardHand;

    public void createHand(ArrayList<Card> deckOfCards) {
        playersCardHand = new ArrayList<>();
        for (int count = 0; count <= 1; count++) {
            drawACard(deckOfCards);
        }
        checkForAce(playersCardHand);
    }

    public boolean checkForOver21(ArrayList<Card> playersCardHand) {
        int playersTotalHand = totalOFHand(playersCardHand);
        boolean under21 = true;
        if (playersTotalHand > 21) {
            under21 = false;
        }
        return under21;
    }

    public void checkForAce(ArrayList<Card> playersCardHand) {
        int numericValue = 0;
        int cardAtEndOfHand = playersCardHand.size() - 1;

            if (playersCardHand.get(cardAtEndOfHand).getRank().equalsIgnoreCase("Ace")) {
                System.out.println("Would You like this value be [1] or [11]: ");
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
        }


    public int totalOFHand(ArrayList<Card> playersCardHand) {
        int sum = 0;
        for (Card card : playersCardHand) {
            sum += card.getNumericValue();
        }
        return sum;
    }

    public void drawACard(ArrayList<Card> deckOfCards) {
        Card drawnCard = deckOfCards.remove(0);
        playersCardHand.add(drawnCard);
        System.out.println("You hand total is " + totalOFHand(playersCardHand));
        checkForAce(playersCardHand);

    }

    public void showHand() {
        for (Card card : playersCardHand) {
            card.printDetails();
        }
    }

    public ArrayList<Card> getPlayersCardHand() {
        return playersCardHand;
    }
}
