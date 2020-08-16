

package ca.sheridancollege.blackjack;

import java.util.ArrayList;

/**
 *This class is the player class 
 *
 * @author Romeo Al Bishara
 */
public class BlackJackPlayer extends Player {

   private int age;
   private Hand hand;
   private ArrayList<Hand> splitHand = new ArrayList();
   private static int credit = 100;
   private int playerBet;
   
    public BlackJackPlayer(int age, String name) {
        super(name);
        setAge(age);
        hand = new Hand();
    }

    public void setAge(int age) {
        if (age >= 19 ) {
        this.age = age;
    } else {
            throw new IllegalArgumentException("You are a minor");
           
        }
    } 

    public int getCredit() {
        return credit;
    }

    public void setCredit(int bet, boolean isWinner) {
        if (isWinner) {
            credit += bet;
        } else {
            credit -= bet;
        }
    }

    public void setPlayerBet(int playerBet) {
        this.playerBet = playerBet;
    }

    public int getPlayerBet() {
        return playerBet;
    }
   
    
    
   public void chooseSplit (PlayingCard card) {
       Hand secondHand = new Hand();
       hand.removeCard(card);
       secondHand.addCard(card);
       splitHand.add(secondHand);
   }
   
    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        
    }
    

}
