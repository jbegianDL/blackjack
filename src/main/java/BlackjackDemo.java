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
        boolean keepRunning = false;

        do {
            welcomeMenu();

            dealer.createHand(deckOfCards);

            dealer.showDealerStartCard();
            player.createHand(deckOfCards);

            player.showHand();

            askForAnotherCard(deckOfCards, player, dealer, scanner, gameRules);

            System.out.println("\nWould you like to play again? \n[1] for YES\n[2] for NO");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                keepRunning = true;
            }else if(userInput == 2){
                keepRunning = false;
            }

        } while (keepRunning);
        System.out.println("Goodbye...\n" +
                "Thanks for playing!!");
    }

    public static void welcomeMenu() {
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
            System.out.println("\nYour hand total is currently " + player.totalOfHand(player.getPlayersCardHand()) +
                    "\n\nPlease enter a number: \n" +
                    "[1] to Hit \n" +
                    "[2] to Stand\n");

            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    player.drawACard(deckOfCards);
                    player.showHand();
                    repeat = player.checkForOver21(player.getPlayersCardHand());
                    break;
                case 2:
                    repeat = false;
                    break;
            }

        } while (repeat);
        totalOfHand = player.totalOfHand(player.getPlayersCardHand());

        totalOfDealerHand = dealer.totalOfHand(dealer.getDealerCardHand());

        System.out.println("Player total hand is:  " + totalOfHand);
        System.out.println("\n_____-----Dealer's Hand-----_____");
        dealer.showHand();
        System.out.println("---------------------------------");
        System.out.println("\nDealer total hand is:  " + totalOfDealerHand);

        gameRules.checkForWinner(totalOfHand, totalOfDealerHand);
    }
}

