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
public class Motorcycle extends Vehicle {
    private int cc;
    
    public Motorcycle(){
        
    }
    
    public String MakeNoise(){return "Lots of noise!";}
    
    public void Startup(){System.out.println(MakeNoise());}
    
    public void SetCC(int cc){this.cc = cc;}
    
    public int GetCC(){return this.cc;}
}
