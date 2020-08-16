package ca.sheridancollege.blackjack;

import java.util.Scanner;

/**
 * This class....
 *
 * @author Romeo Al Bishara
 */
public class BlackjackGame extends Game {

    private BlackJackDealer dealer;
    private BlackJackPlayer player;
    private final int[] bet = {5, 10, 15, 20};
    private boolean playing = true;
    boolean isWinner = true;

    public BlackjackGame() {
        super("Blacjack");
    }

    public String displayInfo() {
        String instructions = "";
        return instructions;
    }

    private boolean isBust() {
        boolean result = false;
        return result;
    }

    @Override
    public void play() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BlackJack \nPlease enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your age:");
        int age = input.nextInt();

        try {
            player = new BlackJackPlayer(age, name);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }

        dealer = BlackJackDealer.getDealer();

        while (playing) {
            player.getHand().clearHand();
            dealer.getHand().clearHand();
            CardsDeck deck = dealer.getDeck();

            System.out.printf("\n%s! You have $%d Plaese place a bet 0r enter 0 to exit\n", name, player.getCredit());
            for (int i = 1; i <= bet.length; i++) {
                System.out.println(i + ": $" + bet[i - 1]);
            }
            int placeBet = input.nextInt();
            if (placeBet == 0) {
                System.exit(0);
            }
            player.setPlayerBet(bet[placeBet - 1]);

            player.getHand().addCard((PlayingCard) deck.sendCard());
            player.getHand().addCard((PlayingCard) deck.sendCard());

            if (player.getHand().sum() == 21) {
                System.out.println("Blackjack !!!!!!");
                declareWinner("player");
                continue;
            }

            dealer.getHand().addCard((PlayingCard) deck.sendCard());

            System.out.println("In your Hand: \n" + player.getHand() + "\nHand Total is:" + player.getHand().sum());
            System.out.println("\nIn the Dealer Hand: \n" + dealer.getHand() + "*********");

            boolean hasWinner = false;
            boolean isStand = false;
            while (!isStand && !player.getHand().isBust()) {
                System.out.printf("1: %s 2: %s 3: %s\n", Menu.STAND, Menu.HIT, Menu.EXIT);

                int enter = input.nextInt();
                if (enter == 1) {
                    isStand = true;
                } else if (enter == 2) {
                    player.getHand().addCard((PlayingCard) deck.sendCard());
                    System.out.println("In your Hand: \n" + player.getHand()
                            + "\nHand Total is: " + player.getHand().sum()
                            + "\nYour bet is: $" + player.getPlayerBet());
                    if (player.getHand().sum() == 21) {
               
                        declareWinner("player");
                        hasWinner = true;
                        break;
                    }
                    if (player.getHand().isBust()) {
                        System.out.println("BUST!!!!");
                        declareWinner("dealer");
                        hasWinner = true;
                        break;

                    }
                } else {
                    System.exit(0);
                }
            }
            
            if (hasWinner) {
                continue;
            }
            dealer.play();
            if (dealer.getHand().sum() > player.getHand().sum()
                    && dealer.getHand().sum() <= 21) {

                declareWinner("dealer");

            } else {
                declareWinner("player");
            }

        }

    }

    @Override
    public void declareWinner(String winner) {

        if (winner.equals("dealer")) {
            System.out.println("Dealer Winns!");
            player.setCredit(player.getPlayerBet(), !isWinner);
            System.out.printf("%s! You have $%d \n", player.getName(), player.getCredit());

        } else {
            System.out.println("You Win!");
            player.setCredit(player.getPlayerBet(), isWinner);
            System.out.printf("%s! You have $%d \n", player.getName(), player.getCredit());
        }
    }

}
