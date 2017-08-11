/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CustomerTest {
    
    public CustomerTest() {
    }


    @Test
    public void testIsOutstanding() {
        Customer c = new Customer(1,"Chris",22,false);
        assertFalse(c.isOutstanding());
    }
//int PID, String name, int age, boolean outstanding

    @Test
    public void testSetOutstanding() {
        Customer c = new Customer(1,"Chris",22,false);
        c.setOutstanding(true);
        assertTrue(c.isOutstanding());
        
    }
    
}
