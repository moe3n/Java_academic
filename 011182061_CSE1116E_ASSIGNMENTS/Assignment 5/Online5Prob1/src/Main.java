import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       File f = new File("input.txt");
       File w=new File("output.txt");

        try {
            FileWriter fw = new FileWriter(w);
            FileReader fr = new FileReader(f);
            BufferedReader buff = new BufferedReader(fr);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(fw);
            String str=buff.readLine();
            int flag=0;
            while (str!=null){
                int len=str.length();
                char[] arr = str.toCharArray();

                for (int i=0;i<len;i++){
                    if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                        flag++;
                       // System.out.println(flag);
                    }
                }
                str=buff.readLine();
            }
            buff.close();
            pw.flush();

            pw.println(flag);
            pw.flush();
            pw.close();
            //buff.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
