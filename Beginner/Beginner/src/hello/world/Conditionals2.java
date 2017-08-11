/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author Administrator
 */
public class Conditionals2 {
    public static void main(String[] args) {
        System.out.println(Multiply(6,0));
    }
    
    public static int Multiply(int a, int b){
        int ans = 0;


        ans = a+b;
        
        if (a == 0) {
            ans = b;
        }
        else if (b == 0) {
            ans = a;
        }
        
        return ans;
    }
}
