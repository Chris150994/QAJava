/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.PaintWizard;

/**
 *
 * @author Chris
 */
public class Paint {
    private int capacity;
    private double cost;
    private int coverage;
    private String name;
    
    public String GetName(){
        return this.name;
    }
    
    public int GetCapacity(){
        return this.capacity;
    }
    
    public double GetCost(){
        return this.cost;
    }
    
    public int GetCoverage(){
        return this.coverage;
    }
    
    public void SetName(String name){
        this.name = name;
    }
    
    public void SetCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void SetCost(double cost){
        this.cost = cost;
    }
    
    public void SetCoverage(int coverage){
        this.coverage = coverage;
    }
}
