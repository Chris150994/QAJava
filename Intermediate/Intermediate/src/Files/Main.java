/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Main {
    List<Person> personList = new ArrayList<Person>();
    
    
    public static void main(String[] args){
        Main m = new Main();
        m.CreatePerson(22,"Chris","Consultant");
        m.CreatePerson(35,"Waheed", "Consultant");
        m.CreatePerson(22,"Kyle","Consultant");
        m.CreatePerson(22,"John", "Consultant");
        m.CreatePerson(27,"Paul","Consultant");
        String path = "E:\\QA\\Exercises\\Java\\Intermediate\\Intermediate\\build\\classes\\Files\\Test.txt";
        
        //m.RetrieveFromFile(path);
        //m.OutputToFile(path);
        m.PrintAllObjects();
        
    }
    
    public void CreatePerson(int age, String name, String occupation){
        Person p = new Person();
        p.setAge(age);
        p.setName(name);
        p.setOccupation(occupation);
        AddToList(p);
        //System.out.println("Person added: " + name + " " + age + " " + occupation);
    }
    
    public void AddToList(Person p){
        personList.add(p);
    }
    
    public String FormattedString(Person p){
        return String.format(p.getName() + "//" + 
                p.getAge() + "//" + 
                p.getOccupation()+ ".%n");
    }
    
    public void OutputToFile(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Person p: personList) {
                bw.write(FormattedString(p));            
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void PrintAllObjects(){
        for (Person p: personList){
            System.out.println(toString(p));
        }
    }
    
    public String toString(Person p){
        return String.format(
                " Name: " + p.getName() + 
                " Age: " + p.getAge() + 
                " Occupation: " + p.getOccupation());
    }
    
    public void RetrieveFromFile(String path){
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while((line = br.readLine()) != null){
                String[] parts = line.split("//");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String occupation = parts[2];
                //System.out.println("Trying to add: " +" "+ age +" "+ name +" "+ occupation);
                CreatePerson(age, name, occupation);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
