public class CardGameMatch {
    private AI ai1;
    private AI ai2;

    public CardGameMatch(AI ai1, AI ai2) {
        this.ai1 = ai1;
        this.ai2 = ai2;
    }

    public boolean playGame() {
        Deck deck = new Deck();
        Hand hand1 = new Hand(deck, 5);
        Hand hand2 = new Hand(deck, 5);
        int score1 = 0;
        int score2 = 0;
        boolean ai1StartsRound = true;

        while (score1 < 10 && score2 < 10) {
            boolean ai1WonRound = playRound(deck, hand1, hand2, ai1StartsRound);

            if (ai1WonRound) {
                score1++;
                ai1StartsRound = true;
            } else {
                score2++;
                ai1StartsRound = false;
            }
        }

        return score1 >= 10;
    }

    private boolean playRound(Deck deck, Hand hand1, Hand hand2, boolean ai1StartsRound) {
        CardPile pile = new CardPile(deck.draw());
        boolean ai1Turn = ai1StartsRound;

        while (true) {
            if (ai1Turn) {
                Card choice = this.ai1.getPlay(hand1, pile);
                if (choice == null || !isLegalChoice(choice, hand1, pile)) {
                    return false;
                }
                hand1.remove(choice);
                pile.playCard(choice);
                ai1Turn = false;
            } else {
                Card choice = this.ai2.getPlay(hand2, pile);
                if (choice == null || !isLegalChoice(choice, hand2, pile)) {
                    return true;
                }
                hand2.remove(choice);
                pile.playCard(choice);
                ai1Turn = true;
            }
        }
    }

    private boolean isLegalChoice(Card choice, Hand hand, CardPile pile) {
        if (choice == null) {
            return false;
        }

        boolean foundInHand = false;
        for (int i = 0; i < hand.getSize(); i++) {
            if (hand.get(i).equals(choice)) {
                foundInHand = true;
            }
        }

        if (!foundInHand) {
            return false;
        }

        Card topCard = pile.getTopCard();
        return choice.getSuitNum() == topCard.getSuitNum()
                || choice.getRankNum() >= topCard.getRankNum();
    }

    public double winRate(int nTrials) {
        int wins = 0;

        for (int i = 0; i < nTrials; i++) {
            if (this.playGame()) {
                wins++;
            }
        }

        return (double) wins / nTrials;
    }
}
