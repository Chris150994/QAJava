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
public class Car extends Vehicle {
    private int doors;
    
    public Car(){
        
    }
    
    public String MakeNoise(){return "some noise";}
    
    public void Startup(){System.out.println(MakeNoise());}
    
    public void SetDoors(int doors){this.doors = doors;}
    
    public int GetDoors(){return this.doors;}

    //void SetDoors(int doors) {this.doors = doors;}
}
