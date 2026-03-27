public class CardPile {
    private Card topCard;

    public CardPile(Card firstCard) {
        if (firstCard == null) {
            this.topCard = new Card(1, 1);
        } else {this.topCard = firstCard;}
    }
    public Card getTopCard() {
        return this.topCard;
    }
    public void playCard(Card card) {
        if (card != null) {
            this.topCard = card;
        }
    }
}
