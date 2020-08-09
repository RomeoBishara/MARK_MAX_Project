/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.blackjack;

/**
 *
 * @author Romeo Al Bishara
 */
public enum Value {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int cardValue;
    private int secondValue;

    // Ace constructor, has 2 values
    private Value(int cardValue, int secondValue) {
        this.cardValue = cardValue;
        this.secondValue = secondValue;
    }

    private Value(int cardValue) {
        this.cardValue = cardValue;
    }
    
    public int getCardValue() {
        return cardValue;
    }
    
    public int getSecondValue() {
        return secondValue;
    }
    
    
    

    

}
