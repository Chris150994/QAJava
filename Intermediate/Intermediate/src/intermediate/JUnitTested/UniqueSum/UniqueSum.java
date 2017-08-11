/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.UniqueSum;

/**
 *
 * @author Administrator
 */
public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(Sum(3,2,4));
    }
    
    public static int Sum(int a, int b, int c){
        int ans = 0;
        
        if (a != b && a != c && b != c) {
            ans = a+b+c;
        }
        else if (a == b && a == c ) {
            ans = 0;
        }
        else if (a == b) {
            ans = c;
        }
        else if (a == c) {
            ans = b;
        }
        else if (b == c) {
            ans = a;
        }
        
        return ans;
    }
}
