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
public class Staff extends Person implements Updatable <Staff> {
    private int privLevel;
    
    public Staff(int PID, String name, int age, int privLevel){
        super(PID, name, age);
        this.privLevel = privLevel;
    }

    public int getPrivLevel() {
        return privLevel;
    }

    public void setPrivLevel(int privLevel) {
        this.privLevel = privLevel;
    }
    
    @Override
    public Staff update(Staff s){
        this.setPrivLevel(s.getPrivLevel());
        this.setAge(s.getAge());
        this.setName(s.getName());
        this.setPID(s.getPID());
        return this;
    }
    
}
