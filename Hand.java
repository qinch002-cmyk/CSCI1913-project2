public class Hand {
    private Card[] cards;
    private Deck deck;

    public Hand(Deck deck, int size) {
        this.deck = deck;
        this.cards = new Card[size];

        for (int i = 0; i < this.cards.length; i++) {
            this.cards[i] = this.deck.draw();
        }
    }

    public int getSize() {
        return this.cards.length;
    }

    public Card get(int i) {
        if (i < 0 || i >= this.cards.length) {
            System.out.println("Invalid hand index!");
            return this.cards[0];
        }

        return this.cards[i];
    }

    public boolean remove(Card card) {
        if (card == null) {
            return false;
        }

        for (int i = 0; i < this.cards.length; i++) {
            if (this.cards[i].equals(card)) {
                this.cards[i] = this.deck.draw();
                return true;
            }
        }

        return false;
    }
}
