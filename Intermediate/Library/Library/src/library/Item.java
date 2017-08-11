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
public abstract class Item {
    private int IID;
    private boolean isCheckedOut;
    
    public Item(int IID, boolean isCheckedOut){
        this.IID = IID;
        this.isCheckedOut = isCheckedOut;
    }

    public int getIID() {
        return IID;
    }

    public void setIID(int IID) {
        this.IID = IID;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }    
}
