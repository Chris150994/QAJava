/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class LibraryMain {

    public final ArrayList<Item> itemList = new ArrayList<Item>();
    public final ArrayList<Person> personList = new ArrayList<Person>();

    
    public static void main(String[] args) {
        LibraryMain lM = new LibraryMain();
        String path = "E:\\QA\\Exercises\\Java\\Intermediate\\Intermediate\\build\\classes\\Files\\Test.txt";
        lM.WriteContents(path);
    }
    
    public Book UpdateBook(Book b, int IID, boolean isCheckedOut, String publisher){
        Book book2 = new Book(IID,isCheckedOut,publisher);
        /*
        calls the interface which is an overloaded method accepting either an
        item or a person and updates the old record with the new one accordingly 
        */
        ;
        return b.update(book2);
    }
    
    public Map UpdateMap(Map map, int IID, boolean isCheckedOut, String location){
        map.setIID(IID);
        map.setCheckedOut(isCheckedOut);
        map.setLocation(location);
        return map;
    }
    
    public Magazene UpdateMagazene(Magazene mag, int IID, boolean isCheckedOut,
            boolean isRestricted){
        
        mag.setIID(IID);
        mag.setRestricted(isRestricted);
        mag.setCheckedOut(isCheckedOut);
        return mag;
    }
    
    public Book AddBook(String publisher){
        int IID = (itemList.size() + 1);
        Book b = new Book(IID,false,publisher);
        return b;
    }
    
    public Magazene AddMagazene(boolean isRestricted){
        int IID = (itemList.size() + 1);
        Magazene m = new Magazene(IID, false, isRestricted);
        itemList.add(m);
        return m;
    }
    
    public Map AddMap(String location){
        int IID = (itemList.size() + 1);
        Map map1 = new Map(IID,false,location);
        itemList.add(map1);
        return map1;
    }
    
    public void DeleteItem(int IID){
        for (Item i : itemList) {
            if (IID == (i.getIID())) {
                itemList.remove(i);
                return;
            }
        }
    }
    
    public void CheckOutItem(int IID){
        for (Item i:itemList){
            if (i.getIID() == IID) {
                i.setCheckedOut(true);
                return;
            }
        }
    }
    
    public void ReturnItem(int IID){
        for (Item i:itemList){
            if (i.getIID() == IID) {
                i.setCheckedOut(false);
                return;
            }
        }
    }
    
    public Customer RegisterPerson(Customer c){
//        int PID = (personList.size() + 1);
//        Customer c = new Customer(PID, name, age, false);
        personList.add(c);
        return c;
    }
    
    public Staff RegisterPerson(Staff s){
        personList.add(s);
        return s;
    }
    
    public void DeletePerson(int PID){
        for(Person p: personList){
            if (p.getPID() == PID) {
                personList.remove(p);
                return;
            }
        }
    }
    
    public void UpdatePerson(int PID, Person updatedPerson){
        for (Person person : personList){
            if (updatedPerson instanceof Customer) {
                Customer c = (Customer) person;
                if (c.getPID() == PID) {
                    person = c.update((Customer) updatedPerson);
                    return;
                }
            }
            else if(updatedPerson instanceof Staff){
                Staff s = (Staff) person;
                if (s.getPID() == PID) {
                    person = s.update((Staff) updatedPerson);
                    return;
                }
            }
        }
    }
    
    public void AddObjectsFromContents(){
        
    }
    
    public void WriteContents(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Person p : personList){
                if (p instanceof Staff) {
                    String s = toString((Staff) p);
                }
                else if (p instanceof Customer){
                    String s = toString((Customer) p);
                }
            }

            for (Item i : itemList){
                if (i instanceof Map) {
                    String s = toString((Map) i);                
                }
                else if (i instanceof Magazene) {
                    String s = toString((Magazene) i);                 
                }
                else if (i instanceof Book){
                    String s = toString((Book) i);                
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public String toString(Staff s){
        String formattedString = ("Staff//" + s.getPID() + "//" + 
                                s.getName() + "//" + 
                                s.getAge() + "//" + 
                                s.getPrivLevel());
        return formattedString;
    } 
    
    public String toString(Customer c){
        String formattedString = ("Customer//" + c.getPID() + "//" + 
                                c.getName() + "//" + 
                                c.getAge() + "//" + 
                                c.isOutstanding());
        return formattedString;
    }  
    
    public String toString(Book b){
        String formattedString = ("Book//" + b.getIID() + "//" + 
                                b.isCheckedOut() + "//" + 
                                b.getPublisher());
        return formattedString;
    }  
    
    public String toString(Magazene m){
        String formattedString = ("Magazene//" + m.getIID() + "//" + 
                                m.isCheckedOut() + "//" + 
                                m.isRestricted());
        return formattedString;
    }  
    
    public String toString(Map m){
        String formattedString = ("Map//" + m.getIID() + "//" + 
                                m.isCheckedOut() + "//" + 
                                m.getLocation());
        return formattedString;
    }
}
