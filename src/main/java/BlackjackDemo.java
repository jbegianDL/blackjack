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
        GameRules gameRules = new GameRules();

//        generator.showAllCardsInDeck(deckOfCards);

        welcomeMenu();

        player.createHand(deckOfCards);


        player.showHand();

        System.out.println("\n");

        dealer.createHand(deckOfCards);
//        dealer.showHand();
//        dealer.drawACard(deckOfCards);





        askForAnotherCard(deckOfCards, player, dealer, scanner, gameRules);


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

    public static void askForAnotherCard(ArrayList<Card> deckOfCards, Player player, Dealer dealer, Scanner scanner, GameRules gameRules) {
        boolean repeat = true;
        int totalOfHand = 0;
        int totalOfDealerHand = 0;

        do {
            System.out.println("Please enter a number \n" +
                    "1 - Hit \n" +
                    "2 - Stand\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    player.drawACard(deckOfCards);
                    player.showHand();
                    repeat = player.checkForOver21(player.getPlayersCardHand());
                    break;
                case "2":
                    repeat = false;
                    break;
            }

        } while (repeat);
        totalOfHand = player.totalOfHand(player.getPlayersCardHand());

        totalOfDealerHand = dealer.totalOfHand(dealer.getDealerCardHand());

        System.out.println("Player total hand is:  " + totalOfHand + "\nDealer total hand is:  " + totalOfDealerHand);

        gameRules.checkForWinner(totalOfHand, totalOfDealerHand);
    }
}

