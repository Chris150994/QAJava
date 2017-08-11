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
public class Library {
    public static void main(String[] args){
        Item b = new Book(1,true,"Kingfisher");
        Item map = new Map(1,true,"Suffolk");
        Item mag = new Magazene(1,true,true);
        System.out.println(b.printObject(b));
        System.out.println(map.printObject(map));        
        System.out.println(mag.printObject(mag));
    }

}
