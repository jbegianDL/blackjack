public class Card {

    private String suit;
    private String rank;
    private int numericValue;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.numericValue = createNumericValue(this.rank);
    }

    public int createNumericValue(String rank){
        if (rank.equalsIgnoreCase("2")) {
            numericValue = 2;
        } else if (rank.equalsIgnoreCase("3")) {
            numericValue = 3;
        } else if (rank.equalsIgnoreCase("4")) {
            numericValue = 4;
        } else if (rank.equalsIgnoreCase("5")) {
            numericValue = 5;
        } else if (rank.equalsIgnoreCase("6")) {
            numericValue = 6;
        } else if (rank.equalsIgnoreCase("7")) {
            numericValue = 7;
        } else if (rank.equalsIgnoreCase("8")) {
            numericValue = 8;
        } else if (rank.equalsIgnoreCase("9")) {
            numericValue = 9;
        } else if (rank.equalsIgnoreCase("10")) {
            numericValue = 10;
        } else if (rank.equalsIgnoreCase("Jack")) {
            numericValue = 10;
        } else if (rank.equalsIgnoreCase("Queen")) {
            numericValue = 10;
        } else if (rank.equalsIgnoreCase("King")) {
            numericValue = 10;
        }
        return  numericValue;
    }


    public void printDetails(){
        System.out.println(this.rank + " of " + this.suit);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }
}
