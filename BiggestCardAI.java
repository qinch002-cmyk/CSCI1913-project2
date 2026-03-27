public class BiggestCardAI extends AI {
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card bestCard = null;

        for (int i = 0; i < hand.getSize(); i++) {
            Card card = hand.get(i);
            if (isValidPlay(card, cardPile)) {
                if (bestCard == null || card.getRankNum() > bestCard.getRankNum()) {
                    bestCard = card;
                }
            }
        }
        return bestCard;
    }
    public String toString() {
        return "Biggest Card AI";
    }
}
