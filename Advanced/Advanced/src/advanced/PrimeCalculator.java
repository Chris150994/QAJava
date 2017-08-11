/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced;

/**
 *
 * @author Administrator
 */
public class PrimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Number of primes: " + Calculate());
    }
    
    public static int Calculate(){
        int count = 0;
        
        for (int i = 3; i < 1000000; i++) {
            if (IsPrime(i)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean IsPrime(int n){
        if (n%2==0) {
            return false;
        }
        else if (n%3==0) {
            return false;
        }
        else if (n%5==0) {
            return false;
        }
        else if (n%7==0) {
            return false;
        }
        else if (n%11==0) {
            return false;
        }
        else if (n%13==0) {
            return false;
        }
        else if (n%17==0) {
            return false;
        }
        else if (n%19==0) {
            return false;
        }
        else if (n%23==0) {
            return false;
        }
    
        for (int i = 3; i < n; i+=2) {
                if (n%i==0) {
                    return false;
                }
            }

        return true;
    }
}
