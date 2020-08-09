

package ca.sheridancollege.blackjack;



/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class BlackjackGame extends Game{
    
  private BlackJackDealer dealer;
  private BlackJackPlayer player;
  
    public BlackjackGame(String name) {
        super("Blacjack");
    }
public String displayInfo() {
    String instructions = "";
    return instructions;
}
private boolean isBust(){
       boolean result = false;
    return result;
   }

    @Override
    public void play() {
         dealer = new BlackJackDealer();
         player = new BlackJackPlayer();
        
       
        
        
        Hand dealerHand = dealer.getHand();
        Hand playerHand = player.getHand();
        
        CardsDeck deck = dealer.getDeck();
        
        playerHand.addCard(deck.sendCard());
        playerHand.addCard(deck.sendCard());
        
        playerHand.addCard(deck.sendCard());
        
        //loop to player play() method if not stand or bust
        player.play();
        //done with player play loop
        
         // start dealer turn;
        dealer.play();
        
        //exit or loop to new round
        
        
    }

    @Override
    public void declareWinner() {
        
    }

}
