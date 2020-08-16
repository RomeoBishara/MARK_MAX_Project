

package ca.sheridancollege.blackjack;

/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class BlackJackDealer extends Player {
    
    
    private Hand hand;
    private CardsDeck deck; 
    private static BlackJackDealer dealer = new BlackJackDealer();

    private BlackJackDealer() {
        this("Dealer");
       
    }

    private BlackJackDealer(String name) {
        super(name);
        hand = new Hand();
    }

   public static BlackJackDealer getDealer() {
       return dealer;
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
