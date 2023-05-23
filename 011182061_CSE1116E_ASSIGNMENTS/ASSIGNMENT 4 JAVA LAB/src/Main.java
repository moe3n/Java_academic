import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        File f = new File("info.txt");


        try {
            FileReader fr = new FileReader(f);
            BufferedReader buff = new BufferedReader(fr);
            LinkedList<Student> students = new LinkedList<>();

            String str =buff.readLine();
            System.out.println(str);
            int num =Integer.parseInt(str);

            System.out.println(num);
            str =buff.readLine();
            Iterator itr = students.iterator();
            while (itr.hasNext())
            {

                String[] arr = str.split(" ");
                int id = Integer.parseInt(arr[0]);
                double physics_marks = Double.parseDouble(arr[2]);
                double chemistry_marks = Double.parseDouble(arr[3]);
                double math_marks = Double.parseDouble(arr[4]);
                students.add(new Student(id,arr[1],physics_marks,chemistry_marks,math_marks));

                str=buff.readLine();

                Object elements = itr.next();
                System.out.println();

                str=buff.readLine();
            }
            for (Student s:students)
                System.out.println(students);

        } catch (Exception e) {

            e.printStackTrace();
        }





    }
}
