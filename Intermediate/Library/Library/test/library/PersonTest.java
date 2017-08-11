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
public class PersonTest {
    
    public PersonTest() {
    }

    @Test
    public void testGetPID() {
        Person p = new Customer(1,"Chris",1, false);
        assertEquals(1,(p.getPID()));
    }

    @Test
    public void testSetPID() {
        Person p = new Customer(1,"Chris",1, false);
        p.setPID(2);
        assertEquals(2,(p.getPID()));
    }

    @Test
    public void testGetName() {
        Person p = new Customer(1,"Chris",1, false);
        assertEquals("Chris",(p.getName()));
    }

    @Test
    public void testSetName() {
        Person p = new Customer(1,"Chris",1, false);
        p.setName("Ronaldo");
        assertEquals("Ronaldo",(p.getName()));
    }

    @Test
    public void testGetAge() {
        Person p = new Customer(1,"Chris",22, false);
        assertEquals(22,(p.getAge()));
    }

    @Test
    public void testSetAge() {
        Person p = new Customer(1,"Chris",1, false);
        p.setAge(23);
        assertEquals(23,(p.getAge()));    
    }
    
}
