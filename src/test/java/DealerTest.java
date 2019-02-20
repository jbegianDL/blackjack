import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class DealerTest {

    private Card testCard1;
    private Card testCard2;
    private Card testCard3;

    private Card testCard4;
    private Card testCard5;
    private Card testCard6;

    private ArrayList<Card> dealerHand1 = new ArrayList<>();
    private ArrayList<Card> dealerHand2 = new ArrayList<>();

    private Dealer dealer = new Dealer();


    @Before
    public void create() {
        testCard1 = new Card("Hearts", "5");
        testCard2 = new Card("Spade", "5");
        testCard3 = new Card("Diamond", "Ace");

        dealerHand1.add(testCard1);
        dealerHand1.add(testCard2);
        dealerHand1.add(testCard3);

        testCard4 = new Card("Hearts", "8");
        testCard5 = new Card("Spade", "9");
        testCard6 = new Card("Diamond", "Ace");

        dealerHand2.add(testCard4);
        dealerHand2.add(testCard5);
        dealerHand2.add(testCard6);
    }


    @Test
    public void checkForAce() {

        //Act
        int result1 = dealer.checkForAce(dealerHand1);
        int result2 = dealer.checkForAce(dealerHand2);

        //Assert
        assertThat(result1, equalTo(11));
        assertThat(result2, equalTo(1));



    }
}