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
public class Iteration {
    public static void main(String[] args) {
        Iterations();
    }
    public static void Iterations(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Multiply(6,0,i));
        }
    }
    
    public static int Multiply(int a, int b, int i){
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
