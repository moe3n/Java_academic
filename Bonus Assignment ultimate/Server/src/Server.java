import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception  {
        ServerSocket ss =new ServerSocket(888);
        Socket s=ss.accept();
        System.out.println("connection established");
        PrintStream ps=new PrintStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str,str1;
            while ((str=br.readLine())!=null){
                System.out.println(str);
                if (str.equals("A")) {
                    //str1=kb.readLine();
                    str1="Arsenal";
                    ps.println(str1);
                }
                else if (str.equals("B")){
                    str1="Barcelona";
                    ps.println(str1);

                }
                else if (str.equals("I")){
                    str1="Itali";
                    ps.println(str1);
                }
                else
                    ps.println("Unknown command");
            }
            ps.close();
            br.close();
            kb.close();
            ss.close();
            s.close();
            System.exit(0);
        }
    }
}
