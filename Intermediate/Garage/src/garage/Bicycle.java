/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author Administrator
 */
public class Bicycle extends Vehicle {
    private int wheels;
    
    public Bicycle(){
        
    }
    
    public int GetWheels(){return this.wheels;}
    
    public void SetWheels(int wheels){this.wheels = wheels;}
    
    public String MakeNoise(){return "Silence...";}
    
    public void Startup(){System.out.println(MakeNoise());}
}
