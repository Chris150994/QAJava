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
public class Map extends Item implements Updatable <Map>{
    private String location;
    
    public Map(int IID, boolean checkedOut, String location){
        super(IID, checkedOut);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public Map update(Map m){
        this.setIID(m.getIID());
        this.setCheckedOut(m.isCheckedOut());
        this.setLocation(m.getLocation());
        return this;
    }    
    
}
