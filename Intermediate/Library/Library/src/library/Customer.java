/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Administrator
 */
public class Customer extends Person implements Updatable <Customer> {
    private boolean isOutstanding;    
    
    
    public Customer(int PID, String name, int age, boolean isOutstanding){
        super(PID, name, age);
        this.isOutstanding = isOutstanding;
    }

    public boolean isOutstanding() {
        return isOutstanding;
    }

    public void setOutstanding(boolean isOutstanding) {
        this.isOutstanding = isOutstanding;
    }

    @Override
    public Customer update(Customer c){
        this.setOutstanding(c.isOutstanding());
        this.setAge(c.getAge());
        this.setName(c.getName());
        this.setPID(c.getPID());
        return this;
    }
    
    
}
