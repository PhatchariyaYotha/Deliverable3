/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    private final Rank rank;
    private final Suit suit;
    
    public Card(Rank rank, Suit suit){
        this.rank=rank;
        this.suit= suit;
       
    }
    
    public Rank getRank(){
        return rank;
    }
    
    public Suit getSuit(){
        return suit;
    }
    
    @Override
    public String toString(){
        return rank + "of" +suit;
    }
    
    public Card playCard() {
        // In the War card game, a player plays the top card from their hand
        return (Card) getHand(0);
    }

    private Object getHand(int par) {
        return null;
    }
    
    public enum Rank{
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);
        
        private final int value;
        
        Rank(int value){
        this.value=value;

    }
        public int getValue(){
            return value;
        }
}

        public enum Suit{
            CLUBS,
            DIAMONDS,
            HEARTS,
            SPADES,
        }
}