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
public class Library {
    public String name;
    public int capacity;
    Book[] books;
    private int top=0;
    Library(){}
    Library(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
        books=new Book[capacity];
    }
    void addbook(Book b){
            books[top]=b;
            top++;
    }
    void print(){
        for(int i=0;i<top;i++){
            books[i].print();
        }
    }
    
}
