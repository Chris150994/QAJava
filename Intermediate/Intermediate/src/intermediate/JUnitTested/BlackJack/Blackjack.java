/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.BlackJack;

/**
 *
 * @author Administrator
 */
public class Blackjack {
    public static void main(String[] args) {
        System.out.println(Closest(22,19));
    }
    public static int Closest(int a, int b){
        int ans = 0;
        
        if (a > b && a <= 21) {
            ans = a;
        }
        else if (b > a && b <= 21) {
            ans = b;
        }
        else if (a > 21 && b > 21){ 
            ans = 0;
        }
        else{
            if (a > 21 && b <= 21) {
                ans = b;
            }
            else if (b > 21 && a <=21) {
                ans = a;
            }
        }
        
        return ans;
    }
}
