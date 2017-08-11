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
public class Magazene extends Item{
    private boolean isRestricted;
    
    public Magazene(int IID, boolean isCheckedOut, boolean isRestricted){
        super(IID, isCheckedOut);
        this.isRestricted = isRestricted;
    }

    public boolean isIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }
    
    @Override
    public String printObject(Item i){
        return "This is a Magazene";
    }
}
