

package ca.sheridancollege.blackjack;

/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class PlayingCard extends Card {
    
     private Value value;
     private Suit suit;
     
 public PlayingCard(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
 
     public Value getValue() {
        return this.value;
    }

   

    public Suit getSuit() {
        return this.suit;
    }

   

    @Override
    public String toString() {
       return   getValue()+ " " + getSuit();
    }

}
