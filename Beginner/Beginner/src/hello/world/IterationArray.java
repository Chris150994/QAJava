/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class IterationArray {
    public static void main(String[] args) {
        Iterations();
    }
    public static void Iterations(){
        int multiplyValues[] = ArrayGenerator();
        
        for (int i = 0; i < 1; i++) {
            Multiply(6,0,i,multiplyValues);
        }
    }
    
    public static int[] ArrayGenerator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers in the array?");
        int arrayValuesCount = scan.nextInt();
        int[] multiplyValues = new int[arrayValuesCount];
        
        for (int i = 0; i < arrayValuesCount; i++) {
            System.out.println("What is the number for array ref " + (i+1) + ":");
            multiplyValues[i] = scan.nextInt();
        }
        scan.close();
        return multiplyValues;
    }
    
    
    public static void Multiply(int a, int b, int i, int values[]){
        for (int j = 0; j < values.length; j++) {
            System.out.print(values[j]+",");
        }
        System.out.println();
        for (int j = 0; j < values.length; j++) {
            values[j] = values[j] * 10;
            System.out.print(values[j]+",");
        }
        System.out.println();
    }    
}
