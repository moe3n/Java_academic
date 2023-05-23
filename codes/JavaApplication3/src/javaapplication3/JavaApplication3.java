/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author faculty
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library l=new Library("prokashoni",10);
        Book b1=new Book("physics",450,100);
        Book b2=new Book("chemistry",500,150);
        l.addbook(b1);
        l.addbook(b2);
        l.print();
        // TODO code application logic here
    }
    
}
