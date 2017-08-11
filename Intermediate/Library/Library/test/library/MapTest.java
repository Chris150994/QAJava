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
public class MapTest {
    
    public MapTest() {
    }


    @Test
    public void testGetLocation() {
        Map m = new Map(1,false,"Suffolk");
        assertEquals("Suffolk",(m.getLocation()));
    }

//int IID, boolean checkedOut, String location
    @Test
    public void testSetLocation() {
        Map m = new Map(1,false,"Suffolk");
        m.setLocation("Manchester");
        assertEquals("Manchester",(m.getLocation()));
    }
    
}
