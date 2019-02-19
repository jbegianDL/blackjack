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

//        generator.showAllCardsInDeck(deckOfCards);  <--- shows all cards in deck created

        welcomeMenu();

        player.createHand(deckOfCards);


        player.showHand();

        System.out.println("\n");

        askForAnotherCard(deckOfCards, player, scanner);


    }

    public static void welcomeMenu(){
        System.out.println("\n\n-------Welcome to Detroit Labs Casino-------\n _     _            _    _            _    \n" +
                "| |   | |          | |  (_)          | |   \n" +
                "| |__ | | __ _  ___| | ___  __ _  ___| | __\n" +
                "| '_ \\| |/ _` |/ __| |/ / |/ _` |/ __| |/ /\n" +
                "| |_) | | (_| | (__|   <| | (_| | (__|   < \n" +
                "|_.__/|_|\\__,_|\\___|_|\\_\\ |\\__,_|\\___|_|\\_\\\n" +
                "                       _/ |                \n" +
                "                      |__/                 \n--------------------------------------------");
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
                   // repeat = player.checkForOver21(player.getPlayersCardHand());
                    break;
                case "2":
                    //TODO total hand
                    repeat = false;
                    break;
            }

        } while (repeat);

    }
}

