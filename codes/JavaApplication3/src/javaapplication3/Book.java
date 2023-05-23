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
public class Book {
    public double cost;
    public String name;
    public int number_of_pages;
    Book(String name,double cost,int number_of_pages){
        this.name=name;
        this.cost=cost;
        this.number_of_pages=number_of_pages;
    }
    Book(){}
    void print(){
        System.out.println("Name: "+this.name+"Cost "+this.cost+"pages "+this.number_of_pages);
    }
    
}
