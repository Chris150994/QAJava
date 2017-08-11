/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PeopleCorrect {
    private ArrayList<PeopleCorrect> people = new ArrayList<PeopleCorrect>();
    private String name;
    private int age;
    private String jobTitle;
    
    public static void main(String[] args){
        PeopleCorrect p = new PeopleCorrect();
        p.AddPeople();
        p.PrintAll(p.people);
        p.PersonSearch(p.people, "Chris");
    }
    
    public void PersonSearch(ArrayList<PeopleCorrect> person, String search){
        for(PeopleCorrect p: person){
            if (p.name == search) {
                System.out.println(p.toString(p));
            }
        }
    }
    
    public void AddPeople() {
        CreatePerson(22, "Consultant", "Chris");
        CreatePerson(35, "Consultant", "Waheed");
        CreatePerson(22, "Consultant", "John");
    }
    
    public void CreatePerson(int age,String jobtitle, String name){
        PeopleCorrect p = new PeopleCorrect();
        p.age = age;
        p.jobTitle = jobtitle;
        p.name = name;
        System.out.println("Person: " + name + " added");
        people.add(p);
    }
    
    public void PrintAll(ArrayList<PeopleCorrect> person){
        for(PeopleCorrect p: person){
            System.out.println(p.toString(p));
        }
    }
    
    public String toString(PeopleCorrect person){
        return String.format(".%n Name = " + person.name + ".%n"
                            +"Job Title = " + person.jobTitle + ".%n"
                            +"Age = " + person.age);
    }
}
