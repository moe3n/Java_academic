/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author faculty
 */
public class Student {
    private int id;
    private  String name;
    private double cgpa;
    Student(){}
    Student(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    Student(int id){
        this.id=id;
    }
    void setid(int ids){
        id=ids;
    }
    int getid(){
        return this.id;
    }
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
    void setcgpa(double cgpa){
        this.cgpa=cgpa;
    }
    double getcgpa(){
        return this.cgpa;
    }
   void print(){
       System.out.println("Name: "+this.name+"CGPA: "+this.cgpa+"ID: "+this.id);
   }
    
}
