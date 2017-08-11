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
public class Vehicle {
    public int id;
    public boolean isDamaged;

    public Vehicle(){
        
    }
    
    public String toString(Vehicle v){
        if (v instanceof Car) {
            return String.format(".%nVehicle Type = Car" + ".%n"
                                +"Vehicle ID = " + v.GetID() + ".%n"
                                +"Vehicle Doors = " + ((Car) v).GetDoors() + ".%n"
                                +"Vehicle Damage = " + v.GetVehicleDamage());
        }
        else if (v instanceof Motorcycle) {
            return String.format("Vehicle Type = Motorcycle" + ".%n"
                                +"Vehicle ID = " + v.GetID() + ".%n"
                                +"Vehicle CC = " + ((Motorcycle) v).GetCC() + ".%n"
                                +"Vehicle Damage = " + v.GetVehicleDamage());
        }
        else if (v instanceof Bicycle) {
            return String.format("Vehicle Type = Bicycle" + ".%n"
                                +"Vehicle ID = " + v.GetID() + ".%n"
                                +"Vehicle Wheels = " + ((Bicycle) v).GetWheels() + ".%n"
                                +"Vehicle Damage = " + v.GetVehicleDamage());
        }
        else
        {
            System.out.println("Error - not instance of any class.");
        }
        return "Error";
    }
    
    public void SetID(int id){this.id = id;}
    
    public int GetID(){return this.id;}
    
    public void SetVehicleDamage(boolean isDamaged){this.isDamaged = isDamaged;}
    
    public String GetVehicleDamage(){
        String damaged = "";
        if (isDamaged) {
            damaged = "Damaged";
        }
        else {
            damaged = "Not Damaged";
        }
        return damaged;
    }
    
    public void FixVehicleDamage(){
        this.isDamaged = false;
    }    
}
