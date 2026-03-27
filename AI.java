public class AI {
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            Card card = hand.get(i);
            if (isValidPlay(card, cardPile)) {
                return card;
            }
        }
        return null;
    }
    protected boolean isValidPlay(Card card, CardPile cardPile) {
        if (card == null || cardPile == null || cardPile.getTopCard() == null) {
            return false;
        }
        Card topCard = cardPile.getTopCard();
        return card.getSuitNum() == topCard.getSuitNum()
                || card.getRankNum() >= topCard.getRankNum();
    }
    public String toString() {
        return "Random Card AI";
    }
}
