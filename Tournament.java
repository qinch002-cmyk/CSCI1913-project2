public class Tournament {
    public static void main(String[] args) {
        AI[] ais = new AI[3];
        ais[0] = new AI();
        ais[1] = new SmallestCardAI();
        ais[2] = new BiggestCardAI();

        for (int i = 0; i < ais.length; i++) {
            for (int j = 0; j < ais.length; j++) {
                CardGameMatch match = new CardGameMatch(ais[i], ais[j]);
                double winRate = match.winRate(1000);
                System.out.println(ais[i] + " vs. " + ais[j] + " winRate: " + winRate);
            }
        }
    }
}
