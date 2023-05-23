/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author faculty
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n;
       System.out.println("Enter total students");
       n=in.nextInt();
       Student[] s=new Student[n];
       String name;
       double cgpa;
       int id;
       for(int i=0;i<n;i++){
          name=in.next();
          id=in.nextInt();
          cgpa=in.nextDouble();
          s[i]=new Student(id,name,cgpa);
       }
       Student temp;
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(s[i].getcgpa()<s[j].getcgpa()){
                   temp=s[i];
                   s[i]=s[j];
                   s[j]=temp;
               }
           }
       }
       for(int i=0;i<n;i++){
           s[i].print();
       }

    }
    
}
