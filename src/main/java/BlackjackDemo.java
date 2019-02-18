import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Testing building of deck
        DeckGenerator generator = new DeckGenerator();
        Player player = new Player();
        Dealer dealer = new Dealer();
        ArrayList<Card> deckOfCards = generator.makeADeckOfCards();

//        generator.showAllCardsInDeck(deckOfCards);

        player.createHand(deckOfCards);


        player.showHand();

        System.out.println("\n");

        askForAnotherCard(deckOfCards, player, scanner);


    }

    public static void askForAnotherCard(ArrayList<Card> deckOfCards, Player player, Scanner scanner) {
        boolean repeat = true;

        do {
            System.out.println("Please enter a number \n" +
                    "1 - Hit \n" +
                    "2 - Stand\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    player.drawACard(deckOfCards);
                    player.showHand();
                    break;
                case "2":
                    //TODO total hand
                    repeat = false;
                    break;
            }

        } while (repeat);

    }
}

