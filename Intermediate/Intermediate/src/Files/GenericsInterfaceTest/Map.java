/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files.GenericsInterfaceTest;

/**
 *
 * @author Administrator
 */
public class Map extends Item{
    private String location;
    
    public Map(int IID, boolean isCheckedOut, String location){
        super(IID, isCheckedOut);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String printObject(Item i){
        return "This is a Map";
    }
}
