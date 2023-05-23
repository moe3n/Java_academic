/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline1;
import java.util.Scanner;
/**
 *
 * @author mahmudmoeen
 */
public class Offline1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        //System.out.println("Please enter the total number of students,name,total course and course info: ");
        int total_students=s.nextInt();
        String name=s.next();
        int total_course = s.nextInt();
        student[] st= new student[total_students];
        
        for(int i=0;i<total_students;i++)
        {
            st[i]=new student(name,total_course);
           // st[i]=new course()
            System.out.println(st[i]);
        }
        
        
    }
    
}
