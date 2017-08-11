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
public class Array {
    public static void main(String[] args) {
        Iterations();
    }
    public static void Iterations(){
        int multiplyValues[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 1; i++) {
            System.out.println(Multiply(6,0,i,multiplyValues));
        }
    }
    
    public static int Multiply(int a, int b, int i, int values[]){
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
