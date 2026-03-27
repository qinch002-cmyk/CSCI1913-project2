Project 2

Game Name:
Match or Climb

Game Idea:
This is a two-player card game played with one standard 52-card deck.
The main idea is that players take turns playing onto one shared center card.
A card is playable if it matches the suit of the current center card or if its rank is greater than or equal to the rank of the current center card.
If a player cannot play a valid card on their turn, that player loses the round.

This game was created for this project.

Cards and Deck:
The game uses a standard deck of 52 cards.
Ranks are Ace through King.
Suits are Spades, Hearts, Clubs, and Diamonds.
Only one deck is used at a time.
If the deck becomes empty, a new 52-card deck is automatically created and shuffled.
This follows the project instructions and makes sure players can always draw replacement cards.

Starting the Game:
At the start of the match, a new shuffled deck is created.
Each player is dealt a hand of 5 cards from the same deck.
Player 1 goes first in the first round.
Both players begin the match with 0 points.

How a Round Starts:
At the beginning of each round, one card is drawn from the deck and placed in the center.
This card becomes the starting center card for that round.
The center card is shared by both players.

Turn Order:
Players take turns one at a time.
The player who starts the first round is Player 1.
After that, the winner of the previous round starts the next round.

What a Player Does on a Turn:
On a turn, the player looks at the current center card and chooses one card from their hand to play.
A card is legal if:
1. it has the same suit as the center card, or
2. its rank number is greater than or equal to the rank number of the center card.

For example, if the center card is 7 of Hearts, then any Heart can be played, and any card with rank 7 or higher can also be played.

After a legal card is played:
1. that card becomes the new center card,
2. the card is removed from the player's hand,
3. the player immediately draws one replacement card from the deck.

Because of this, both players always keep 5 cards in their hands during the game.

What Happens if a Player Cannot Play:
If a player has no legal card in their hand, that player cannot make a move and immediately loses the round.
The other player wins the round and gets 1 point.

How a Round Ends:
A round ends as soon as one player cannot make a legal play.
The center card from that round is discarded and is not kept between rounds.
Players keep their hands between rounds.
Since players draw replacement cards each time they play, their hands are already full when the next round starts.

How the Match Continues:
Rounds are played back-to-back until one player reaches 10 points.
The player who won the previous round goes first in the next round.

How the Game is Won:
The first player to win 10 rounds wins the whole match.

Why This Game Works Well for the AI Part:
This game has a clear definition of a valid move.
That makes it easy to compare different AI strategies.
The basic AI can choose the first legal card it sees.
The SmallestCardAI can choose the legal card with the smallest rank.
The BiggestCardAI can choose the legal card with the biggest rank.
Since the center card keeps changing, these different choices can lead to different results over many simulated games.

AI / Outside Help Statement:
I used Gen AI to help brainstorm an original card game idea and to help rewrite the game rules in a clear way for this README.
I am responsible for choosing the final rules and for implementing the Java code myself.
