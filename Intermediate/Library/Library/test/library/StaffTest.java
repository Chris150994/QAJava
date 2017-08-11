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
public class StaffTest {
    
    public StaffTest() {
    }


    @Test
    public void testGetPrivLevel() {
        Staff s = new Staff(1,"Chris",22,10);
        assertEquals(10,(s.getPrivLevel()));
    }

    @Test
    public void testSetPrivLevel() {
        Staff s = new Staff(1,"Chris",22,1);
        
        Person p = new Customer(1,"Chris",1, false);
        s.setPrivLevel(5);
        assertEquals(5,(s.getPrivLevel()));
    }
    
}
