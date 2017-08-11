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
public class Book extends Item implements Updatable <Book> {
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
    public Book update(Book b){
        this.setPublisher(b.getPublisher());
        this.setIID(b.getIID());
        this.setCheckedOut(b.isCheckedOut());
        return this;
    }
    
}
