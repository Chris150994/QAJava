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
public class ItemTest {
    
    public ItemTest() {
    }


    @Test
    public void testGetIID() {
        Book b = new Book(1,false,"Kingfisher");
        assertEquals(1, b.getIID());
    }


    @Test
    public void testSetIID() {
        Book b = new Book(1,false,"Kingfisher");
        b.setIID(10);
        assertEquals(10, b.getIID());
    }


    @Test
    public void testIsCheckedOut() {
        Book b = new Book(1,false,"Kingfisher");
        assertFalse(b.isCheckedOut());
    }


    @Test
    public void testSetCheckedOut() {
        Book b = new Book(1,false,"Kingfisher");
        b.setCheckedOut(true);
        assertTrue(b.isCheckedOut());
    }
    
}
