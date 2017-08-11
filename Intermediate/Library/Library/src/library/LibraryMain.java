/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class LibraryMain {

    public final ArrayList<Item> itemList = new ArrayList<>();
    public final ArrayList<Person> personList = new ArrayList<>();

    
    public static void main(String[] args) {
        LibraryMain lM = new LibraryMain();
        lM.FillList();
        
        String path = "E:\\QA\\Exercises\\Java\\Test.txt";
        lM.WriteContents(path);
    }
    
    public void FillList(){
        this.AddBook(1,false,"Kingfisher");
        this.AddBook(2,false,"Penguin");
        this.AddMagazene(3,false,true);
        this.AddMagazene(4,false,false);
        this.AddMap(5,false,"Suffolk");
        this.AddMap(6,false,"Ipswich");
        Customer c1 = new Customer(1,"Chris",22,false);
        Customer c2 = new Customer(2,"Wazzi",35,true);
        this.RegisterPerson(c1);
        this.RegisterPerson(c2);
        Staff s1 = new Staff(3,"John",22, 2);
        Staff s2 = new Staff(4,"Kyle",22, 3);
        this.RegisterPerson(s1);
        this.RegisterPerson(s2);
    }
    
    public Book UpdateBook(Book b, int IID, boolean isCheckedOut, String publisher){
        Book book2 = new Book(IID,isCheckedOut,publisher);
        /*
        calls the interface which is an overloaded method accepting either an
        item or a person and updates the old record with the new one accordingly 
        */
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
    
    public Book AddBook(int IID, boolean isCheckedOut, String publisher){
        Book b = new Book(IID,isCheckedOut,publisher);
        itemList.add(b);
        return b;
    }
    
    public Magazene AddMagazene(int IID, boolean isCheckedOut, boolean isRestricted){
        Magazene m = new Magazene(IID, isCheckedOut, isRestricted);
        itemList.add(m);
        return m;
    }
    
    public Map AddMap(int IID, boolean isCheckedOut, String location){
        Map map1 = new Map(IID,isCheckedOut,location);
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
                    c.update((Customer) updatedPerson);
                    return;
                }
            }
            else if(updatedPerson instanceof Staff){
                Staff s = (Staff) person;
                if (s.getPID() == PID) {
                    s.update((Staff) updatedPerson);
                    return;
                }
            }
        }
    }
    
    public void AddObjectsFromContents(String path){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
           while((line = br.readLine()) != null){
               String[] parts = line.split("//");
                //passes the split string as required
                switch (parts[0]){
                    case "Customer":
                    //int - PID, string - Name, int - Age, bool - hasOutstanding
                        Customer c = new Customer(parseInt(parts[1]),parts[2],
                                parseInt(parts[3]),parseBoolean(parts[4]));
                        this.RegisterPerson(c);
                        break;
                    case "Staff":
                    //int - PID, string - Name, int - Age, int - PrivLevel
                        Staff s = new Staff(parseInt(parts[1]),parts[2],
                                parseInt(parts[3]), parseInt(parts[4]));
                        this.RegisterPerson(s);
                        break;
                    case "Book":
                    //Passes the IID, boolean - isCheckedOut , string - Publisher
                        this.AddBook(parseInt(parts[1])
                                ,parseBoolean(parts[2]),parts[3]);
                        break;
                    case "Magazene":
                    //Passes the IID, boolean - isCheckedOut , boolean - isRestricted
                        this.AddMagazene(parseInt(parts[1])
                                ,parseBoolean(parts[2]),parseBoolean(parts[3]));
                        break;
                    case "Map":
                    //Passes the IID, boolean - isCheckedOut , string - Location
                        this.AddMap(parseInt(parts[1]), 
                                parseBoolean(parts[2]), parts[3]);                  
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public void WriteContents(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Person p : personList){
                if (p instanceof Staff) {
                    String staffString = toString((Staff) p);
                    bw.write(staffString);
                }
                else if (p instanceof Customer){
                    String customerString = toString((Customer) p);
                    bw.write(customerString);
                }
            }

            for (Item i : itemList){
                if (i instanceof Map) {
                    String mapString = toString((Map) i);  
                    bw.write(mapString);              
                }
                else if (i instanceof Magazene) {
                    String magString = toString((Magazene) i); 
                    bw.write(magString);                
                }
                else if (i instanceof Book){
                    String bookString = toString((Book) i);    
                    bw.write(bookString);
                }
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public String toString(Staff s){
        return String.format("Staff//" + s.getPID() + "//" + 
                                s.getName() + "//" + 
                                s.getAge() + "//" + 
                                s.getPrivLevel() +" %n");
    } 
    
    public String toString(Customer c){
        return String.format("Customer//" + c.getPID() + "//" + 
                                c.getName() + "//" + 
                                c.getAge() + "//" + 
                                c.isOutstanding() +" %n");
    }  
    
    public String toString(Book b){
        return String.format("Book//" + b.getIID() + "//" + 
                                b.isCheckedOut() + "//" + 
                                b.getPublisher() +" %n");
    }  
    
    /**
     * Taking the 
     * @param m Magazene
     * @return Returns the final string generated from the Magazene object.
     */
    public String toString(Magazene m){
        return String.format("Magazene//" + m.getIID() + "//" + 
                                m.isCheckedOut() + "//" + 
                                m.isRestricted() +" %n");
    }  
    
    /**
     * Taking the 
     * @param m Map
     * @return Returns the final string generated from the Map object.
     */
    public String toString(Map m){
        return String.format("Map//" + m.getIID() + "//" + 
                                m.isCheckedOut() + "//" + 
                                m.getLocation() +" %n");
    }
}
