public class GameRules {

    private Card card;
    private Player player;
    private Dealer dealer;
    private boolean gameOutcome;

    public void checkForWinner(int playerTotal, int dealerTotal){
        if (playerTotal > dealerTotal && playerTotal <= 21  || dealerTotal > 21){
            gameOutcome = true;
        } else if (playerTotal > 21){
            gameOutcome = false;
        }

        if (gameOutcome){
            System.out.println("You won!!!!!!!!!!\n\n ᕕ༼⌐■-■༽ᕗ");
        } else {
            System.out.println("Dealer won.\n\n(╯'□')╯︵ ┻━┻");
        }
    }



}
