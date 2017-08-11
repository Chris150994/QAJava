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
public class Book extends Item {
    private String publisher;
    
    public Book(int IID, boolean isCheckedOut, String publisher){
        super(IID, isCheckedOut);
        this.publisher = publisher;      
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    @Override
    public String printObject(Item i){
        return "This is a Book";
    }
    
}
