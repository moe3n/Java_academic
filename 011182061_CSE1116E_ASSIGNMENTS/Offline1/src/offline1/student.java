/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline1;

import java.util.LinkedList;
import java.util.Scanner;



/**
 *
 * @author mahmudmoeen
 */
public class student {
    
    private course[] c;
    private String name;
    private int total_course;
    //LinkedList<course> list=new LinkedList<>();
    student(){
    }
    student(String name,int total_course)
    {
        this.name=name;
        this.total_course=total_course;
        
    }
    
    int i=0;
    void addcourse(course C)
    {
      C = new course();
      c[i] =C;
      i++;
    }
    
}
