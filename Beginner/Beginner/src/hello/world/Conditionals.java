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
public class Conditionals {
    public static void main(String[] args) {
        System.out.println(Multiply(6,5, false));
    }
    
    public static int Multiply(int a, int b, boolean sum){
        int ans = 0;
        if (sum) {
            ans = a+b;
        }
        else{
            ans = a*b;
        }
        return ans;
    }
}
