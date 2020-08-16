package ca.sheridancollege.blackjack;

import java.util.ArrayList;

/**
 * This class....
 *
 * @author Romeo Al Bishara
 */
public class Hand {

    private ArrayList<PlayingCard> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void addCard(PlayingCard card) {
        hand.add(card);

    }
    
    public boolean isSplit() {
        return hand.get(0).getValue() == hand.get(1).getValue();
    }

    /**
     * To remove last card and added to new hand in case of split
     *
     * @param card
     */
    public void removeCard(PlayingCard card) {
        hand.remove(card);
    }

    public void clearHand() {
        hand.clear();
    }
    

    private boolean isAce(PlayingCard card) {
        return  card.getValue() == Value.ACE;
    }

    public int sum() {
        int sum = 0;
        for (PlayingCard card : hand) {
            if (isAce(card) && !(card.getValue().getSecondValue() + sum > 21)) {
                sum += card.getValue().getSecondValue();

            } else {
                sum += card.getValue().getCardValue();

            }
        }

        return sum;
    }
    
    public boolean isBust() {
        return sum() > 21;
    }
    
    @Override
    public String toString() {
        String onHand = "";
        for (PlayingCard card : hand) {
            onHand += card.toString() + "\n";
        }
        return onHand;
    }

}
