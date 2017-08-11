/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class LibraryMainTest {
    
    public LibraryMainTest() {
    }
    
    @Test
    public void testUpdateMap(){
        LibraryMain lM = new LibraryMain();
        Map before = new Map(1,true,"Suffolk");
        Map updateTo = new Map(2,false,"Ipswich");
        before = before.update(updateTo);
        assertTrue(before.getLocation() == updateTo.getLocation());
    }
    @Test
    public void testUpdateMagazene(){
        LibraryMain lM = new LibraryMain();
        Magazene before = new Magazene(1,true,true);
        Magazene updateTo = new Magazene(2,false,false);
        before = before.update(updateTo);
        assertTrue(before.isRestricted() == updateTo.isRestricted());
    }
    
    @Test
    public void testUpdateBook(){
        LibraryMain lM = new LibraryMain();
        Book before = new Book(1,true,"Kingfisher");
        Book updateTo = new Book(2,false,"Penguin");
        before = before.update(updateTo);
        assertTrue(before.getPublisher() == updateTo.getPublisher());
    }
    
    @Test
    public void testRemoveItem(){
        Book i = new Book(1,true,"Kingfisher");
        LibraryMain lM = new LibraryMain();
        lM.itemList.add(i);
        lM.DeleteItem(1);
        assertEquals(0,(lM.itemList.size()));
    }
    
    @Test
    public void testAddBook(){
        LibraryMain lM = new LibraryMain();
        Book b;
        b = lM.AddBook("Kingfisher");
        lM.itemList.add(b);
        assertTrue(lM.itemList.contains(b));
        assertEquals(1,b.getIID());
        assertEquals("Kingfisher",b.getPublisher());
    }
    
    @Test
    public void AddMagazene(){
        LibraryMain lM = new LibraryMain();
        Magazene m;
        m = lM.AddMagazene(false);
        lM.itemList.add(m);
        assertTrue(lM.itemList.contains(m));
        assertEquals(1,m.getIID());
        assertEquals(false,m.isRestricted());
    }
    
    @Test
    public void AddMap(){
        LibraryMain lM = new LibraryMain();
        Map m;
        m = lM.AddMap("Suffolk");
        lM.itemList.add(m);
        assertTrue(lM.itemList.contains(m));
        assertEquals(1,m.getIID());
        assertEquals("Suffolk",m.getLocation());
    }
    
    @Test
    public void testCheckOutItem(){
        LibraryMain lM = new LibraryMain();
        Map map = new Map(1,false,"Suffolk");
        assertFalse(map.isCheckedOut());
        lM.itemList.add(map);
        lM.CheckOutItem(1);
        assertTrue(map.isCheckedOut());
        
        Magazene mag = new Magazene(2,false,false);
        assertFalse(mag.isCheckedOut());
        lM.itemList.add(mag);
        lM.CheckOutItem(2);
        assertTrue(mag.isCheckedOut());   
        
        Book book = new Book(3,false,"Suffolk");
        assertFalse(book.isCheckedOut());
        lM.itemList.add(book);
        lM.CheckOutItem(3);
        assertTrue(book.isCheckedOut());   
    }
    
    @Test
    public void testCheckIn(){
        LibraryMain lM = new LibraryMain();
        Map map = new Map(1,true,"Suffolk");
        assertTrue(map.isCheckedOut());
        lM.itemList.add(map);
        lM.ReturnItem(1);
        assertFalse(map.isCheckedOut());
        
        Magazene mag = new Magazene(2,true,false);
        assertTrue(mag.isCheckedOut());
        lM.itemList.add(mag);
        lM.ReturnItem(2);
        assertFalse(mag.isCheckedOut());   
        
        Book book = new Book(3,true,"Suffolk");
        assertTrue(book.isCheckedOut());
        lM.itemList.add(book);
        lM.ReturnItem(3);
        assertFalse(book.isCheckedOut());  
    }
    
    @Test
    public void testRegPerson(){
        LibraryMain lM = new LibraryMain();
        Customer c1 = new Customer(1,"Chris",22,false);
        Staff s1 = new Staff(2,"Waheed",22,1);
        Customer c2;
        Staff s2;
        c2 = lM.RegisterPerson(c1);
        s2 = lM.RegisterPerson(s1);
        assertTrue(c2.equals(c1));
        assertTrue(s2.equals(s1));
        
    }
    
    @Test
    public void testDelPerson(){
        Person p = new Customer(1,"Chris",22,false);
        LibraryMain lM = new LibraryMain();
        lM.personList.add(p);
        lM.DeletePerson(1);
        assertEquals(0,(lM.personList.size()));
    }
    
    @Test
    public void testUpdatePerson(){
        LibraryMain lM = new LibraryMain();
        Customer before = new Customer(1,"Chris",22,false);
        Customer updateTo = new Customer(2,"Wazzi",35,true);
        lM.personList.add(before);
        lM.UpdatePerson(1, updateTo);
        for (Person p : lM.personList){
           assertEquals("Wazzi",p.getName()); 
        }
    }
    
    @Test
    public void testWriteContentsToFile(){
        
    }
    
}
