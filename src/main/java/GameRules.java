public class GameRules {

    private Card card;
    private Player player;
    private Dealer dealer;
    private int gameOutcome;

    public int checkForWinner(int playerTotal, int dealerTotal) {
        if (playerTotal > dealerTotal && playerTotal <= 21) {
            gameOutcome = 1;
        } else if (playerTotal > 21) {
            gameOutcome = 2;
        } else if (dealerTotal > playerTotal && dealerTotal <= 21) {
            gameOutcome = 3;
        } else if (dealerTotal == playerTotal) {
            gameOutcome = 4;
        }


        switch (gameOutcome) {
            case 1:
                System.out.println("You won!!!!!!!!!!\n\n ᕕ༼⌐■-■༽ᕗ");
                break;
            case 2:
                System.out.println("You've gone over 21. BUST!\n\n(╯'□')╯︵ ┻━┻");
                break;
            case 3:
                System.out.println("Dealer won.\n\n(╯'□')╯︵ ┻━┻");
                break;
            case 4:
                System.out.println("Push.\n\nt(-_-t)");
                break;
        }
        return gameOutcome;
    }

}
