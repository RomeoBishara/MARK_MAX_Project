/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Romeo Al Bishara
 */
public class CardsDeck {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
   
    

    public CardsDeck() {
        // construct a new deck with 52 cards
           cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                Card card = new PlayingCard(value, suit);
                cards.add(card);
            }
        }
        shuffle();
        
    }

    public Card sendCard() {
        Card sendCard = cards.get(0);
        removeCard(sendCard);
        return sendCard;
    }
   
     private void shuffle() {
        Collections.shuffle(cards);
    }
    
    
    
    private void removeCard(Card card) {
      cards.remove(card);
    }
    
    

    

}//end class
