/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class People {
    
    public static void main(String[] args) {
        //String people[][] = ArrayGenerator();
        //OutputEach(people);
        Search();
    }
    
    public static void OutputEach(String[][] array){
        System.out.println(array[0][0]);
        System.out.println(array[1][0]);
        System.out.println(array[2][0]);
    }
    public static String[][] ArrayGenerator(){
        String people[][] = 
        {{"Chris","22","Consultant"},{"Waheed","35","Consultant"},{"Kyle","22","Consultant"}};
        return people;
    }
    public static String GetSearchPhrase(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Person Seach: ");
        return scan.next();
    }
    public static void Search(){
        String people[][] = ArrayGenerator();
        String searchPhrase = GetSearchPhrase();
        
        for (String person[] : people) {
            if (searchPhrase.toLowerCase().equals(person[0].toLowerCase())) {
                System.out.println("Person: "+person[0]);
                System.out.println("Age: " +person[1]);
                System.out.println("Job: "+person[2]);
            }
        }
    }
}
