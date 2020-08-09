

package ca.sheridancollege.blackjack;


import java.util.ArrayList;

/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class Hand {

     
     private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
     
    public void addCard(Card card) {
       hand.add(card);
      
    }
    

     
     /**
      * To remove last card and added to new hand in case of split
      * @param card
      */
    public void removeCard(Card card) {
        hand.remove(card);
    }
    public void clearHand() {
        hand.clear();
    }
     private boolean isAce() {
         boolean result = false;
            return result;
        }
     
    public int sum() {
        int sum = 0;
//        if (card.value == Value.ACE && sum > 21) {
       
        return sum;
    }
        
    @Override
    public String toString() {
       String onHand = "";
       for (Card card : hand) {
           onHand += card.toString() + "\n";
       }
       return onHand;
    }
        
}
