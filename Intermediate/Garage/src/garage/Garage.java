/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Garage {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    
    public static void main(String[] args) {
        Garage g = new Garage();
        g.CreateVehicles();
        //g.FixVehicle(g.vehicles, 3);
        //g.EmptyGarage();
        //g.DeleteCertainVehicle(g.vehicles, 3);
        //g.OutputAllVehicles(g.vehicles);
        g.OutputCertainVehicle(g.vehicles, 2);
    }
    
    public void CreateVehicles(){
        vehicles.add(AddCar(1,5,true));
        vehicles.add(AddCar(2,3,true));
        vehicles.add(AddMotorcycle(3,200,true));
        vehicles.add(AddMotorcycle(4,1200, true));
        vehicles.add(AddBicycle(5,2,true));
        vehicles.add(AddBicycle(6,3,true));
    }
    
    public void EmptyGarage(){
        vehicles.clear();
        System.out.println("Garage emptied.");
    }
    
    public void OutputCertainVehicle(ArrayList<Vehicle> v, int searchCriteria){
        
        for (Vehicle vehicle1 : v) {
            if (searchCriteria == (vehicle1.GetID())) {
                System.out.println(vehicle1.toString(vehicle1));
                System.out.println("Bill: " + BillCheck(vehicle1));
            }
        }
    }
    
    public void DeleteCertainVehicle(ArrayList<Vehicle> v, int searchCriteria){
        for (Vehicle vehicle1 : v) {
            if (searchCriteria == (vehicle1.GetID())) {
                System.out.println(vehicle1.toString(vehicle1));
                System.out.println("Bill: " + BillCheck(vehicle1));
                v.remove(vehicle1);
                System.out.println("Vehicle removed.");
                return;
            }
        }
    }
    
    public Vehicle AddCar(int id, int doors, boolean isDamaged){
        Car car = new Car();
        car.SetID(id);
        car.SetVehicleDamage(isDamaged);
        car.SetDoors(doors);
        
        System.out.println("Car Added.");
        return car;
    }
    
    public Vehicle AddMotorcycle(int id, int cc, boolean isDamaged){
        Motorcycle bike = new Motorcycle();
        bike.SetID(id);
        bike.SetCC(cc);
        bike.SetVehicleDamage(isDamaged);
        
        System.out.println("Motorbike Added.");
        return bike;
    }
    
    public Vehicle AddBicycle(int id, int wheels, boolean isDamaged){
        Bicycle pushBike = new Bicycle();
        pushBike.SetID(id);
        pushBike.SetVehicleDamage(isDamaged);
        pushBike.SetWheels(wheels);
        
        System.out.println("Bicycle Added.");
        return pushBike;
    }
    
    public void OutputAllVehicles(ArrayList<Vehicle> v){
        for (Vehicle vehicle1 : v) {
            System.out.println(vehicle1.toString(vehicle1));
            System.out.println("Bill: " + BillCheck(vehicle1));
        }
    }
    
    public void FixVehicle(ArrayList<Vehicle> v, int searchCriteria){
        
        for (Vehicle vehicle1 : v) {
            if (searchCriteria == (vehicle1.GetID())) {
                vehicle1.FixVehicleDamage();
                System.out.println("Vehicle Fixed.");
                System.out.println(vehicle1.toString(vehicle1));
                System.out.println("Bill: " + BillCheck(vehicle1));
                return;
            }
        }
    }
    
    public int BillCheck(Vehicle v){
        int bill = 0;
            
        if (v.isDamaged) {
            if (v instanceof Car) {
                bill += 500;
            }
            else if (v instanceof Motorcycle) {
                bill += 250;
            }
            else if (v instanceof Bicycle) {
                bill += 25;
            }
            else{
                bill = 0;
            }
        }
        return bill;
    }
}
