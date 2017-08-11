/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.BlackJack;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }
    
    @Test
    public void TestBlackjack(){
        Blackjack b = new Blackjack();
        assertEquals(19, b.Closest(19,22));
        assertEquals(0, b.Closest(25,22));
        assertEquals(21, b.Closest(19,21));
    }
    /**
     * Test of main method, of class Blackjack.
     */    
}
