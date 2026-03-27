public class Card {
    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        if (rank < 1 || rank > 13 || suit < 1 || suit > 4) {
            System.out.println("Invalid Card");
            this.rank = 1;
            this.suit = 1;
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }
    public int getRankNum() {
        return this.rank;
    }
    public String getRankName() {
        if (this.rank == 1) {return "Ace";}
        if (this.rank == 2) {return "Two";}
        if (this.rank == 3) {return "Three";}
        if (this.rank == 4) {return "Four";}
        if (this.rank == 5) {return "Five";}
        if (this.rank == 6) {return "Six";}
        if (this.rank == 7) {return "Seven";}
        if (this.rank == 8) {return "Eight";}
        if (this.rank == 9) {return "Nine";}
        if (this.rank == 10) {return "Ten";}
        if (this.rank == 11) {return "Jack";}
        if (this.rank == 12) {return "Queen";}
        return "King";
    }
    public String getSuitName() {
        if (this.suit == 1) {
            return "Spades";
        }
        if (this.suit == 2) {
            return "Hearts";
        }
        if (this.suit == 3) {return "Clubs";}
        return "Diamonds";}
    public int getSuitNum() {
        return this.suit;
    }
    public String toString() {
        return this.getRankName() + " of " + this.getSuitName();
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {return false;}
        Card other = (Card) obj;
        return this.rank == other.rank && this.suit == other.suit;
    }
}
