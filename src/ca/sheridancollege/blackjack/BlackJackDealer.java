

package ca.sheridancollege.blackjack;

/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class BlackJackDealer extends Player {
    
    
    private Hand hand;
    private CardsDeck deck; 
    

    public BlackJackDealer() {
        this("Dealer");
       
    }

    private BlackJackDealer(String name) {
        super(name);
        hand = new Hand();
    }

   

    public CardsDeck getDeck() {
         deck = new CardsDeck();
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        
    }
   

}
