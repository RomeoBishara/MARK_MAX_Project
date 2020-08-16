

package ca.sheridancollege.blackjack;

/**
 *This class....
 *
 * @author Romeo Al Bishara
 */
public class BlackJackPlayer extends Player {

   private int age;
   private Hand hand;
   
    public BlackJackPlayer(int age, String name) {
        super(name);
        this.age = age;
        this.hand = new Hand();
    }

    public void setAge(int age) {
        this.age = age;
    }
   
   
   private boolean isSplit(){
       boolean result = false;
    return result;
   }
   
   
    public Hand getHand() {
        return hand;
    }

    @Override
    public void play() {
        
    }
    

}
