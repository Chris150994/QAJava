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
public abstract class Item implements PrintableItem {
    private boolean isCheckedOut;
    private int IID;
    
    public Item(int IID, boolean isCheckedOut){
        this.IID = IID;
        this.isCheckedOut = isCheckedOut;
    }

    public boolean isIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public int getIID() {
        return IID;
    }

    public void setIID(int IID) {
        this.IID = IID;
    }
    
    public String printObject(Item i){
        return "";
    }
}
