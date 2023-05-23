import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        try {


            BufferedReader buff1 = new BufferedReader(new FileReader("A.txt"));
            BufferedReader buff2 = new BufferedReader(new FileReader("B.txt"));
            String line1= buff1.readLine();
            String line2= buff2.readLine();
            boolean areEqual =true;
            int lineNum =1;
            while (line1!=null||line2!=null){
                if (line1==null||line2==null){
                    areEqual=false;
                    break;
                }
                else if (!line1.equalsIgnoreCase(line2)){
                    areEqual=false;
                    break;
                }
                line1=buff1.readLine();
                line2=buff2.readLine();
                lineNum++;
            }
            if (areEqual)
                System.out.println("Two files have same contents");
            else
                System.out.println("Two file have different contents");
            buff1.close();
            buff2.close();
        }catch (Exception e )
        {
            e.printStackTrace();
        }

    }
}
