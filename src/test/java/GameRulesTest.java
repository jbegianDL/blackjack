import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GameRulesTest {

    private int playerScore1;
    private int playerScore2;
    private int playerScore3;
    private int playerScore4;

    private int dealerScore1;
    private int dealerScore2;
    private int dealerScore3;
    private int dealerScore4;

    private GameRules gameRules = new GameRules();

    @Before
    public void create(){

        playerScore1 = 20;
        dealerScore1 = 18;

        playerScore2 = 15;
        dealerScore2 = 20;

        playerScore3 = 10;
        dealerScore3 = 10;

        playerScore4 = 24;
        dealerScore4 = 20;

    }

    @Test
    public void checkForWinner() {

        //Act
        int result1 = gameRules.checkForWinner(playerScore1, dealerScore1);
        int result2 = gameRules.checkForWinner(playerScore2, dealerScore2);
        int result3 = gameRules.checkForWinner(playerScore3, playerScore3);
        int result4 = gameRules.checkForWinner(playerScore4, playerScore4);

        //Assert
        assertThat(result1, equalTo(1));
        assertThat(result2, equalTo(3));
        assertThat(result3, equalTo(4));
        assertThat(result4, equalTo(2));

    }
}