/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.blackjack;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author HpR
 */
public class BlackJackPlayerTest {
    
    public BlackJackPlayerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of setAge method, of class BlackJackPlayer.
     */
    @Test
    public void testSetAgeGood() {
        System.out.println("setAgeGood");
        int age = 20;
        BlackJackPlayer instance = new BlackJackPlayer(age, "test");
        instance.setAge(age);
        
    }
 /**
     * Test of setAge method, of class BlackJackPlayer.
     */
    @Test
    public void testSetAgeBad() {
        System.out.println("setAgeBad");
        int age = 18;
        BlackJackPlayer instance = new BlackJackPlayer(age, "test");
        instance.setAge(age);
        
    }
    @Test
    public void testSetAgeBoundry() {
        System.out.println("setAgeBoundry");
        int age = 19;
        BlackJackPlayer instance = new BlackJackPlayer(age, "test");
        instance.setAge(age);
        
    }

}