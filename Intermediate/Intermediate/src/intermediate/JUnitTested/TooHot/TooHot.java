/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.TooHot;

/**
 *
 * @author Administrator
 */
public class TooHot {
    public static void main(String[] args) {
        System.out.println(CheckTemp(95, true));
    }
    
    public static boolean CheckTemp(int temp, boolean isSummer){
        boolean withinRange = false;
        if (isSummer) {
            if (temp >= 60 && temp <=100) {
                withinRange = true;
            }
        }
        else{
            if (temp >= 60 && temp <=90 ) {
                withinRange = true;
            }    
        }
        return withinRange;
        
    }
}
