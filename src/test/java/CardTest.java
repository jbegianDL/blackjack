import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CardTest {

    private Card testCard1;
    private Card testCard2;
    private Card testCard3;


    @Before
    public void create(){
        testCard1 = new Card("Hearts", "5");
        testCard2 = new Card("Spade", "King");
        testCard3 = new Card("Diamond", "Ace");
    }

    @Test
    public void createNumericValue() {

        //Act
        int result1 = testCard1.createNumericValue(testCard1.getRank());
        int result2 = testCard2.createNumericValue(testCard2.getRank());
        int result3 = testCard3.createNumericValue(testCard3.getRank());

        //Assert
        assertThat(result1, equalTo(5));
        assertThat(result2, equalTo(10));
        assertThat(result3, equalTo(1));

    }
}