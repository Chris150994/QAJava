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
public class MagazeneTest {
    
    public MagazeneTest() {
    }


    @Test
    public void testIsRestricted() {
        Magazene m = new Magazene(1,false,false);
        assertFalse(m.isRestricted());
    }

 //int IID, boolean checkedOut, boolean restricted
    @Test
    public void testSetRestricted() {
        Magazene m = new Magazene(1,false,false);
        m.setRestricted(true);
        assertTrue(m.isRestricted());
    }
    
}
