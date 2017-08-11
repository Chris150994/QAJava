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
public class Magazene extends Item implements Updatable <Magazene>{
    
    private boolean isRestricted;
    
    public Magazene(int IID, boolean isCheckedOut, boolean isRestricted){
        super(IID, isCheckedOut);
        this.isRestricted = isRestricted;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    @Override
    public Magazene update(Magazene m){
        this.setIID(m.getIID());
        this.setCheckedOut(m.isCheckedOut());
        this.setRestricted(m.isRestricted());
        return this;
    }
}
