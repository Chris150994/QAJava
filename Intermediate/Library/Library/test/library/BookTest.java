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
public class BookTest {
    
    public BookTest() {
    }

    @Test
    public void testGetPublisher() {
        Book b = new Book(1, false, "Kingfisher");
        assertEquals("Kingfisher",(b.getPublisher()));
    }

    @Test
    public void testSetPublisher() {
        Book b = new Book(1, false, "Kingfisher");
        b.setPublisher("Test");
        assertEquals("Test",(b.getPublisher()));
    } 
}
