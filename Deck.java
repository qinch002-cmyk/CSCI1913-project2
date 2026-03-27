import java.util.Random;

public class Deck {
    private Card[] cards;
    private int nextCard;
    private Random random;
    public Deck() {
        this.cards = new Card[52];
        this.random = new Random();

        int index = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
        this.nextCard = 0;
        this.shuffle();
    }
    public void shuffle() {
        for (int i = this.cards.length - 1; i >= 1; i--) {
            int j = this.random.nextInt(i + 1);
            Card temp = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;}this.nextCard = 0;}
    public Card draw() {
        if (this.isEmpty()) {this.shuffle();}
        Card drawn = this.cards[this.nextCard];
        this.nextCard++;
        return drawn;
    }
    public int cardsRemaining() {
        return this.cards.length - this.nextCard;
    }
    public boolean isEmpty() {
        return this.nextCard >= this.cards.length;
    }
}
